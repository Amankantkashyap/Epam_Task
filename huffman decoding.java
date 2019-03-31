void decode(String s, Node root) 
    {
        Node temp=root;
        for(int i=0;i<s.length();i++)
        {
            char character=s.charAt(i);
            if(character=='0')
            {
                temp=temp.left;
                if(temp.data!='\u0000')
                {
                    System.out.print(temp.data);
                    temp=root;
                }
            }
            else
            {
                temp=temp.right;
                if(temp.data!='\u0000')
                {
                    System.out.print(temp.data);
                    temp=root;
                }
            }
        }
    }