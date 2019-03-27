package testing;

public class Fish extends Animal{

	private int dots;
	public Fish(String name, int age, int dots) {
		super(name, age);
		this.dots=dots;
		
	}
	public void getEaten() {
		System.out.println("got eaten!");
	}
	
	@Override
	public String toString() {
		return "name:"+ getName()+ " age:"+ getAge() +" dots: "+dots;
		
	}
}
