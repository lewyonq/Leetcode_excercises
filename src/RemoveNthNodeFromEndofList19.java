import java.util.List;

/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
public class RemoveNthNodeFromEndofList19 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        ListNode n4 = new ListNode(4);
        n3.next = n4;
        ListNode n5 = new ListNode(5);
        n4.next = n5;

        ListNode head = removeNthFromEnd(n1, 2);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0, head);
        ListNode left = temp;
        ListNode right = head;

        while(n > 0) {
            right = right.next;
            n -= 1;
        }

        while(right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return temp.next;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
}
