public int[] singleNumber(int[] nums) 
{
	int [] res = new int [2];
	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 
	
	if(nums.length == 0)
		return nums;
	
	for(int i=0; i<nums.length; i++)
	{
		if(!hm.containsKey(nums[i]))
			hm.put(nums[i], 1);
		else
			hm.put(nums[i],hm.get(nums[i])+1);
	}
	
	int i=0;
	for (Map.Entry n : hm.entrySet()) 
	{
		if((int)n.getValue() == 1)
			res[i++] = (int)n.getKey();
	}
	
	return res;
}