class Solution {

    // Step 1: Define Node
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean checkOnesSegment(String s) {

        // Step 2: Build Linked List
        Node head = null, tail = null;

        for (char c : s.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Step 3: Traverse and check condition
        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data == '1' && prev.data == '0') {
                return false;
            }
            prev = curr;
            curr = curr.next;
        }

        return true;
    }
}