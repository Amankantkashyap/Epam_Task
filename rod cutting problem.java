import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int total_case=s.nextInt();
        for(int i=0;i<total_case;i++)
        {
            int special_rod=-1;
            int rod_length=s.nextInt();
            rod_length+=1;
            while(rod_length>=2)
            {
                special_rod++;
                if(rod_length%2==0)
                {
                    rod_length=rod_length/2;
                }
                else
                {
                    rod_length=(rod_length-((rod_length+1)/2));
                }
            }
            System.out.println(special_rod);
        }
    }
}