/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.
 */

public class MiddleOfTheLinkedList876 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        ListNode n3 = new ListNode(3);
        n2.next = n3;
        System.out.println(middleNode(n1).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode node = head;
        int length = 0;
        int middleNodeIndex = 0;

        while(node != null) {
            node = node.next;
            length++;
        }

        middleNodeIndex = (int) (length / 2) + 1;

        for(int i = 1; i < middleNodeIndex; i++) {
            head = head.next;
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}


