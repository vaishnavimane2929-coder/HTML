class reverse{
	public static void main(String []args){
		
		int rev=0;
		int n=12321;
		int temp=n;
		while(n>0){
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if (temp==rev){
			System.out.println("it is palindrome");
			
		}
		else{
			System.out.println("it is not palindrome");
			
		}
	
	}
}


/*
n                  rem           rev
12321             1             (0*10)+1=1
1232               2             (1*10)+2=12
123               3              (12*10)+3=123
12                2                (123*10)+2=1232
1                 1                (1232*10)+1=123214
















*/