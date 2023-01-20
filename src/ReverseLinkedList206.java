/*
Given the head of a singly linked list, reverse the list, and return the reversed list.
 */

public class ReverseLinkedList206 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedList = reverseList(head);
        ListNode headOfListToPrint = reversedList;

        while(headOfListToPrint != null) {
            System.out.println(headOfListToPrint);
            headOfListToPrint = headOfListToPrint.next;
        }
    }

    static ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode copyOfTheHead = head;

        while(copyOfTheHead != null) {
            ListNode nextNode = copyOfTheHead.next;
            copyOfTheHead.next = result;
            result = copyOfTheHead;
            copyOfTheHead = nextNode;
        }

        return result;
    }
}
