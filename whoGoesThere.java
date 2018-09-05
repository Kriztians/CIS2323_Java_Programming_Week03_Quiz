import java.util.Scanner;
public class CIS2323_Week03_Quiz {
	public static void main(String[] args){ 
		String firstName;
		String lastName;
		String age;
	
	
		Scanner inputDevice = new Scanner(System.in);
	
		System.out.println("What is your first name?");
		firstName = inputDevice.nextLine();
		System.out.println("What is your last name?");
		lastName = inputDevice.nextLine();
		System.out.println("What is your age?");
		age = inputDevice.nextLine();
		System.out.println("I am " + firstName + lastName);
		System.out.println(" I am " + age + " years old.");
	}
}