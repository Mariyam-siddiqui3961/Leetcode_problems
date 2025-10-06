//--------------------Design Stack with Inceremnt-----------------------
class CustomStack {
    private int[] stack;
    private int[] inc;
    private int top;
    private int maxSize;
    
    public CustomStack(int maxSize) {
        this.stack = new int[maxSize];
        this.inc = new int[maxSize];
        this.top = -1;
        this.maxSize = maxSize;
    }
    public void push(int x) {
        if (top + 1 < maxSize) {
            stack[++top] = x;
        }
    }
    
    public int pop() {
        if (top == -1) return -1;
        int res = stack[top] + inc[top];
        
        // propagate increment to below elements
        if (top > 0) {
            inc[top - 1] += inc[top];
        }