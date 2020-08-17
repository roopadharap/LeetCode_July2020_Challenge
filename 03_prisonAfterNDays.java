public int[] prisonAfterNDays(int[] cells, int N) 
{
	int [] temp = new int [cells.length];
	
	if(N%14 == 0)
		N = 14;
	else
		N = N%14;
	
	for(int i=0; i<N; i++)
	{
		temp[0] = 0;
		temp[temp.length-1] = 0;
		
		for(int j=1; j<cells.length-1; j++)
		{
			
			if(cells[j-1] == cells[j+1])
				temp[j] = 1;
			else
				temp[j] = 0;
		   
		}
		
	   cells = Arrays.copyOf(temp, temp.length);
	}
	
	return cells;
}