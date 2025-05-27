public class SortedLinkedList extends LinkedList {

    public void sortList() {
        this.head = mergeSort(this.head);
    }

    private Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middle = getMiddle(node);
        Node nextToMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(node);
        Node right = mergeSort(nextToMiddle);

        return merge(left, right);
    }

    private Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;

        if (left.data.compareTo(right.data) <= 0) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    private Node getMiddle(Node node) {
        if (node == null) return node;

        Node slow = node;
        Node fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
