public int leastInterval(char[] tasks, int n) 
{
	HashMap<Character, Integer> hm = new HashMap<>();
	int res = 0, max = 0, maxFreqChars = 0;
	
	for(int i=0; i<tasks.length; i++)
	{
		if(!hm.containsKey(tasks[i]))
			hm.put(tasks[i],1);
		else
			hm.put(tasks[i], hm.get(tasks[i])+1);
			
	}
	
	for(Character c: hm.keySet())
	{
		if(hm.get(c) > max)
		{
			max = hm.get(c);
			maxFreqChars = 1;
		}
		else if(hm.get(c) == max)
			maxFreqChars++;
	}
	
	res = max*n +max - n + (maxFreqChars-1);
	  
	return Math.max(res, tasks.length);
}