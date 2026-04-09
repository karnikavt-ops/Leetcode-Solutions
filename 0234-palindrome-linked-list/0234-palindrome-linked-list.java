class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        ListNode st = head;
        ListNode en = prev;
        while(en!=null){
            if(st.val != en.val) return false;
        else{
            st = st.next;
            en = en.next;
        }
        }
        return true;
    }
}