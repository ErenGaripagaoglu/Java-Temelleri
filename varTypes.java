
public class varTypes {

	public static void main(String[] args) {
		
		//variable = structures that store data
		
		/*-----Primitive Variables-----*/
		
		//ram occupancy is known
			
		byte bt = 10; // 1 byte on ram
		short s = 10; // 2 byte on ram
		int x = 10; // 4 byte on ram 
		long y = 10; // 8 byte on ram
		
		double d = 10.5; // 4 byte on ram 
		float f = 10.5f; // 8 byte on ram
		float f2 = (float) 10.6; // 8 byte on ram
		
		char c = 'A'; // 2 byte on ram
		
		boolean b = true; // 1 bit on ram
		
		System.out.println(bt);
		System.out.println(s);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(f2);
		
		System.out.println(c);
		
		System.out.println(b);
		
		/*-----Non-Primitive Variables-----*/ 
		
		//ram occupancy is unknown
		
		String st = "Eren"; // 2 byte for each char in string- 8 byte for Eren
		
		System.out.println(st);
			
	}

}
