package interview;

public class Test2 {
public static void main(String[] args) {
//	Student obj = new Student(1);
	new Student();
}
}

class Student{
	
	private int roll;
	private String name;

	public Student() {
		System.out.println("non parameterised constructor called");
	}
	
//	public Student(int roll) {
//		System.out.println("constructor with parameter called");
//	}
	
	public String toString() {
		return this.roll+" "+this.name;
	}
}