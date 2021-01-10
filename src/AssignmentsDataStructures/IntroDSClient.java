package AssignmentsDataStructures;

public class IntroDSClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		IntroDS i1 = new IntroDS();
		IntroDS i2 = new IntroDS();
		IntroDS i3 = new IntroDS(5);
		IntroDS i4 = new IntroDS(50, "A");

		/*
		 * System.out.println(i1.name); System.out.println(i1.age);
		 * 
		 * i2.name = "A"; i2.age = 25;
		 * 
		 * System.out.println(i2.name); System.out.println(i2.age);
		 */
		System.out.println(i1.getName());
		System.out.println(i1.getAge());
		/*
		 * i2.setName("A"); i2.setAge(25);
		 */
		System.out.println(i2.getName());
		System.out.println(i2.getAge());

		System.out.println(i3.getName());
		System.out.println(i3.getAge());

		System.out.println(i4.getName());
		System.out.println(i4.getAge());
	}

}
