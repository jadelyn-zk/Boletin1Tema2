package bolentin1tema2;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Create variables for the numbers to make a quadratic ecuation 
		int a;
		int b;
		int c;
		//Then variables for the 3 possibles solutions for x
		double x1;
		double x2;
		double x;
		//And then another variable for the result of our discrimination
		double discriminante;

		// We show the user the ecuation
		System.out.print("Dada esta ecuación: ax^2+bx+c=0");
		
		//And we ask for the coefficient a
		System.out.println("Introduce el valor de a:");
		// And read it
		a = sc.nextInt();
		
		//Ask for the coefficient b
		System.out.println("Introduce el valor de b:");
		// And read it
		b = sc.nextInt();
		
		//Ask for the coefficient b
		System.out.println("Introduce el valor de c:");
		// And read it
		sc = sc.nextInt();
		
		//Now make the equation but only what is inside the root, not counting the -b outside It.
		//If the operation is -b ± square-root(b * b - 4 * a * c) we are going to make first the operations INSIDE the root, then apply it
		
		discriminante= b * b - 4 * a * c;
		
		//Now we make a condition for both possible results (apply the root and the rest of the equation)
		if (discriminante>0) {
			//Applying the + symbol
				x1= (-b + Math.sqrt(discriminante)) / (2*a);
			//Applying the - symbol
				x2= (-b - Math.sqrt(discriminante)) / (2*a);
			System.out.println("Las dos posibles soluciones son: " + x1 + "y" + x2);
		} else if (discriminante==0){
			//If the result of the root is 0 it does not change the value of the rest of numbers so we do not need 2 options, only one.
				x= -b / (2 * a);
			    System.out.println("La solución es x = " + x);
        } else {
            System.out.println("No hay soluciones reales.");
		
		sc.close();
	}

}
