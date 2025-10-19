package bolentin1tema2;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Create variable for the decimal number
		double decimal;

		// We ask the user for a number
		System.out.print("Introduce un número decimal: ");
		// And read it
		decimal = sc.nextDouble();

		// Create the conditional to set the interval where any number between -1 and 1
		// is close to zero
		if (decimal > -1 && decimal < 1 && decimal != 0) {
			System.out.println("Tu numero es casi-cero");
		} else {
			System.out.println("Tu número NO es casi-cero");
		}

		// Close the scanner
		sc.close();
	}

}
