public class PinValidator{
	public class Rules{
		boolean isValid(String pin){

			return (pin.length() == 4 && pin.matches("\\d+"));

		}

	}



}