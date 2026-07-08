class factorial{
	public static int isfactorial(int num){
	int fact=1;
	for(int i=1;i<=num;i++){
	fact=fact*i;
	}
		return fact;	
	}
	
	public static void main(String[]args){
		System.out.println(isfactorial(5));
		int res=isfactorial(7);
		System.out.println(res-isfactorial(5));
		
		
		
		}
}