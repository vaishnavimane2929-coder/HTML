class Method {
	public static void m1() {
		System.out.println("this is non paramiterized method");
	}

	public static int m2() {
		System.out.println("return in method");
		return 25;
	}

	public static char m3() {
		char ch = 'a';
		return ch;
	}

	public static void main(String[] args) {
		m1();
		System.out.println(m2());
		System.out.println("calling m3" + m3());
		System.out.println(m3() + 10);

	}
}