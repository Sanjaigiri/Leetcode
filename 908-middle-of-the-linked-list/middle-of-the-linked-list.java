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
    public ListNode middleNode(ListNode head) {
       ListNode temp=head;
       int count =0;
       while(temp != null){
        temp=temp.next;
        count++;
       }
       int res=count/2;
       temp=head;
       for(int j=0;j<res;j++){
         temp=temp.next;
       }
       return temp;

    }
}