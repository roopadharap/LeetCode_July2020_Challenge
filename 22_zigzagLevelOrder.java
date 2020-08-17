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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        
        if(root == null)
            return lst;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> subLst = new ArrayList<Integer>();
        
        boolean left = true;
        
        q.offer(root);
        q.offer(null);
        
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            
            if(temp == null)
            {
                if(left)
                {
                    lst.add(subLst);
                    subLst = new ArrayList<Integer>();
                }
                else
                {
                    Stack<Integer> s = new Stack<>();
                    s.addAll(subLst);
                    subLst = new ArrayList<Integer>();
                    while(!s.isEmpty())
                        subLst.add(s.pop());
                    
                    lst.add(subLst);
                    subLst = new ArrayList<Integer>();
                }
                
               if(!q.isEmpty())
                {
                    left = !left;
                    q.offer(null);
                }
            }
            else
            {
                subLst.add(temp.val);                
                
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
                
            }
        }
        
        return lst;
        
    }
}