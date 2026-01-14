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