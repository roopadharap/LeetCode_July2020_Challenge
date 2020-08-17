public int reverseBits(int n) 
{

	int res = 0;
	int pw = 0;

	while(pw < 32)
	{
	   res <<= 1;
	   res = res | (n & 1);
	   n >>= 1;
	   pw++;
	}
	
	return res;
}