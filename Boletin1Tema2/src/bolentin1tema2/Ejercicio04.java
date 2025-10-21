package bolentin1tema2;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		
		//Create the scanner
		Scanner sc = new Scanner(System.in);
		
		//Create a variable for the number we ask the user
		int num;
		
		//Ask the user for a number
		System.out.println("Introduce un número: ");
		//And read it
		num = sc.nextInt();
		
		//Condition to know how many digits the number has
		if (num <= 10) {
			System.out.println("El número introducido tiene 1 cifra");
		} else if (num >= 100 && num < 1000) {
			System.out.println("El número introducido tiene 2 cifras");
		} else if (num >= 1000 && num < 10000) {
			System.out.println("El número introducido tiene 3 cifras");
		} else if (num >= 10000 && num < 100000) {
			System.out.println("El número introducido tienes 4 cifras");
		} else if (num >= 100000 && num < 1000000) {
			System.out.println("El número introducido tienes 5 cifras");
		} else if (num >= 1000000 && num < 10000000) {
			System.out.println("El número introducido tienes 6 cifras");
		
		//And finally close the scanner
		sc.close();
		
	}

}
}
