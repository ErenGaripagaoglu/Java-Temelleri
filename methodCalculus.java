import java.util.Scanner;

public class methodCalculus {

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
				case(0): Sum(num1, num2); break;
				case(1): Sub(num1, num2); break;
				case(2): Mult(num1,num2); break;
				case(3): Div(num1, num2); break;
				default : System.out.println("Wrong operator input"); break;
			}
			
			System.out.println("Would you like to continue? y/n");
			c = userInput.next().charAt(0);
		}while(c=='y');
		System.out.println("Calculator is terminated!");

	}
	
	static void Sum(int x, int y) {
		System.out.println(x+y);
	}
	static void Sub(int x, int y) {
		System.out.println(x-y);
	}
	static void Div(int x, int y) {
		System.out.println(x/y);
	}
	static void Mult(int x, int y) {
		System.out.println(x*y);
	}
	

}
