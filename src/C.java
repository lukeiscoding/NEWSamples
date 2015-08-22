public class C {
	public static void main(String[] args) {
		A a = new A(10);
		B b = new B();
		
		System.out.println("a.f()");
		a.f();
		System.out.println("b.f()");
		b.f();
		
		System.out.println("a = b");
		a = b;
		
		System.out.println("a.f()");
		a.f();
		System.out.println("b.f()");
		b.f();
	}
}