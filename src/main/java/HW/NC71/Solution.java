package HW.NC71;

import HW.NC78.ListNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    public static ListNode addInList(ListNode head1, ListNode head2) {
        // write code here
        if (head1 == null && head2 == null) {
            return null;
        }
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode addNode = new ListNode(0);
        ListNode p = addNode;
        int jinwei  = 0;
        while (head1 != null || head2 != null) {
            int total = jinwei;
            if (head1 != null) {
                total += head1.val;
                head1 = head1.next;
            }
            if (head2 != null) {
                total += head2.val;
                head2 = head2.next;
            }
            total += p.val;
            p.next = new ListNode(total % 10);
            jinwei = total / 10;
            p = p.next;
        }
        if (jinwei > 0) {
            p.next = new ListNode(jinwei);
        }

        return reverse(addNode);
    }

    public static ListNode reverse(ListNode head) {

        ListNode preNode = null;
        ListNode nextNode = null;

        while (head != null && head.next != null) {
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        head.next = preNode;
        return head;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(9);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(7);
        node1.next = node2;
        node2.next = node3;


        ListNode node4 = new ListNode(6);
        ListNode node5 = new ListNode(3);
        node4.next = node5;

        ListNode listNode = addInList(node1, node4);
        while (listNode != null) {
            log.info("next=====>{}", listNode.val);
            listNode = listNode.next;
        }
    }
}
