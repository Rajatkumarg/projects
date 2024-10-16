package interview;

public interface Car {
	void color();
}

class Creta implements Car{

	@Override
	public void color() {
		System.out.println("Creata is White");
	}
	
}
class Swift implements Car{

	@Override
	public void color() {
		System.out.println("Swift is Red");
	}
	
}
class Punch implements Car{

	@Override
	public void color() {
		System.out.println("Punch is Black");		
	}
	
}

class UseCar{
	public static void main(String[] args) {
		Car car = new Creta();
		car.color();
		car = new Swift();
		car.color();
		car = new Punch();
		car.color();
	}
}