package AssignmentsDataStructures;

public class IntroDS {

	private String name;
	private int age;

	public IntroDS() {
		System.out.println("Constructor with One Parameter");
		
	}

	public IntroDS(int age) throws Exception {
		System.out.println("Constructor with Two Parameter");
		setAge(age);
	}

	public IntroDS(int age, String name) throws Exception {
		System.out.println("Constructor with Three Parameter");
		setAge(age);
		setName(name);
	}

	public String getName() {
		return this.name;
	}

	public String setName(String name) throws Exception {

		if (name.equals("")) {
			throw new Exception("Name cannot be Empty");
		}
		return this.name = name;
	}

	public int getAge() {

		return this.age;
	}

	public int setAge(int age) throws Exception {
		if (age < 0) {
			throw new Exception("Age cannot be negative");
		}
		return this.age = age;
	}

}
