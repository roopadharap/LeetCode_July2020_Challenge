public int nthUglyNumber(int n) 
{
	int [] arr = new int [n];
	int i2 = 0, i3 = 0, i5 = 0;
	int mult2 = 2, mult3 = 3, mult5 = 5;
	
	arr[0] = 1;
	
	for(int i=1; i<n; i++)
	{
		int min = Math.min(Math.min(mult2, mult3), mult5);
		
		arr[i] = min;
		
		if(mult2 == min)
			mult2 = 2*arr[++i2];
		
		if(mult3 == min)
			mult3 = 3*arr[++i3];
		
		if(mult5 == min)
			mult5 = 5*arr[++i5];
	}
	
	return arr[n-1];
}