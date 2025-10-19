package bolentin1tema2;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Create the scanner
		Scanner sc = new Scanner(System.in);
		// Create 2 variables for the play of two players
		String jugador1;
		String jugador2;

		// Ask the first player for their play
		System.out.println("JUGADOR 1: Introduce tu jugada (PIEDRA, PAPEL O TIJERA): ");
		// And read it
		jugador1 = sc.next().toUpperCase();

		// Ask the second player for their play
		System.out.println("JUGADOR 2: Introduce tu jugada (PIEDRA, PAPEL O TIJERA): ");
		// And read it
		jugador2 = sc.next().toUpperCase();

		// Now make a condition for each possible play, starting with the draw.
		if (jugador1.equals(jugador2)) {
			System.out.println("EMPATE");
		// Now start with all player 1 possibilities of win
		} else if ((jugador1.equals("PIEDRA") && jugador2.equals("TIJERA"))
				|| (jugador1.equals("PAPEL") && jugador2.equals("PIEDRA"))
				|| (jugador1.equals("TIJERA") && jugador2.equals("PAPEL"))) {
			System.out.println("Gana el jugador 1");
		// Then, if none of player 1 plays is a win, then is a win for the player 2
		} else {
			System.out.println("Gana el jugador 2");

		}

		sc.close();
	}

}
