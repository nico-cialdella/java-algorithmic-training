public class MergedLists {
    public ListNode mergeSortedLists(ListNode list1, ListNode list2) {
        /* dummy is a "fake" node that we need only to initialize the merged list, 
        and then to easily return the head by returning dummy.next. */
        ListNode dummy = new ListNode(-1);
        
        // tail is a pointer continuously moving ahead to attach new nodes to the merged list.
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }

        }
        if (list1 != null && list2 == null) {
            tail.next = list1;
        } else if (list1 == null && list2 != null) {
            tail.next = list2;
        }
        return dummy.next;
    }

    public static void main(String[] args) throws Exception {
        // Test case
        ListNode list1Node = new ListNode(1);
        list1Node.next = new ListNode(2);
        list1Node.next.next = new ListNode(4);
        ListNode list2Node = new ListNode(1);
        list2Node.next = new ListNode(3);
        list2Node.next.next = new ListNode(4);

        MergedLists solver = new MergedLists();
        ListNode mergedList = solver.mergeSortedLists(list1Node, list2Node);

        System.out.println("Merged list: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " => ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}
