package testing;

public abstract class Animal {

	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;

	}

	@Override
	public String toString() {
		return "name:"+ name +" age:"+ age;
		
	
	}
}