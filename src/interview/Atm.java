package interview;

public interface Atm {
	//functionallity
	boolean pin(int pwd);
	void withdraw(double bal);
	void balance();
	
}

class SbiAtm implements Atm{

	int pin = 1234;
	double balance = 10000;
	@Override
	public boolean pin(int pwd) {
		if(pwd==pin) {
			System.out.println("Correct PIN. Congrats");
		}
		else {
			System.out.println("Wrong PIN");
		}
		return pwd==pin;
	}

	@Override
	public void withdraw(double bal) {
		balance = balance- bal;
	}
	@Override
	public void balance() {
		System.out.println("Your balance is "+balance);
	}
	
}

class UseAtm{
	public static void main(String[] args) {
		Atm atm = new SbiAtm();
		boolean b = atm.pin(1234);
		if(b) {
			System.out.println("Before Withdrawal");
			atm.balance();
			atm.withdraw(2000);
			System.out.println("After Withdrawal");
			atm.balance();
		}
	}
}