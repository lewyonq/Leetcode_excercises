public class RemoveDuplicatesFromSortedList83 {
    public static void main(String[] args) {

    }

    static ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode node = head;

        while (node.next != null) {
            if(isNextNodeDuplicate(node, node.next)) {
                ListNode temp = node.next.next;
                node.next = temp;
            } else {
                node = node.next;
            }
        }

        return head;
    }

    static boolean isNextNodeDuplicate(ListNode node, ListNode nextNode) {
        if(node.val == nextNode.val) {
            return true;
        }
        return false;
    }
}
