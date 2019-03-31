import java.util.InputMismatchException;
import java.util.Scanner;

class calculate_cost
{
	Scanner input=new Scanner(System.in);
	
	//**********STANDARD FUNCTION***********
	
	float standard()
	{
		String automated;
		
		/* "y" FOR YES 
		 * "n" FOR NO
		 */
		
		automated=input.next();
		if(automated.equals("y"))
		{
			//ENTER AREA OF HOUSE TO BE CONSTRUCTED (IN SQUARE FEET)
			
			float area=input.nextFloat();
			float cost=(1200+700)*area;
			return cost;
		}
		else
		{
			//ENTER AREA OF HOUSE TO BE CONSTRUCTED (IN SQUARE FEET)
			
			float area=input.nextFloat();
			float cost=(1200)*area;
			return cost;
		}
	}
	
	
	//**********ABOVE STANDARD FUNCTION***********
	
	float above_Standard()
	{
		String automated;
		
		/* "y" FOR YES 
		 * "n" FOR NO
		 */
		
		automated=input.next();
		if(automated.equals("y"))
		{
			//ENTER AREA OF HOUSE TO BE CONSTRUCTED (IN SQUARE FEET)
			
			float area=input.nextFloat();
			float cost=(1500+700)*area;
			return cost;
		}
		else
		{
			//ENTER AREA OF HOUSE TO BE CONSTRUCTED (IN SQUARE FEET)
			
			float area=input.nextFloat();
			float cost=(1500)*area;
			return cost;
		}
	}
	
	
	//************HIGH STANDARD FUNCTION**************
	
	float high_Standard()
	{
		String automated;
		
		/* "y" FOR YES 
		 * "n" FOR NO
		 */
		
		automated=input.next();
		if(automated.equals("y"))
		{
			//ENTER AREA OF HOUSE TO BE CONSTRUCTED (IN SQUARE FEET)
			
			float area=input.nextFloat();
			float cost=(1800+700)*area;
			return cost;
		}
		else
		{
			//ENTER AREA OF HOUSE TO BE CONSTRUCTED (IN SQUARE FEET)
			
			float area=input.nextFloat();
			float cost=(1800)*area;
			return cost;
		}
	}
	
	
	//CONTROLER FUNCTION
	
	void calculate()
	{
		/*	1->STANDARD
			2->ABOVE STANDARD
			3->HIGH STANDARD
		*/
		try{
			int entry=input.nextInt();
		
			switch(entry)
			{
			case 1:
				standard();
				calculate();
				break;
			case 2:
				above_Standard();
				calculate();
				break;
			case 3:
				high_Standard();
				calculate();
				break;
			case 4:
				System.exit(0);
			default:
				calculate();
			}
		}
		catch(InputMismatchException e) {System.exit(0);;}
	}
	
}


//*********MAIN CLASS************

public class House_construction_cost 
{
	public static void main(String args[])
	{
		calculate_cost cc=new calculate_cost();
		cc.calculate();
	}

}
