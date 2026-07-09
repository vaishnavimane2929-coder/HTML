//program for adding the digits of number entered
class DigitSum{
	
	public static int SumOfDigit(int num){
		int sum=0;
		while(num!=0){
			int digit=num%10;
		sum=sum+digit;
		num=num/10;
		}
	return sum;
	}
	public static void main(String[]args){
		System.out.println(SumOfDigit(123));
		int res=SumOfDigit(123);
		System.out.println(res);
	}
	
}