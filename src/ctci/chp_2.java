package ctci;

import utils.ListNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class chp_2 {

    public ListNode delete_duplicates_2_dot_1(ListNode head) {
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
}
