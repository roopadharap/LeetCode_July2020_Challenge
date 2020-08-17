public int[] plusOne(int[] digits) 
{
	int carry = 0;
	
	if(digits.length == 0)
	{
		carry = 1;
	}
	
	for(int i=digits.length-1; i>=0; i--)
	{
		if(i == digits.length-1)
			digits[i] = digits[i] + 1;
		
		digits[i] = digits[i] + carry;
		
		carry = 0;
		if(digits[i] >= 10)
		{
			carry = digits[i] / 10;
			digits[i] = digits[i] % 10;
		 }
	}
	
	if(carry > 0)
	{
		int [] arr = new int [digits.length + 1];
		
		arr[0] = carry;
		for(int i=1; i<arr.length; i++)
		{
			arr[i] = digits[i-1];
		}
		
		return arr;
	}
	
	return digits;
}