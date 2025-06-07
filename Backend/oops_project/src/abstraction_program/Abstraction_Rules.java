package abstraction_program;

public abstract class Abstraction_Rules {
	
	int a;
	static int b;
	
	public Abstraction_Rules () {
		//for reinitialize
	}
	
	public static void m1() {
		System.out.println("static method");
	}
	public static void m2() {
		System.out.println("non static method");
	}
	public abstract void m3();
	
//public static abstract void m4()---abstract is not applicable for static

//	public final abstract void m5()---final method cant be override, so we cant provide
//			                            implementation
	
	public static void main(String[] args) {
//		Abstarction_Rules r=new Abstraction_Rules()--can create object for abstract	
	}
}

