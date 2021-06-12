package leetcode;

import utils.ListNode;

import java.util.HashMap;
import java.util.Map;

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

    /*
        Title: Two Sum
        Solution: Sliding window with varying window sizes to find the two indices which adds up to target
        Time Complexity: O(log n)
        Space Complexity: O(1)
        Link: https://leetcode.com/problems/two-sum/
     */
    private static int[] idx_1_0(int[] nums, int target){
        int window_size = 1, res = -1;

        while(window_size != nums.length){
            for(int i = window_size; i < nums.length; i++){
                if(nums[i] + nums[i - window_size] == target) {
                    res = i;
                    break;
                }
            }
            if(res != -1) break;
            window_size++;
        }

        return new int[]{res - window_size, res};
    }

    /*
        Title: Two Sum
        Solution: Using a hash map to store elements in the list and their corresponding indices, then using hash map to check for presence
                  of a complement. This gives drawbacks to both performance and space complexity.
        Time Complexity: O(n)
        Space Complexity: O(n)
        Link: https://leetcode.com/problems/two-sum/
     */
    private static int[] idx_1_1(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap();
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int complement = target - curr;

            if(map.containsKey(complement)){
                res[0] = map.get(complement);
                res[1] = i;
                break;
            }
            map.put(curr, i);
        }

        return res;
    }
}
