import java.util.Scanner;

class PrimeNumber1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		for(int i=1;i<=0;i++){
			if(num%i==0){
				count++;
			}
		}
			if(count==2)  //coc prime numbr have only 2 factors
			{
			System.out.println("number is prime number: "+num);
			}
			else{
				System.out.println("number is not  prime number: "+num);
			}
		
	}
}
		