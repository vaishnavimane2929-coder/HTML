//program to calculate the sum of digits from number

class WhileLoop{
	public static void main(String []args){
	int n=54791;
	int sum = 0;
	while(n>0){
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	System.out.println(sum);
	}
}
/*
n          rem       sum
54791       1         1
5479         9        10
547         7         17
54          4          21
5           5          26
0          loop will get terminated*/