package bolentin1tema2;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Diseñar una aplicación que solicite al usuario un número e indique si es par
		// o impar.

		Scanner sc = new Scanner(System.in);
		// Create variable for the number
		int numero;

		// We ask the user for a number
		System.out.print("Introduce un número: ");
		// And read it
		numero = sc.nextInt();

		//Conditional to know if the number is even or odd
		if (numero % 2 == 0) {
			System.out.println(numero + " es un número par.");
		} else {
			System.out.println(numero + " es un número impar.");
		}

		sc.close();
	}

}
