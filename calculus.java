import java.util.Scanner;

public class calculus {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in);
		
		System.out.println("Please enter an integer to begin: ");
		int num1 = inputData.nextInt();
		
		System.out.println("Please write the operator you want to use: ( + , - , / , * )");
		char operator;
		operator = inputData.next().charAt(0);
		
		System.out.println("Please enter another integer: ");
		int num2 = inputData.nextInt();
		
		
		if(operator == '+') {
			System.out.println(num1+num2);
		}
		else if(operator == '-') {
			System.out.println(num1-num2);
		}
		else if(operator == '/') {
			System.out.println(num1/num2);
		}
		else if(operator == '*')
		{
			System.out.println(num1*num2);
		}
		else
		{
			System.out.println("Wrong operator");
		}
		
	}

}
