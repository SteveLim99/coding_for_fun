package ctci;

import utils.ListNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class chp_2 {

    /*
        Usage of a map to mantain occurence and a queue to mantain the order of elements within the linked list.
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    public ListNode delete_duplicates_2_dot_1_0(ListNode head) {
        Map<Integer, Integer> map = new HashMap();
        Queue<Integer> queue = new LinkedList();

        while (head != null){
            int curr = head.val;
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            queue.add(curr);
            head = head.next;
        }

        ListNode res = new ListNode(-1);
        ListNode pointer = res;

        while (!queue.isEmpty()){
            int curr = queue.poll();
            if(map.get(curr) == 1){
                pointer.next = new ListNode(curr);
                pointer = pointer.next;
            }
        }

        return res.next;
    }

    /*
        Avoid the need of using a queue to mantain order as we could simply store occurence in a hashmap and then re-create the linked list.
        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    public ListNode delete_duplicates_2_dot_1_1(ListNode head) {
        Map<Integer, Integer> map = new HashMap();
        ListNode pointer = head;

        while (pointer != null){
           int curr = pointer.val;
           map.put(curr, map.getOrDefault(curr, 0) + 1);
           pointer = pointer.next;
        }

        ListNode res = new ListNode(-1);
        ListNode res_pointer = res;

        while (head != null){
            int curr = head.val;

            if (map.get(curr) == 1) {
                res_pointer.next = new ListNode(curr);
               res_pointer = res_pointer.next;
            }

            head = head.next;
        }

        return res.next;
    }
}
