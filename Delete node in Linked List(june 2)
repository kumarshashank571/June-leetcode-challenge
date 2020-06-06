* public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    //-- the head and the tail node is not given in this linked list
    //-- so we have to use method other method than traversal
    public void deleteNode(ListNode node) {
      
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
        temp.next = null;
        
    }
}
