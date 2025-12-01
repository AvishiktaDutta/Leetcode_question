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
    public ListNode deleteDuplicates(ListNode head) {
         if(head == null || head.next == null){
            return head;
        } 

        ListNode currNode = head;
        ListNode temp = new ListNode(-1);
        temp.next = head;
         ListNode prev = temp;

        while(currNode!= null && currNode.next != null){
            if(currNode.val == currNode.next.val){
                while(currNode.next!= null && currNode.val == currNode.next.val){
                    currNode = currNode.next;
                }
            prev.next = currNode.next;
        }
        else{
            prev = prev.next;
        }
        currNode = currNode.next;
        }
     return temp.next;
    }
}