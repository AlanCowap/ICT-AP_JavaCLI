/** 
 *  Simple first class 
 *  
 *  
 *  
 * @author Alan Cowap 
 * @version 1.0  
 * @dependencies None
 *  
 */
import java.io.Console;

class HelloWorld{

	public static void main(String[] args){

		// Print to console 10 times
		for(int count=0; count < 10; ++count){
			System.out.println("Hello World");
		}

		//variable declaration
		boolean valid = false; //true, false

		//Decision statement
		if(valid){
			System.out.println("It is valid");
		}else{
			System.out.println("It is invalid");
		}

		//User IO
		System.out.println("Please enter a name: ");
		Console con = System.console();
		//String input = con.readLine();
		//System.out.println("Hello " + input);

		//Primitive types of variable

		//Integer numbers
		byte little = 127; //8 bits
		short small = 32767; // 16 bits
		int num = 1; //32 bits
		long big = 9000000; //64 bits
		
		//Floating point numbers
		float percent = 2.5F;
		double rate = 1.2; //64 bit

		char letter = 'd'; //single quotes
		boolean isValid = true;

		User newUser = new User();
		User newUser2 = new User();

		newUser.setDisplayName("Alan");
		String name = newUser.getDisplayName();
		System.out.println("User name is " + name);

		newUser2.setDisplayName("Bob");		
		String name2 = newUser2.getDisplayName();
		System.out.println("User2 name is "+name2);


	}
}
