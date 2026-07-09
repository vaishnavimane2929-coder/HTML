class MethodOverloading{
	public static void main(String []args){
		userDetails("akash",826895642L,"akash@gmail.com",454545);
		System.out.println("****************************************************");
		userDetails("vaishnavi",1000000000L,"vaish@gmail.com",411033,666666.2,"japan");
		System.out.println("****************************************************");

		userDetails();
		System.out.println("****************************************************");

	
	}
	public static void userDetails(String name,long contact,String mail,int pincode){
		System.out.println("NAME:"+name);
		System.out.println("PhoneNo:"+contact);
		System.out.println("MAIL:"+mail);
		System.out.println("PINCODE:"+pincode);
			
	}
	public static void userDetails(String name,long contact,String mail,int pincode,double salary,String location){
		System.out.println("NAME:"+name);
		System.out.println("PhoneNo:"+contact);
		System.out.println("MAIL:"+mail);
		System.out.println("PINCODE:"+pincode);
		System.out.println("salary:"+salary);
		System.out.println("Location:"+location);


	}
	public static void userDetails(){
	System.out.println("this is non paramiterized method in method overloading!!");
		
	}


}