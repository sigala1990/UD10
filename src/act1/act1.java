package act1;

import java.util.InputMismatchException;
import java.util.Scanner;

import act2.MiExceptionAct2;

public class act1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MiException Mie = new MiException();
		Scanner sc = new Scanner(System.in);
		CrearAleatorio aleatorio = new CrearAleatorio();
		int resultadoScan, contadorIntento;
			while (!aleatorio.isAcertado()) {
				try {
					System.out.println("Escribe un valor");
					resultadoScan = sc.nextInt();
					aleatorio.comprobar(resultadoScan);	
				}catch (InputMismatchException e) {
					// TODO: handle exception
					System.out.println("Introduciste una letra");
					sc.next();
					aleatorio.incrementoContador();
					
				}
				
				
			}
			
		
	/*	Scanner sc = new Scanner(System.in);
		MiException MiE = new MiException();

		boolean acierto = false;
		int numRandom = numRandom(1, 500);
		int resultado = 0;
		int contadorIntentos = 1;
		while (!acierto) {
			try {
				System.out.println("Introduce un numero, para ");
				resultado = sc.nextInt();
				if (resultado > numRandom) {
					System.out.println("El numero es mas pequeño");
				} else if (resultado < numRandom) {
					System.out.println("El numero es mas grande");
				} else {
					System.out.println("FELICIDADES LO ENCONTRASTE");
					System.out.println("Tuviste " + contadorIntentos + " intentos.");
					acierto = true;
				}
				contadorIntentos++;

			} catch (MiException ex) {
				System.out.println("Che la liaste, no pusiste un numero");
				contadorIntentos++;
				sc.next();
			}

		}*/

	}

	public static void act1()  {
		Scanner sc = new Scanner(System.in);
		MiExceptionAct2 MiE = new MiExceptionAct2();

		boolean acierto = false;
		int numRandom = numRandom(1, 500);
		int resultado = 0;
		int contadorIntentos = 1;
		while (!acierto) {
		try {
				
			
			System.out.println("Introduce un numero, para ");
			resultado = sc.nextInt();
			if (resultado > numRandom) {
				System.out.println("El numero es mas pequeño");
			} else if (resultado < numRandom) {
				System.out.println("El numero es mas grande");
			} else {
				System.out.println("FELICIDADES LO ENCONTRASTE");
				System.out.println("Tuviste " + contadorIntentos + " intentos.");
				acierto = true;
			}
			contadorIntentos++;
			}catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("Che la liaste, no pusiste un numero");
				contadorIntentos++;
				sc.next();
				
			}
		}
	}

	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}
}
