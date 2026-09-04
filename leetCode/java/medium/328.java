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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        ListNode curr2 = head.next;
        ListNode evenHead = curr2;
        while(curr2!=null && curr2.next!=null){
            curr.next = curr2.next;
            curr = curr.next;
            curr2.next = curr.next;
            curr2 = curr2.next;
            // if(curr2==null)break;
            // if(curr==null)break;
        }
        
        curr.next = evenHead;
        
     
        return head;
       
    }
}