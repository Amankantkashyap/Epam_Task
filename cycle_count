static boolean hasCycle(SinglyLinkedListNode head) 
    {
        if (head == null)
        {
        return false;
        }
        SinglyLinkedListNode slowpointer = head;
        SinglyLinkedListNode fastpointer = head;
        while (fastpointer != null && fastpointer.next != null)
        {
            slowpointer = slowpointer.next;
            fastpointer = fastpointer.next.next;
            if (slowpointer == fastpointer)
            {
                return true;
            }
        }

    return false;        
    }
