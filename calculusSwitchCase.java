import java.util.Scanner;

public class calculusSwitchCase {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter the first number: ");
		int num1 = userInput.nextInt();
		
		System.out.println("Please select operator: 0=='+', 1=='-', 2=='*', 3=='/'");
		int opt = userInput.nextInt();
		
		System.out.println("Please enter your second number: ");
		int num2 = userInput.nextInt();
		
		switch(opt) {
			case(0): System.out.println(num1+num2); break;
			case(1): System.out.println(num1-num2); break;
			case(2): System.out.println(num1*num2); break;
			case(3): System.out.println(num1/num2); break;
			default : System.out.println("Wrong operator input"); break;
		}
		
	}

}
