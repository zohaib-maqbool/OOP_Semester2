public class BankingSystem{

	
	private static final String storedAccountNumber = "mcb438221";
	private static final String storedPin = "1234";


	static class LoginProcessor{
		
		static boolean authenticate(String accountNumber, String pin) {
		return storedAccountNumber.equals(accountNumber) && storedPin.equals(pin);
        	}
	}



}

