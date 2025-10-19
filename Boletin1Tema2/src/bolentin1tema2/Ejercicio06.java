package bolentin1tema2;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Create the scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables for each number we are going to ask the user
		int num1; 
		int num2; 
		int num3; 
		
		//Ask for the first number
		System.out.print("Introduce  A: ");
		//And read it
		num1 = sc.nextInt();
		
		//Ask for the second number
		System.out.print("Introduce  B: ");
		//And read it
		num2 = sc.nextInt();
		
		//Ask for the third number
		System.out.print("Introduce  C: ");
		//And read it
		num3 = sc.nextInt();
		
		
		//Now make the conditional to know if the sum of the 2 first numbers results in the third
		if (num1 + num2 == num3) {
			System.out.println("A + B = C");
		//Then for the first and third number
		} else if (num1 + num3 == num2) {
			System.out.println("A + C = B");
		//And finally for the second and third number
		}else if (num2 + num3 == num1) {
			System.out.println("C + B = A");
		//If none of this happens, then any combination of 2 numbers results in the third one
		}else {
			System.out.println("Ninguna combinación de dos numeros sumados da el restante");
		}
		
		//Close the scanner
		sc.close();
	}

}
