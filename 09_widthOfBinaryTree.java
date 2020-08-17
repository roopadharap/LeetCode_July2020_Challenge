/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;
        
        int maxVal = 0, qSize;
        LinkedList<Pair<TreeNode,Integer>> q = new LinkedList<Pair<TreeNode,Integer>>();
        q.offer(new Pair(root, 1));
        maxVal = 1;
        
        while(!q.isEmpty())
        {
            qSize = q.size();
            
            maxVal = Math.max(maxVal, (q.peekLast().getValue() - q.peekFirst().getValue()) + 1);
            
            for(int i=0; i<qSize; i++)
            {
                Pair<TreeNode, Integer> temp = q.poll();
                TreeNode node = temp.getKey();
                Integer v = temp.getValue();
                
                if(node.left != null)
                {
                    //temp.left.val = temp.val * 2;
                    q.offer(new Pair(node.left, v * 2));
                }
                
                if(node.right != null)
                {
                    //temp.right.val = temp.val * 2 + 1;
                    q.offer(new Pair(node.right, v * 2 + 1));
                }
            }
        }
        
        return maxVal;
    }
}