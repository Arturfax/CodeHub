public class SortedLinkedList extends LinkedList {
        public static <T extends Number & Comparable<T>> void sortList(LinkedList<T> list) {
            list.head = mergeSort(list.head);
        }

        private static <T extends Number & Comparable<T>> LinkedList<T>.Node mergeSort(LinkedList<T>.Node node) {
            if (node == null || node.next == null) {
                return node;
            }

            LinkedList<T>.Node middle = getMiddle(node);
            LinkedList<T>.Node nextToMiddle = middle.next;
            middle.next = null;

            LinkedList<T>.Node left = mergeSort(node);
            LinkedList<T>.Node right = mergeSort(nextToMiddle);

            return merge(left, right);
        }

        private static <T extends Number & Comparable<T>> LinkedList<T>.Node merge(
                LinkedList<T>.Node left, LinkedList<T>.Node right) {

            if (left == null) return right;
            if (right == null) return left;

            LinkedList<T>.Node result;

            if (left.data.compareTo(right.data) <= 0) {
                result = left;
                result.next = merge(left.next, right);
            } else {
                result = right;
                result.next = merge(left, right.next);
            }

            return result;
        }

        private static <T extends Number & Comparable<T>> LinkedList<T>.Node getMiddle(LinkedList<T>.Node node) {
            if (node == null) return node;

            LinkedList<T>.Node slow = node;
            LinkedList<T>.Node fast = node.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

    }

