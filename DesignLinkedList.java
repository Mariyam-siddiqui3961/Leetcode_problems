//--------------------Design Linked List-------------------------
class MyLinkedList {

    // Node definition
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    private Node head; // dummy head
    private int size;

    // Initialize
    public MyLinkedList() {
        head = new Node(0); // dummy node
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        Node curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }
