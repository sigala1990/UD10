package act1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MiException Mie = new MiException();
		Scanner sc = new Scanner(System.in);
		CrearAleatorio aleatorio = new CrearAleatorio();
		int resultadoScan, contadorIntento;
		while (!aleatorio.isAcertado()) {
			try {
				System.out.println("Escribe un valor");
				resultadoScan = sc.nextInt();
				aleatorio.comprobar(resultadoScan);
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Introduciste una letra");
				sc.next();
				aleatorio.incrementoContador();

			}

		}

	}

	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}
}
