/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        int lengthA = 1;
        int lengthB = 1;
        int diff = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1.next != null){
            temp1 = temp1.next;
            lengthA++;
        }
         while(temp2.next != null){
            temp2 = temp2.next;
            lengthB++;
        }
        if(lengthA > lengthB){
            diff = lengthA - lengthB;
            int i = 0;
            while(i<diff){
                headA = headA.next;
                i++;
            }
        }else {
            diff = lengthB - lengthA;
            int i = 0;
            while(i<diff){
                headB = headB.next;
                i++;
            }
        }
            while(headA != null && headB != null){
                if(headA.val == headB.val){
                    return headA;
                }
            headA = headA.next;
            headB = headB.next;
            }
           
    
    return null;
}
}
