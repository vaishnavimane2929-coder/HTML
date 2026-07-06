class ParaMethod {
	public static void main(String[] args) {
		m1(7, "hello", 'c');
		// String res1=m2('B',"sunday");
		// System.out.println(res1);
	}

	public static void m1(int a, String b, char c) {
		System.out.println("int value:" + a);
		System.out.println("String value:" + b);
		System.out.println("char value:" + c);

	}

	public static String m2(char b, String c) {
		String res = b + c;
		return res;
	}
}