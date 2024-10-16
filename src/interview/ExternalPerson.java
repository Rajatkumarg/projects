package interview;

public class ExternalPerson {

	public static void main(String[] args) {
		House obj = new House();
		System.out.println(obj.getWater());
	}
	
}


class House{
	//data member
	private String water = "1 glass of water";
	
	//method
	public String getWater() {
		return water;
	}
	
}