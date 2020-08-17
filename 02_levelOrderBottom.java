public List<List<Integer>> levelOrderBottom(TreeNode root) 
{
	List<List<Integer>> lst =new ArrayList<>();
	Queue<TreeNode> q=new LinkedList<>();
	
	if(root==null)
		return lst;
	
	q.add(root);
	while(!q.isEmpty())
	{
		List<Integer> level=new ArrayList<>();
		int len=q.size();
		for(int i=0; i<len; i++)
		{
			TreeNode curr=q.poll();
			level.add(curr.val);
			
			if(curr.left!=null)
				q.offer(curr.left);
			if(curr.right!=null)
				q.offer(curr.right);
		}
		lst.add(0,level);
	}
	return lst;
}
