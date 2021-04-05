package HW.NC24;

import HW.NC78.ListNode;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Solution {
    /**
     *
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates (ListNode head) {
        // write code here
        if(head == null || head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode p3 = new ListNode(0);
        p3.next =head;
        Set<String> set =  new HashSet();
        while(p1!= null && p1.next != null){
            if(!set.add(String.valueOf(p1.val))){
                while(p2 != null && p2.val == p1.val){
                    p2 = p2.next;
                }
                p3.next = p2;
                p2 = p2.next;
            }else{
                p2 =  head;
                p1 = p1.next;
            }
        }
        return p3.next;

    }

    public static void main(String[] args) {
        Solution solution  = new Solution();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        node1.next =node2;
        node2.next =node3;

        ListNode listNode = solution.deleteDuplicates1(node1);
        while (listNode != null) {
            log.info("next=====>{}", listNode.val);
            listNode = listNode.next;
        }
    }

    public ListNode deleteDuplicates1 (ListNode head) {
        // write code here
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode first = dummyHead;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                int value = head.val;
                while (head != null && head.val == value) {
                    head = head.next;
                }
                first.next = head;
            }else {
                first = head;
                head = head.next;
            }
        }
        return dummyHead.next;
    }
}
