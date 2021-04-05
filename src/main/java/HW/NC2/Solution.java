package HW.NC2;

import HW.NC78.ListNode;

public class Solution {

    //对于给定的单链表{10,20,30,40}，将其重新排序为{10,40,20,30}.
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode after = slow.next;
        slow.next = null;
        ListNode pre = null;
        while (after != null) {
            ListNode temp = after.next;
            after.next = pre;
            pre = after;
            after = temp;
        }

        ListNode first = head;
        after = pre;
        while (first != null && after != null) {
            ListNode ftemp =first.next;
            ListNode aftemp = after.next;
            first.next = after;
            first = ftemp;
            after .next = first;
            after = aftemp;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        ListNode node5 = new ListNode(50);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        solution.reorderList(node1);
    }
}
