package HW.NC78;

import lombok.extern.slf4j.Slf4j;

/**
 * 输入一个链表，反转链表后，输出新链表的表头
 */
@Slf4j
public class Solution {
    public static ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode nex = null;
        while (head.next != null) {
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        head.next = pre;
        return head;

    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode listNode = ReverseList1(node1);
        while (listNode != null) {
            log.info("next=====>{}", listNode.val);
            listNode = listNode.next;
        }
        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        mergeTwoLists(node5,node6);

    }


    public static ListNode ReverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode nextNode = null;
        ListNode curNode = null;

        while (head.next != null) {
            nextNode = head.next;
            head.next = curNode;
            curNode = head;
            head = nextNode;
        }

        head.next = curNode;
        return head;
    }

    public static ListNode mergeTwoLists (ListNode l1, ListNode l2) {
        // write code here
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode mergeNode = new ListNode(0);
        ListNode p =mergeNode;
        while(l1!=null && l2!=null){
            if(l1.val<= l2.val){
                p.next =l1;
                p= p.next;
                l1 =l1.next;
            }else{
                p.next =l2;
                p=p.next;
                l2=l2.next;
            }
        }
        if(l1!=null){
            p.next =l1;
        }

        if(l2!=null){
            p.next =l2;
        }

        return mergeNode.next;
    }



}
