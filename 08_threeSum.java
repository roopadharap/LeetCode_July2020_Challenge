public List<List<Integer>> threeSum(int[] nums) 
{
	List<List<Integer>> lst = new ArrayList<>();
	int i=0, j=0, k=0;
	List<Integer> sLst; 
	
	if(nums.length == 0)
		return lst;
	
	Arrays.sort(nums);
	
	for(i=0; i<nums.length; i++)
	{
		//if values are same, this should avoid dups
		if (i != 0 && nums[i] == nums[i - 1]) 
			continue;
		
		j=i+1;
		k=nums.length-1;
		 
		while(j<k)
		{
			if(nums[i] + nums[j] + nums[k] == 0)
			{
				sLst = new ArrayList<>();
				sLst.add(nums[i]);
				sLst.add(nums[j]);
				sLst.add(nums[k]);
				lst.add(sLst);
				++j;
				
				//if values are same, this should avoid dups
				while (j < k && nums[j] == nums[j-1]) 
				{
					++j;
				}
			}
			else if(nums[i] + nums[j] + nums[k] < 0)
			{
				++j;
			}
			else
			{
				--k;
			}
		}
	}

	return lst;
}