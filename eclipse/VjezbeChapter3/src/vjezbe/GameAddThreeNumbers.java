package vjezbe;

import java.util.Scanner;

public class GameAddThreeNumbers {

	/*
	 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java,
	 * generates two integers and prompts the user to enter the sum of these two
	 * integers. Revise the program to generate three single-digit integers and
	 * prompt the user to enter the sum of these three integers.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);

		System.out.println("What is " + num1 + " + " + num2 + " + " + num3 + " ? ");
		int answer = input.nextInt();
		
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + answer + " is " + 
		(num1 + num2 + num3 == answer));

	}

}
