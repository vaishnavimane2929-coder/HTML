import java.util.Scanner;

class ScannerEg{
	public static void main(String []args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your phone number:");
		Long ph=sc.nextLong();
		System.out.println("Enter a charecter:");
		char ch=sc.next().charAt(3);
		System.out.println("enter amount to be: ");
		double amt=sc.nextDouble();
		System.out.println("enter a boolean value :");
		boolean b=sc.nextBoolean();
		System.out.println("-------------Fetched user input-----------");
		System.out.println("entered charecter: "+ch);
		System.out.println("entered amount is :"+amt);
		System.out.println("entered name is :"+name);
		System.out.println("entered phone number is :"+ph);
		System.out.println("entered boolean value is: "+b);
		
		sc.close();
		



		
	}
	
}