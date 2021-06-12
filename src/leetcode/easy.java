package leetcode;

import utils.ListNode;

public class easy {

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
}
