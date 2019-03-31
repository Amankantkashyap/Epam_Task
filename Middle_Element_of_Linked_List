package DS;

public class Middle_Element_of_Linked_List 
{
	int length=0;
	int traverse(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			length++;
			temp=temp.next;
		}
		return length;
	}
	void find_middle_element(Node head)
	{
		Node temp=head;
		int len=traverse(head),n=0;
		if(len%2==0)
		{
			n=len+1;
		}
		else
		{
			n=len;
		}
		for(int i=0;i<n/2;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}
}
