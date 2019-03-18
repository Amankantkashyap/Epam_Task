import java.util.InputMismatchException;
import java.util.Scanner;

class Calculate_Interest 
{
	Scanner input=new Scanner(System.in);
	
	//DECLARATION AND INITIALIZATION OF VARIABLES
	
		float principal=0;
		float rate=0;
		int time=0;
		
		//FUNCTION TO CALCULATE COMPOUND INTREST
		
	float calculate_CI()
	{
		float intrest=0;
		/*
		 * ENTER AMOUNT
		 * */
		principal=input.nextFloat();
		/*
		 * ENTER RATE
		 * */
		rate=input.nextFloat();
		/*
		 * ENTER TIME IN YEARS
		 * */
		time=input.nextInt();	
		for(int i=0;i<time;i++)
		{
			intrest=(principal*rate)/100;
			principal+=intrest;
		}
		

		return principal;
	}
	
	//FUNCTION TO CALCULATE SIMPLE INTREST
	
	float calculate_SI()
	{
		float intrest=0;
		/*
		 * ENTER AMOUNT
		 * */
		principal=input.nextFloat();
		/*
		 * ENTER RATE
		 * */
		rate=input.nextFloat();
		/*
		 * ENTER TIME IN YEARS
		 * */
		time=input.nextInt();	
		
		intrest=(principal*rate*time)/100;
		principal+=intrest;
		

		return principal;
	}
	
	//CONTROLER FUNCION 
	void calculate()
	{
		/*	1->SIMPLE INTEREST
			2->COMPUUND INTEREST
			3->Exit
		*/
		try{
			int entry=input.nextInt();
		
			switch(entry)
			{
			case 1:
				calculate_CI();
				calculate();
				break;
			case 2:
				calculate_CI();
				calculate();
				break;
			case 3:
				System.exit(0);
			default:
				calculate();
			}
		}
		catch(InputMismatchException e) {System.exit(0);;}
	}
}

//MAIN FUNCION

public class Interest_calculator
{
	public static void main(String args[])
	{
		Calculate_Interest i=new Calculate_Interest();
		i.calculate();
	}
}
