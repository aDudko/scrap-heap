package main.java.medium.delete_the_middle_node_of_a_linked_list;

public class Solution {
    public static void main(String[] args) {
        ListNode test1 = new ListNode(1, new ListNode(3, new ListNode(4, new ListNode(7, new ListNode(1, new ListNode(2, new ListNode(6)))))));
        printList(deleteMiddle(test1));
        ListNode test2 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        printList(deleteMiddle(test2));
        ListNode test3 = new ListNode(2, new ListNode(1));
        printList(deleteMiddle(test3));
    }

    public static void printList(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.val + " -> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode prev = head, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}
