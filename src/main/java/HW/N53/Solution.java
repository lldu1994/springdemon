package HW.N53;

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
        // write code here
        if(head == null || n <= 0){
            return head;
        }

        ListNode p1 = head;
        ListNode p2 = head;
        for(int i=0; i<n; i++){
            if(p1 != null){
                p1 = p1.next;
            }
        }
        while(p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p2 = p2.next;
        return p2;

    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        // write code here
        if(head == null){
            return  null;
        }


        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode right = newNode;
        ListNode left = newNode;

        for(int i =0; i<n; i++){
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
        node1.next = node2;

        ListNode listNode = solution.removeNthFromEnd1(node1, 1);
        while (listNode != null) {
            log.info("next=====>{}", listNode.val);
            listNode = listNode.next;
        }
    }
}
