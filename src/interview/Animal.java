package interview;

public interface Animal {
	void sound();
}

class Dog implements Animal{
	public void sound() {
		System.out.println("Dog barks");
	}
}
class Lion implements Animal{
	public void sound() {
		System.out.println("Lion roars");
	}
}
class Cat implements Animal{
	public void sound() {
		System.out.println("Cat mews");
	}
}

class UseAnimal{
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		animal = new Lion();
		animal.sound();
	}
}