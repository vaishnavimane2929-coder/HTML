//prime number means it can be dividevd by a 1 and and a number itself

import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++){
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2){
			System.out.println("it is a prime number "+num);
		}
		else{
			System.out.println("not a prime number "+num);
		}
	}
}