/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head==null || head.next==null)
            return head;
        ListNode temp = head;
        int cnt = 1;
        while(temp.next != null){
            cnt++;
            temp = temp.next;
        }
        k = k%cnt;
        int steps = cnt - k;
        temp.next = head;
        ListNode tail = temp.next;
        for(int i=1 ; i<steps;i++){
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;
    }
}