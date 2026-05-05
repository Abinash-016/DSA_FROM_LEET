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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        int count = 1;
        ListNode temp = head;
        
        // Find length and last node
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        
        // Form circular LL
        temp.next = head;
        
        // Normalize k
        k = k % count;
        k = count - k;
        
        // Move to new tail
        while (k-- > 0) {
            temp = temp.next;
        }
        
        // New head = next of temp
        head = temp.next;
        temp.next = null; // break circle
        
        return head;
    }
}
