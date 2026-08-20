class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode start = head;
        ListNode end = start.next;
        ListNode next = end.next;

        end.next = start;
        start.next = swapPairs(next);
        return end;

        
    }
}