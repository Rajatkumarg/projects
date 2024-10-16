package interview;

public class Test3 {
public static void main(String[] args) {
	Child child = new Child();
	System.out.println(child.colour);
	System.out.println(child.height);
	child.parentMethod();
	child.modifyAge();
	System.out.println(child.height);
	System.out.println(child.name);
}
}

class Parent{
	//properties
	String colour = "Whitish";
	String intelligence = "Average";
	double height = 5.7;
	//behaviour
	public void parentMethod() {
		System.out.println("Parent method calle");
	}
	
}

class Child extends Parent{
	String name = "Child";
	
	public void modifyAge() {
		height = 5.9;
	}
}