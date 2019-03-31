import java.util.InputMismatchException;
import java.util.Scanner;


class Cal
	{
		Scanner input = new Scanner(System.in); 
		
		//ADDITION FUNCTION
		float addOperation()
		{
			float result=0,value=0;
			int noOfElements=0;
			//Enter total value to add
			noOfElements=input.nextInt();
			for(int i=0;i < noOfElements;i++)
			{

				//Enter value to add one by one
				value=input.nextFloat();	
				result+=value;
			}
			
			return result;
		}
		
		//MULTIPLY FUNCTION
		
		float multiplyOperation()
		{
			float result=1,value=0;
			int noOfElements=0;
			//Enter total value to Multiply
			noOfElements=input.nextInt();
			for(int i=0 ; i < noOfElements ; i++)
			{
				//Enter value one by one
				value=input.nextFloat();	
				result*=value;
			}
			
			return result;
		}
		
		//DIVISION FUNCTION
		
		float divisionOperation()
		{
			//Enter values to divide
			float numerator=input.nextFloat(),denumerator=input.nextFloat();
			return numerator/denumerator;
		}
		
		
		//CONTROLER FUNCTION
		
		void calculate()
		{
			/*	1->Add
				2->Multiply
				3->Divide
				4->Exit
			*/
			try{
				int entry=input.nextInt();
			
				switch(entry)
				{
				case 1:
					addOperation();
					calculate();
					break;
				case 2:
					multiplyOperation();
					calculate();
					break;
				case 3:
					divisionOperation();
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

//MAIN CLASS

class Calculator
{
public static void main(String [] args)
{
	{
		Cal cal=new Cal();
		cal.calculate();
	}
}
}
