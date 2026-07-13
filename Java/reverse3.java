import java.util.Scanner;

class reverse3{
	public static void main(String []args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a start number:  ");
		int start=sc.nextInt();
		System.out.println("Enter a end number:  ");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
			System.out.println(rev(i));
		}
		
	}
	public static int rev(int n){
		int rev=0;
		while(n>0){
			
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		return rev;
	}
	

}