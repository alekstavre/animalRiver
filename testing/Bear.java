package testing;

public class Bear extends Animal{

	private int claws;
	public Bear(String name, int age, int claws) {
		super(name, age);
		this.claws=claws;
	}
	
	public void eatFish() {
		System.out.println("eats fish!");
	}

	@Override
	public String toString() {
		return "name:"+ this.getName() +" age:"+ this.getAge()+" claws:" + this.claws;
		
	
	}
	
}
