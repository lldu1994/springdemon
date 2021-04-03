package HW.NC70;

import HW.NC78.ListNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    /**
     *
     * @param head ListNode类
     * @param n int整型
     * @return ListNode类
     */
    public ListNode removeNthFromEnd (ListNode head, int n) {
        if(head == null){
            return  null;
        }

        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode right = newNode;
        ListNode left = newNode;

        for(int i = 0; i < n; i++){
            right = right.next;
        }

        while(right.next != null){
            right = right.next;
            left = left.next;
        }

        if(left.next != null){
            left.next = left.next.next;
        }

        return newNode.next;
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode listNode = solution.removeNthFromEnd(node1, 3);
        while (listNode != null) {
            log.info("next=====>{}", listNode.val);
            listNode = listNode.next;
        }
    }
}
