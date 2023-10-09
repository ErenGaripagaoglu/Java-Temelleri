import java.util.Scanner; //dependency for getting inputs - importing scanner

public class controlMechanisms {

	public static void main(String[] args) {
		
		Scanner inputData = new Scanner(System.in); //declaration of the scanner
		byte inputNum;
		
		System.out.println("Enter Your Name: "); //usage of scanner
		String name = inputData.nextLine();
		
		System.out.print("Input Value: ");
		inputNum = inputData.nextByte(); //usage of the scanner
		
		if (inputNum > 10) {
			System.out.println("Welcome "+name);
			System.out.println("Hello World!");
		}
		else if (inputNum == 10) {
			System.out.println("Merhaba!");
		}
		else
		{
			System.out.println("Goodbye World!");
		}
		
	}

}
