class swap{
	public static void main(String[]args){
		int a=10;
		int b=20;
		System.out.println(swap(a,b));
	}
	public static String swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		return "a: "+ a+ "b: " +b;
	}
}