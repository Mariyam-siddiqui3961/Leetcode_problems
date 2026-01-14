//---------------------Seperate Square--------------------------
class Solution {

    // Event for sweep line
    static class Event {
        long y;
        int l, r;
        int type; // +1 start, -1 end

        Event(long y, int l, int r, int type) {
            this.y = y;
            this.l = l;
            this.r = r;
            this.type = type;
        }
    }

    long[] xs;          // compressed x coordinates
    long[] covered;     // covered length in segment tree
    int[] count;        // coverage count
    int m;

    public double separateSquares(int[][] squares) {
        int n = squares.length;

        // Step 1: collect x-coordinates
        long[] coords = new long[2 * n];
        List<Event> events = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            long x1 = squares[i][0];
            long x2 = x1 + squares[i][2];
            long y1 = squares[i][1];
            long y2 = y1 + squares[i][2];

            coords[2 * i] = x1;
            coords[2 * i + 1] = x2;

            events.add(new Event(y1, 0, 0, +1));
            events.add(new Event(y2, 0, 0, -1));
        }

        // Step 2: coordinate compression on x
        Arrays.sort(coords);
        xs = Arrays.stream(coords).distinct().toArray();
        m = xs.length - 1;

        // Fill event x-intervals
        int idx = 0;
        for (int i = 0; i < n; i++) {
            long x1 = squares[i][0];
            long x2 = x1 + squares[i][2];

            int l = Arrays.binarySearch(xs, x1);
            int r = Arrays.binarySearch(xs, x2);

            events.get(idx).l = l;
            events.get(idx).r = r - 1;
            idx++;

            events.get(idx).l = l;
            events.get(idx).r = r - 1;
            idx++;
        }

        // Step 3: sort events by y
        events.sort(Comparator.comparingLong(e -> e.y));

        covered = new long[4 * m];
        count = new int[4 * m];

        // Step 4: compute total area
        long prevY = events.get(0).y;
        long totalArea = 0;

        for (Event e : events) {
            long dy = e.y - prevY;
            totalArea += covered[1] * dy;
            update(1, 0, m - 1, e.l, e.r, e.type);
            prevY = e.y;
        }

        // Step 5: find split line
        double half = totalArea / 2.0;

        Arrays.fill(covered, 0);
        Arrays.fill(count, 0);

        prevY = events.get(0).y;
        double currArea = 0;

        for (Event e : events) {
            double dy = e.y - prevY;
            double slice = covered[1] * dy;

            if (currArea + slice >= half) {
                return prevY + (half - currArea) / covered[1];
            }

            currArea += slice;
            update(1, 0, m - 1, e.l, e.r, e.type);
            prevY = e.y;
        }

        return prevY;
    }

    // Segment tree update
    private void update(int node, int l, int r, int ql, int qr, int val) {
        if (ql > r || qr < l) return;

        if (ql <= l && r <= qr) {
            count[node] += val;
        } else {
            int mid = (l + r) / 2;
            update(node * 2, l, mid, ql, qr, val);
            update(node * 2 + 1, mid + 1, r, ql, qr, val);
        }

        if (count[node] > 0) {
            covered[node] = xs[r + 1] - xs[l];
        } else if (l != r) {
            covered[node] = covered[node * 2] + covered[node * 2 + 1];
        } else {
            covered[node] = 0;
        }
    }
}
