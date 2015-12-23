/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next == null) return head;
        ListNode returnNode = head.next;
        head.next = null;
        while(true){
            if(returnNode.next == null){
                returnNode.next = head;
                return returnNode;
            }
            ListNode n = returnNode.next;
            returnNode.next = head;
            head = returnNode;
            returnNode = n;
        }
    }
}
