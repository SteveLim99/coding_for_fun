package leetcode;

import utils.ListNode;

public class easy {

    /*
        Title: Remove Duplicates from Sorted Array
        Solution: Alter head of array with non-duplicates
        Time Complexity: O(n)
        Space Complexity: O(1)
        Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
     */
    private static int idx_26(int[] nums) {
        int idx = 1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    /*
        Title: Reverse Linked List
        Solution: Create a new linked list and use a pointer to reference to new head of new linked list and finally return the final head.
        Time Complexity: O(n)
        Space Complexity: O(n)
        Link: https://leetcode.com/problems/reverse-linked-list/
     */
    private static ListNode idx_206(ListNode head){
        ListNode res = null;
        if(head != null){
            res = new ListNode(head.val);
            head = head.next;
        }

        while(head != null){
            ListNode tmp = new ListNode(head.val);
            tmp.next = res;
            res = tmp;
            head = head.next;
        }

        return res;
    }

    /*
        Title: Delete Node in a Linked List
        Solution: Change value of current node to value of next node and change reference to next node to node after next node
        Time Complexity: O(1)
        Space Complexity: O(1)
        Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
     */
    private static void idx_237(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
