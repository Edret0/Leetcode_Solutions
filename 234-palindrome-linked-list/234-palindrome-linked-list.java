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
    public boolean isPalindrome(ListNode head) {
        
        ArrayList<Integer> ex = new ArrayList<Integer>();
        
        while(head != null){
            ex.add(head.val);
            head = head.next;
        }
        
        int start = 0, end = ex.size()-1;
        while(start < end){
            if(ex.get(start) == ex.get(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}