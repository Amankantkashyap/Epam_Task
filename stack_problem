import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        stack s=new stack();
        s.start();
    }
}
class stack
{
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int [size];
    int front=0;
    int rear=0;
    void start()
    {
        for(int i=0;i<size;i++)
        {
            int operation=sc.nextInt();
            if(operation==1)
            {
                int x=sc.nextInt();
                push(x);
            }
            else if(operation==2)
            {
                pop();
            }
            else if(operation==3)
            {
                dispay();
            }
        }
    }
    void push(int x)
    {
        arr[rear]=x;
        rear++;
    }
    void pop()
    {
        arr[front]=0;
        front++;
    }
    void dispay()
    {
        System.out.println(arr[front]);
    }
}

