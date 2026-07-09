//desing a program to find a strong number using factorial and sum of digit logic together

class StrongNumber{
	public static int isfactorial(int num){
	int fact=1;
	for(int i=1;i<=num;i++){
	fact=fact*i;
	}
		return fact;	
	}
	public static int SumOfDigit(int num){
		int sum=0;
		while(num!=0){
			int digit=num%10;
		sum=sum+isfactorial(digit); 
		num=num/10;
		}
	return sum;
	}
	public static void main(String[]args){
		
		System.out.println(SumOfDigit(123));
		
		
		}
}