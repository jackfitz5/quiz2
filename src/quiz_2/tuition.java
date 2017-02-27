package quiz_2;

import java.util.Scanner;

	public class tuition {

		public static void main(String[] args) { 
			
		// have user input this year's tuition
		Scanner input = new Scanner(System.in);
		System.out.println("How much is tuition this year?: ");
		double Tuition = input.nextDouble();
			
		// have user input the rate at which tuition increases
		System.out.println("At what percentage rate is tuition rising?: ");
		double tuitionRate = input.nextDouble();
			
		// tuition equation
		double total = 0;	
		for (int i=0;i<4;i++){	
			Tuition= Tuition*(Math.pow(1 + tuitionRate,i));
			total+=Tuition;
			
			}
			System.out.format("\nWhen you graduate, your tuition will end up costing: $%.2f", total);
			
			
			input.close();
		}
	
	}
	

