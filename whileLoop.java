
public class whileLoop {

	public static void main(String[] args) {
		
		int x = 0;
		
		while (x < 200) {
			System.out.println("Counter: " + x);
			x++;
		}
		
		
		x = 0;
		do {
			System.out.println("Counter: " + x);
			x++;
		} while (x > 2);
			
		
		while (true) {
			System.out.println(x++);
		}
		
		
	}

}
