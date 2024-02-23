package com.example.spe_mini_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.lang.Math;

@SpringBootApplication
public class SpeMiniProjectApplication {

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}

	public static double divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Error: Cannot divide by zero!");
			return Double.NaN; // NaN (Not a Number) represents undefined result
		}
		return num1 / num2;
	}

	public static double squareRoot(double num) {
		return Math.sqrt(num);
	}

	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

	public static double naturalLog(double num) {
		return Math.log(num);
	}

	public static double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpeMiniProjectApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("Welcome to the Calculator Program!");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Square Root");
			System.out.println("6. Factorial");
			System.out.println("7. Natural Logarithm");
			System.out.println("8. Power");
			System.out.println("Enter 'q' to quit");
			System.out.print("Enter your choice (1-8 or 'q'): ");
			String choice = scanner.next();

			switch (choice) {
				case "1":
					System.out.print("Enter first number: ");
					double num1 = scanner.nextDouble();
					System.out.print("Enter second number: ");
					double num2 = scanner.nextDouble();
					System.out.println("Result: " + add(num1, num2));
					break;
				case "2":
					System.out.print("Enter first number: ");
					double num3 = scanner.nextDouble();
					System.out.print("Enter second number: ");
					double num4 = scanner.nextDouble();
					System.out.println("Result: " + subtract(num3, num4));
					break;
				case "3":
					System.out.print("Enter first number: ");
					double num5 = scanner.nextDouble();
					System.out.print("Enter second number: ");
					double num6 = scanner.nextDouble();
					System.out.println("Result: " + multiply(num5, num6));
					break;
				case "4":
					System.out.print("Enter dividend: ");
					double num7 = scanner.nextDouble();
					System.out.print("Enter divisor: ");
					double num8 = scanner.nextDouble();
					System.out.println("Result: " + divide(num7, num8));
					break;
				case "5":
					System.out.print("Enter a number to find its square root: ");
					double num9 = scanner.nextDouble();
					System.out.println("Result: " + squareRoot(num9));
					break;
				case "6":
					System.out.print("Enter a number to find its factorial: ");
					int num10 = scanner.nextInt();
					System.out.println("Result: " + factorial(num10));
					break;
				case "7":
					System.out.print("Enter a number to find its natural logarithm: ");
					double num11 = scanner.nextDouble();
					System.out.println("Result: " + naturalLog(num11));
					break;
				case "8":
					System.out.print("Enter the base number: ");
					double base = scanner.nextDouble();
					System.out.print("Enter the exponent number: ");
					double exponent = scanner.nextDouble();
					System.out.println("Result: " + power(base, exponent));
					break;
				case "q":
					running = false;
					System.out.println("Exiting calculator program...");
					break;
				default:
					System.out.println("Invalid choice! Please select a valid option.");
			}
		}

		scanner.close();
	}

}
