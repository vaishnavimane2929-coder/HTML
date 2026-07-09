class MethodOverloading2
{
	public static String uploadPost(String caption){
		return caption;
	}
	public static String uploadPost(String caption, String location,String song){
		return "caption : " +caption +
				"\n locaton : " +location +
				"\n song name : " +song;	
	}
	public static String uploadPost(String caption, String location,String song,int NoOfphotos){
		return "caption : " +caption +
				"\n locaton : " +location +				
				"\n song name : " +song +
				"NoOfphotos : " +NoOfphotos;
				
	}
	public static void main(String []args){
		
		String res=uploadPost("be happy always");
		System.out.println(res);
		System.out.println("------------method2-----------------");
		String res1=uploadPost("we can do it","pune","good vibes");
		System.out.println(res1);
		System.out.println("------------method3-----------------");

		String res2=uploadPost("we can do it","pune","good vibes",2);
		System.out.println(res2);
		
}
}