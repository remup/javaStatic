class Stat {
	static int p;
	int q;
	static {
		p = 18;
		System.out.println("This is a static block!");
	}

	Stat() {
		System.out.println("Constructor!");
	}


	public static void main(String args[]) {
		// Even though we have two objects, static block is executed only once.
		System.out.println("main");
		Stat s1 = new Stat();
		Stat s2 = new Stat();
		int a =5;
		int b=0;
		try {
		int c = a/b;
		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			try {
				throw new StudentException("test");
			} catch (StudentException e1) {
				System.out.println(e1.getMessage());
			}
			
		}
	}
}