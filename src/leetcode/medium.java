package leetcode;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class medium {
    /*
        Title: Deepest Leaves Sum
        Solution: Given the root of a binary tree, return the sum of values of its deepest leaves.
        Time Complexity: O(n)
        Space Complexity: O(n)
        Link: https://leetcode.com/problems/deepest-leaves-sum/
     */
    public int idx_1302_0(TreeNode root) {
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

    /*
        Title: Binary Tree Right Side View
        Solution: Given the root of a binary tree, imagine yourself standing on the right side of it,
                  return the values of the nodes you can see ordered from top to bottom.
        Time Complexity: O(n)
        Space Complexity: O(n)
        Link: https://leetcode.com/problems/binary-tree-right-side-view/
     */
    public List<Integer> idx_199_0(TreeNode root) {
        List<Integer> res = new ArrayList();
        Queue<TreeNode> bfs = new LinkedList();
        if(root != null) bfs.add(root);

        while(!bfs.isEmpty()){
            int count = bfs.size();

            for(int i = 0; i < count; i++){
                TreeNode tmp = bfs.poll();

                if(i == count - 1) res.add(tmp.val);
                if(tmp.left != null) bfs.add(tmp.left);
                if(tmp.right != null) bfs.add(tmp.right);
            }
        }
        return res;
    }
}
