public class LinkedList<T extends Comparable<T>> {
    private class Node {
        private T data;
        private Node next;

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private int size;
    private String name;
    private Node head;

    public void add(T toAdd) {
        Node currNode = head;
        if (currNode == null) {
            head = new Node(toAdd, null);
            return;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = new Node(toAdd, null);
    }

    public void removeOddPosition() {
        if (head == null) return;
        removeOddPosition(head, head, 0);
    }

    public void removeOddPosition(Node currNode, Node prevNode, int index) {
        if (currNode == null)
            return;
        if (index % 2 == 0) {
            if (currNode.next == null) prevNode.next = null;
            else if (currNode == head) head = head.next;
            else prevNode.next = currNode.next;
            removeOddPosition(currNode.next, currNode.next, index + 1);
        }
	    else
            removeOddPosition(currNode.next, currNode, index + 1);
    }

    public void removeLastIfEqualFirst() {
        if (head == null || head.next == null) return;
        Node prev = helper(head, head, head);
        prev.next = prev.next.next;
    }
    public Node helper(Node curr, Node prev, Node head) {
        if (curr.next == null && curr.data == head.data)
            return prev;
        else
            return helper(curr.next, curr, head);
    }

    public void reverseList() {
        Node prev = null;
        Node currNode = head;
        Node next = null;

        while (currNode != null) {
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        head = prev;
    }

    public String toString() {
        Node currNode = head;
        String s = "";
        while (currNode != null) {
            s += currNode.data.toString();
            currNode = currNode.next;
        }
        return s;
    }

}
