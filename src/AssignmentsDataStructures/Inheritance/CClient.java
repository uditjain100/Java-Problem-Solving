package AssignmentsDataStructures.Inheritance;

public class CClient {

	public static void main(String[] args) {

		// Stage 1
		P p = new P();
		System.out.println(p.d);
		System.out.println(p.d1);
		p.fun();
		p.fun1();
		System.out.println();

		// Stage 2
		C c = new C();
		System.out.println(c.d);
		System.out.println(c.d1);
		System.out.println(c.d2);
		c.fun();
		c.fun1();
		c.fun2();
		System.out.println();

		// Stage 3
		P obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(((C) obj).d2);
		obj.fun();
		obj.fun1();
		((C) obj).fun2();
		
		//Stage 4
	//	C a = new P() ;
		

	}

}
