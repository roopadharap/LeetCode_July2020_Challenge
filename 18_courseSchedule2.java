public int[] findOrder(int numCourses, int[][] prerequisites) 
{
	HashMap<Integer, Set<Integer>> hm = new HashMap<>();
	int [] inDeg = new int[numCourses];
	
	for(int i=0; i<numCourses; i++)
		hm.put(i, new HashSet<Integer>());
	
	for(int i=0 ; i<prerequisites.length; i++)
	{
		int [] pr = prerequisites[i];
		hm.get(pr[1]).add(pr[0]);
		inDeg[pr[0]]++;
	}
	
	Queue<Integer> q = new LinkedList<Integer>();
	for(int i=0; i<numCourses; i++)
	{
		if(inDeg[i] == 0)
			q.offer(i);
	}
	
	int i=0;
	int [] outDeg = new int [numCourses];
	Arrays.fill(outDeg, -1);
	
	while(!q.isEmpty())
	{
		int temp = q.remove();
		outDeg[i] = temp;
		i++;
		
		for(int n: hm.get(temp))
		{
			inDeg[n]--;
			if(inDeg[n] == 0)
				q.offer(n);
		}
	}
	
	if(i < numCourses)
	{
		int [] emT = new int [0];
		return emT;
	}
	
	return outDeg;
}