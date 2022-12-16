import java.util.Arrays;

public class MergeTwoSortedLists21 {
    /*
    You are given the heads of two sorted linked lists list1 and list2.

    Merge the two lists in a one sorted list.
    The list should be made by splicing together the nodes of the first two lists.

    Return the head of the merged linked list.
     */
    public static void main(String[] args) {
        ListNode exampleList1 = new ListNode(1);
        exampleList1.next = new ListNode(2);
        exampleList1.next.next = new ListNode(4);
        ListNode exampleList2 = new ListNode(1);
        exampleList2.next = new ListNode(3);
        exampleList2.next.next = new ListNode(4);

        ListNode mergedList = new ListNode();
        mergedList = mergeTwoLists(exampleList1, exampleList2);
        while(mergedList != null) {
            System.out.println(mergedList);
            mergedList = mergedList.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resultNode = new ListNode();
        ListNode resultHead = resultNode;

        while(true) {
            //if one of the lists is empty, point the rest of the second list
            if (list1 == null) {
                resultNode.next = list2;
                break;
            } else if (list2 == null) {
                resultNode.next = list1;
                break;
            }

            if (list1.val >= list2.val) {
                resultNode.next = list2;
                list2 = list2.next;
            } else {
                resultNode.next = list1;
                list1 = list1.next;
            }

            resultNode = resultNode.next;
        }

            return resultHead.next;
        }
    }

class ListNode {
    int val;
    ListNode next;

    ListNode() { }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" + val + '}';
    }
}
