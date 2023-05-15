package calculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
	private static final Logger logger = Logger.getLogger(Client.class.toString());
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// hours worked in a week
		System.out.println("hours worked in a week?");
		int hours = scanner.nextInt();

		// what's the hourly payrate
		System.out.println("what's the hourly payrate?");
		double payRate = scanner.nextDouble();

		// calculate gross pay hours*payRate
		double grossPay = hours * payRate;

		// print out gross pay
		System.out.println("Gross pay is $"+grossPay);

		// close scanner
		scanner.close();
		logger.log(null, "program complete");
	}
}

