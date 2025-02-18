import java.util.Scanner;
public class InputDemo{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		
		System.out.println("This is input demo code");
		
		//Integer data types

		byte b ;
		short s ;
		int a  ;
		Boolean bool = true ;

		//Decimal data types
		float f  ;
		double d ;


		//Character Data Types
		char c = 'a' ;


		
		

		//Taking Input

		System.out.print("Enter a Byte value:");
		b = input.nextByte();
		
		System.out.print("Enter a short int value:");
		s = input.nextShort();

		System.out.print("Enter a Integer value:");
		a = input.nextInt();

		System.out.print("Enter a Float value:");
		f = input.nextFloat();

		System.out.print("Enter a Double value:");
		d = input.nextDouble();

		System.out.print("Enter a Boolean value:");
		bool = input.nextBoolean();



		System.out.printf("Value of Character is: %c\n",c);
		System.out.printf("Value of Byte is: %04d\n",b);
		System.out.printf("Value of Short is: %d\n",s);
		System.out.printf("Value of int is: %d\n",a);
		System.out.printf("Value of float is: %f\n",f);
		System.out.printf("Value of Boolean is: %b\n",bool);


		


	}
}
