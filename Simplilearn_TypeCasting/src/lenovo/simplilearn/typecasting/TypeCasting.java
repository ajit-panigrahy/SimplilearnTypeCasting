package lenovo.simplilearn.typecasting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String inputString = sc.nextLine();

		// Convert to different primitive data types
		try {
			// String - Integer
			int intValue = Integer.parseInt(inputString);
			System.out.println("Converted to int: " + intValue);

			// String - Double
			double doubleValue = Double.parseDouble(inputString);
			System.out.println("Converted to double: " + doubleValue);

			// String - Float
			float floatValue = Float.parseFloat(inputString);
			System.out.println("Converted to float: " + floatValue);

			// String - Long
			long longValue = Long.parseLong(inputString);
			System.out.println("Converted to long: " + longValue);

			// Short
			short shortValue = Short.parseShort(inputString);
			System.out.println("Converted to short: " + shortValue);

			// String - Byte
			byte byteValue = Byte.parseByte(inputString);
			System.out.println("Converted to byte: " + byteValue);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Not a valid number format.");
		}

		sc.close();
	}
}
