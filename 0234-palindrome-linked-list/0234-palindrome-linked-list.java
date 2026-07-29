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
    public boolean isPalindrome(ListNode head) {
        //Find middle node
        ListNode slow = head;
        ListNode fast = head;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Reverse 2nd half
        ListNode cur = slow;
        ListNode prev = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur =  next;
        }
        //Compare elements
        ListNode l1 = head; 
        ListNode l2 = prev;
        while(l2 != null){
            if(l1.val != l2.val)
                return false;
            else{
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return true;
    }
}