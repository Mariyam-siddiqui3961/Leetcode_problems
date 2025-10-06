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