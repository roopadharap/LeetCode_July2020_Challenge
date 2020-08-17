public List<List<Integer>> subsets(int[] nums) 
{
	List<List<Integer>> lst = new ArrayList();
	
	lst.add(new ArrayList());
	
	for(int i=0; i<nums.length; i++) 
	{
		int lstSize = lst.size();
		for(int j = 0; j < lstSize; j++) 
		{
			List<Integer> sLst = new ArrayList(lst.get(j));
			sLst.add(nums[i]);
			lst.add(sLst);
		}
	}
	
	return lst;
}