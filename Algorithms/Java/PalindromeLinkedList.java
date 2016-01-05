/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null) return true;
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count%2==0){
            Stack<Integer> st = new Stack<Integer>();
            int j=0;
            while(j<count/2){
                st.push(head.val);
                head = head.next;
                j++;
            }
            while(!st.empty()){
                if(head!=null && head.val==st.pop()){
                    head=head.next;
                }else{
                    return false;
                }
            }
            return true;
        }else{
            Stack<Integer> st = new Stack<Integer>();
            int j=0;
            while(j<=count/2){
                st.push(head.val);
                head = head.next;
                j++;
            }
            st.pop();
            while(!st.empty()){
                
                if(head!=null && head.val==st.pop()){
                    head=head.next;
                }else{
                    return false;
                }
            }
            return true;
        }
    }
}
