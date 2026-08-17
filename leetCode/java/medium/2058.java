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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minD = Integer.MAX_VALUE;
        int firstNode = -1;
        int maxDNode = -1;
        ListNode curr = head.next;
        ListNode priv = head;
        int a = 0;
        while(curr.next!=null){
            if(curr.val>priv.val && curr.val>curr.next.val || curr.val<priv.val && curr.val<curr.next.val){
                if(firstNode==-1){
                    firstNode = a;
                }else{
                    minD = Math.min(minD , a-maxDNode);
                }
                maxDNode = a;

            }
            priv = curr;
            curr = curr.next;
            a++;
        }
        
        if(minD==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        return new int[]{minD,maxDNode-firstNode};

    }
}