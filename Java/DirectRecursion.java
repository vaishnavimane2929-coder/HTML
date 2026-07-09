class DirectRecursion{
	public static void main(String[]args){
		int num=6;
		System.out.println(sum(num));
		System.out.println(fact(num));
		print(1,10);
			
	}
	public static int fact(int num)
	{
		if(num==1) //base case
		{
			return 1;
		}
		return num*fact(num-1); //recursive case
	}
	
	public static int sum(int num){
		if(num==0) //base case
		{
			return 0;
		}
		return num+sum(num-1);//recursive case
	}
	public static void print(int start,int end)
	{
		if(start>end){
		return;	
		}
	System.out.println(start);
	start++;
	print(start,end); //recursive case
}


}