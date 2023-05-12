

public class Application {

	public static void main(String[] args) {
		
		
		
		Cow c = new Cow();
		
		c.setName("Ramon");
		c.setType("Weird");
		c.setLegs(4);
		c.setStippen(21);
		c.makeSound();
		
		Dog d = new Dog();
		
		d.setName("Salmon");
		d.setType("Normal");
		d.setLegs(4);
		d.makeSound();
		 
		Cat e = new Cat();
		
		e.setName("Poen");
		e.setType("Normaal");
		e.setLegs(4);
		e.makeSound();

	}

}
