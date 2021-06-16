package leetcode;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class medium {
    /*
        Title: Deepest Leaves Sum
        Solution: Given the root of a binary tree, return the sum of values of its deepest leaves.
        Time Complexity: O(n)
        Space Complexity: O(n)
        Link: https://leetcode.com/problems/deepest-leaves-sum/
     */
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList();
        int sum = 0;
        if(root != null) bfs.add(root);

        while(!bfs.isEmpty()){
            int count = bfs.size();
            int level_sum = 0;

            for(int i = 0; i < count; i++){
                TreeNode tmp = bfs.poll();
                level_sum += tmp.val;

                if(tmp.left != null) bfs.add(tmp.left);
                if(tmp.right != null) bfs.add(tmp.right);
            }

            sum = level_sum;
        }
        return sum;
    }
}
