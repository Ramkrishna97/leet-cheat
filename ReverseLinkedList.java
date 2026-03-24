/*
206: Reverse Linked List

Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.

Example 1:
Input: head = [0,1,2,3]
Output: [3,2,1,0]

Example 2:
Input: head = []
Output: []

Constraints:

    0 <= The length of the list <= 1000.
    -1000 <= Node.val <= 1000

    

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 

*/

public class ReverseLinkedList {
    public static void main(String[] args) {
    }
    public static ListNode reverseList(ListNode head) {

        //Optimal approach: 
        //new LL is null , for a non-empty LL, 
        // temp next -> current head's next ;
        //  head's next ->null; 
        // current head -> temp next; 
        // It's like :  
        {
        ListNode prev = null; // Pointer to the previous node (starts as null)
        ListNode curr = head; // Pointer to the current node (starts at head)

        while (curr != null) {
            ListNode nextTemp = curr.next; // 1. Save the next node before overwriting curr.next
            curr.next = prev;              // 2. Reverse the 'next' pointer to point to the previous node
            prev = curr;                   // 3. Move 'prev' pointer forward to the current node
            curr = nextTemp;               // 4. Move 'curr' pointer forward to the saved next node
        }
        
        return prev; // 'prev' will be the new head of the reversed list at the end
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
