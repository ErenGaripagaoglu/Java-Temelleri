import java.util.Scanner;

public class doWhileCalculus {

	public static void main(String[] args) {
		
		char c = 0;
		int num1;
		int calc=0;
		
		do {
			Scanner userInput = new Scanner(System.in);
			
			if (c=='y') {
				System.out.println("First Number: " + calc);
				num1 = calc;
			}
			else
			{
				System.out.println("Please enter the first number: ");
				num1 = userInput.nextInt();
			}
			
			System.out.println("Please select operator: 0=='+', 1=='-', 2=='*', 3=='/'");
			int opt = userInput.nextInt();
			
			System.out.println("Please enter your second number: ");
			int num2 = userInput.nextInt();
			
			switch(opt) {
				case(0): calc = num1+num2; break;
				case(1): calc = num1-num2; break;
				case(2): calc = num1*num2; break;
				case(3): calc = num1/num2; break;
				default : System.out.println("Wrong operator input"); break;
			}
		
			System.out.println(calc);
			
			System.out.println("Would you like to continue? y/n");
			c = userInput.next().charAt(0);
		}while(c=='y');
		System.out.println("Calculator is terminated!");
		
	}

}
