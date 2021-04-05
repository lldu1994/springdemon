package HW.NC33;

import HW.NC78.ListNode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    /**
     *
     * @param l1 ListNode类
     * @param l2 ListNode类
     * @return ListNode类
     */
    public ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode mergeNode = new ListNode(0);
        ListNode p1 = mergeNode;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                p1.next = l1;
                l1 = l1.next;
                p1 = p1.next;

            }else{
                p1.next = l2;
                l2 = l2.next;
                p1 = p1.next;
            }
        }

        if(l1 == null){
            p1.next =l2;
        }
        if(l2 == null){
            p1.next= l1;
        }

        return mergeNode.next;
    }

    public static void main(String[] args) {
        Solution solution  = new Solution();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);


        ListNode listNode = solution.mergeTwoLists(node2, node1);
        while (listNode != null) {
            log.info("next=====>{}", listNode.val);
            listNode = listNode.next;
        }
    }
}
