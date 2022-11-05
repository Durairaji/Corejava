package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaseClass {
	Scanner s = new Scanner(System.in);
	int total;

	public void additon() {
		try {
		System.out.println("enter a and b value for addition");
	
			int a = s.nextInt();
			int b = s.nextInt();

			total = a + b;
			System.out.println(total);
		} catch (Exception ae) {
			System.out.println("you put the wrong values again put the number");
			System.out.println("or wrong match value");
				
			}

		}

	}


