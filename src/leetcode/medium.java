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

    /*
        Title: Balance a Binary Search Tree
        Solution: Given a binary search tree, return a balanced binary search tree with the same node values.
                  A binary search tree is balanced if and only if the depth of the two subtrees of every node never differ by more than 1.
                  If there is more than one answer, return any of them.
        Time Complexity: O(n)
        Space Complexity: O(n)
        Link: https://leetcode.com/problems/balance-a-binary-search-tree/
     */
    public class idx_1382_0 {
        public TreeNode balanceBST(TreeNode root) {
            List<TreeNode> sto = new ArrayList();
            dfs(root, sto);
            return bsearch(sto, 0, sto.size()-1);
        }

        private void dfs(TreeNode root, List<TreeNode> sto){
            if(root == null) return;

            if(root.left != null) dfs(root.left, sto);
            sto.add(root);
            if(root.right != null) dfs(root.right, sto);
        }

        private TreeNode bsearch(List<TreeNode> sto, int start, int end) {
            if (start > end) return null;

            int mid = start + (end - start) / 2;
            TreeNode root = sto.get(mid);

            root.left = bsearch(sto, start, mid - 1);
            root.right = bsearch(sto, mid + 1, end);
            return root;
        }
    }
}
