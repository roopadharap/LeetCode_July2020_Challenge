public ListNode removeElements(ListNode head, int val) 
{
	if(head == null)
		return head;
	
	ListNode curr = head, prev = null;
	
	while(curr != null)
	{
		if(curr.val == val)
		{
			if(prev != null)
				prev.next = curr.next;
			else
				head = curr.next;
		}
		else
			prev = curr;
		
		
		 curr = curr.next;
	}
	
	return head;
}