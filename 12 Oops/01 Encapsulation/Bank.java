
public class Bank {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setType("Savings");
		a.setPin(5040);
		a.setAccNo(9486938596853L);
		
		System.out.println(a.getAccNo());
		System.out.println(a.getPin());
		System.out.println(a.getType());
	}
}
