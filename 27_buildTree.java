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
    int ind;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length != postorder.length)
            return null;
        
        ind = inorder.length;
        
        HashMap<Integer, Integer> hm = new HashMap<>(inorder.length);
        
        for(int i=0; i<inorder.length; i++)
            hm.put(inorder[i],i);
        
        return buildTreeRec(inorder, postorder, 0, inorder.length-1, hm);
    }
    
    public TreeNode buildTreeRec(int[] inorder, int[] postorder, int start, int end, HashMap<Integer, Integer> hm)
    {
        if(start == end)
        {   
            ind--;
            return new TreeNode(postorder[ind]);
        }
        
        if(start > end)
            return null;
        
        ind--;
        int rootInd = hm.get(postorder[ind]);
        
        TreeNode root = new TreeNode(inorder[rootInd]);
        
        root.right = buildTreeRec(inorder, postorder, rootInd + 1, end, hm);
        root.left = buildTreeRec(inorder, postorder, start, rootInd - 1, hm);
        
        return root;
    }
}