public Node flatten(Node head) 
{
	if(head == null)
		return head;
	
	Node curr, ch, temp;
	
	curr = head;
	while(curr != null)
	{
		if(curr.child != null)
		{
			ch = curr.child;
			
			while(ch.next != null)
				ch = ch.next;
			
			temp = curr.next;
			curr.next = curr.child;
			curr.child.prev = curr;
			curr.child = null;
			
			ch.next = temp;
			if(temp != null)
				temp.prev = ch;
		}
		
		curr = curr.next;
	}
	
	return head;
}