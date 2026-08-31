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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode s = new ListNode(-1);
        
        int g =0;
        while(temp!=null){
            g++;
            temp = temp.next;
        }
        System.out.print(g);
        s.next = head;
        temp = s;
        g++;
        while(temp!=null){
            g--;
            if(g==n){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return s.next;
    }
}