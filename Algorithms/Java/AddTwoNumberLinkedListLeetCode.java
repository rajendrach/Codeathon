/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         if(l1 == null && l2 == null) return null;
      Queue<Integer> s1 = new LinkedList<Integer>();
       Queue<Integer> s2 = new LinkedList<Integer>();
       ListNode returnNode = null;
       ListNode firstNode = null;
       int carry = 0;

       while(l1!=null){
           s1.add(l1.val);
           l1 = l1.next;
       }
       while(l2!=null){
           s2.add(l2.val);
           l2 = l2.next;
       }
       while(s1.peek()!=null || s2.peek()!=null){
           int s1pop = 0;
           int s2pop = 0;
           if(s1.peek()!=null){
            s1pop = (Integer)s1.remove();
           }
           if(s2.peek()!=null){
            s2pop = (Integer)s2.remove();
           }
           int total = s1pop + s2pop + carry;
           if(total >= 10){
               carry = total/10;
               ListNode n = new ListNode(total%10);
               if(returnNode == null){
                   returnNode = n;
                   firstNode = returnNode;
               }else{
                   while(returnNode.next!=null){
                       returnNode= returnNode.next;
                   }
                   returnNode.next = n;
               }
           }else{
               carry = 0;
               ListNode n2 = new ListNode(total);
                if(returnNode == null){
                   returnNode = n2;
                   firstNode = returnNode;
               }else{
                   while(returnNode.next!=null){
                       returnNode= returnNode.next;
                   }
                   returnNode.next = n2;
               }

           }
       }
       if(carry!=0){
         ListNode carryNode =   new ListNode(carry);
         while(returnNode.next!=null){
             returnNode = returnNode.next;
         }
           returnNode.next = carryNode;
       }

       return firstNode;
    }
}
