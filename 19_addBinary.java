public String addBinary(String a, String b) 
{
	if(a.length() == 0)
		return b;
	
	if(b.length() == 0)
		return a;
	
	int i = a.length() - 1;
	int j = b.length() - 1;
	int c = 0;
	StringBuilder res = new StringBuilder();
	
	while(i >= 0 || j >= 0)
	{
		int k = 0;
		
		if(i >= 0 && a.charAt(i) == '1')
			k++;
		
		if(j >= 0 && b.charAt(j) == '1')
			k++;
		
		k = k + c;
		
		if(k >= 2)
			c = 1;
		else
			c = 0;
		
		res.insert(0, (char)((k%2) + '0'));
		
		i--;
		j--;
	}
	
	if(c == 1)
		res.insert(0, '1');
	
	return res.toString();
}