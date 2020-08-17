public int arrangeCoins(int n) 
{
	int cnt = 1;
	
	if(n == 0 || n == 1)
		return n;
	
	while(n > 0)
	{
		cnt++;
		n = n - cnt;
		
	}
	
	return cnt - 1;
}