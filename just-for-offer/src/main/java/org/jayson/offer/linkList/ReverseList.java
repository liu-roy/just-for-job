package org.jayson.offer.linkList;

public class ReverseList {

    public static void main(String[] args) {
        ListNode preHead = new ListNode(1);
        ListNode preHead2 = new ListNode(2);
        ListNode preHead3 = new ListNode(3);
        ListNode preHead4 = new ListNode(4);
        preHead.next = preHead2;
        preHead2.next = preHead3;
        preHead3.next = preHead4;


    }

    /**
     * 在原数组上
     * @param head
     * @return
     */

    public ListNode reverseList(ListNode head) {

        ListNode curr = head;
        ListNode pre = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    /**
     * 开辟新空间
     * @param head
     * @return
     */
    public ListNode newSpaceReverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newListHead = new ListNode(head.val);
        while (head.next != null) {
            ListNode preHead = new ListNode(head.next.val);
            preHead.next = newListHead;
            newListHead = preHead;
            head = head.next;
        }
        return newListHead;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

