public int[] topKFrequent(int[] nums, int k) 
{
	if(nums.length == 0 || nums.length == k)
		return nums;
	
	HashMap<Integer, Integer> hm = new HashMap<>();
	int [] res = new int[k];
	
	for(int i=0; i<nums.length; i++)
		hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
	
	Queue<Integer> pq = new PriorityQueue<>((a,b) -> hm.get(a) - hm.get(b));
	
	for(int i: hm.keySet())
	{
		pq.add(i);
		
		if(pq.size() > k)
			pq.poll();
	}
	
	for(int i=k-1; i>=0; i--)
		res[i] = pq.poll();
	
	
	return res;
}