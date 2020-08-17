public String reverseWords(String s) 
{
	s = s.trim();
	
	if(s.length() == 0)
		return s;
	
	String [] arr = s.split(" ");
	StringBuilder sb = new StringBuilder();
	for(int i=arr.length-1; i>=0; i--)
	{
		if(!arr[i].equals(""))
			sb.append(arr[i] + " ");
			//sb.append(" ");
	}
	
	s = sb.toString();
	s = s.substring(0, s.length()-1);
	return s;
}