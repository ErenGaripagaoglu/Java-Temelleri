import java.util.Scanner;

public class methods {

	public static void main(String[] args) {
	
		iDoThingsMyWay();
		System.out.println(SumOperator());
		System.out.println(SubOperator());
		System.out.println(DivOperator());
		System.out.println(MultOperator());
	
		parameterTransaction("Eren");
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Input first parameter: ");
		int a = userInput.nextInt();
		System.out.println("Input second parameter: ");
		int b = userInput.nextInt();
		parameterSum(a,b);
	}	
	
	static void iDoThingsMyWay() {
		
		System.out.println("This is my first method in Java");
		
	}
	
	
	//***********************\\
	
	static void parameterTransaction(String text) {
		
		System.out.println(text);
	
	}
	
	static void parameterSum(int x, int y) {
		System.out.println(x+y);
	}
	
	//***********************\\
	
	static int SumOperator() {
		
		int x = 20;
		int y = 30;
		int sum = x + y;
	
		return sum;
	}
	
	static int SubOperator() {
			
		int x = 20;
		int y = 30;
		int sub = x - y;
		
		return sub;
	}
	
	static int DivOperator() {
		
		int x = 20;
		int y = 30;
		int div = x / y;
	
		return div;
	}
	
	static int MultOperator() {
		
		int x = 20;
		int y = 30;
		int mult = x * y;
	
		return mult;
	}

}
