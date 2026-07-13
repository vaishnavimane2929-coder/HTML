import java.util.Scanner;
//in this we are going to divide the number by 2 coz a prime number have only 2 factors and if we divide by 2 so count will be 1 coz it will start dividing from 1 to till half of entered number  and the count should be 1 only 

class PrimeHalf{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==1){
			System.out.println("number is prime number "+num);
		}
		else{		
			System.out.println("number is not prime number "+num);
		}
	}
}


		
		