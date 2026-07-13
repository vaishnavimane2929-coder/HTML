import java.util.Scanner;

class PerfectNumber{
	public static String checkPerfect(int 
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n){
			return n+"is pefect number";
		}
		else{
			return n+"not perfect number";
		}
	}
	public static void main(String[] args){	
	System.out.println(checkPerfect(100));
		
	}
}
		