package act4;

import java.util.Scanner;

public class act4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcula = new Calculadora();
		Scanner sc = new Scanner(System.in);
		double operante1;
		double operante2;
		String scValue = "";
		boolean salir = false;
		while (!salir) {
			System.out.println("1.Sumar 2.Resta 3.Multiplicar 4.Potencia 5.RaizCuadrada 6.RaizCubica 7.Division 8.Salir");
			scValue = sc.nextLine();
			switch (scValue) {
			case "1":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				calcula.suma(operante1, operante2);
				break;
			case "2":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				calcula.resta(operante1, operante2);
				break;
			case "3":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				calcula.multiplicar(operante1, operante2);
				break;
			case "4":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				calcula.potencia(operante1, operante2);
				break;
			case "5":
				operante1 = unDoubleScanner("Indica el primer operante");
				calcula.raizCuadrada(operante1);
				break;
			case "6":
				operante1 = unDoubleScanner("Indica el primer operante");
				calcula.raizCubica(operante1);
				break;
			case "7":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				try {
					calcula.division(operante1, operante2);
				}catch (MiExceptionAct4 e) {
					// TODO: handle exception
					e.getMessage();
				}	
				break;
			case "8":
				System.out.println("Adios");
				salir = true;
				break;
			default:
				System.out.println("No escogio ninguna de las opciones");
				break;
			}
			
		}

	}

	public static double unDoubleScanner(String text) {
		Scanner scUnOperante = new Scanner(System.in);
	
		double op = 0;
		boolean salir = false;
		do {
			try {	
				System.out.println(text);
				op = scUnOperante.nextDouble();	
				salir = true;
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("El parametro introducido no es un numero, vuelve a intentarlo");
				scUnOperante.next();
			}
		}while(!salir);
	
		
		return op;
	}

/*	public static double dosDoubleScanner() {
		Scanner scDosOperante = new Scanner(System.in);
		
		System.out.println("Indica un numero");
		double op = scDosOperante.nextDouble();
		
		System.out.println("Indica un segundo numero");
		double op2 = scDosOperante.nextDouble();
		return op;
	}*/

}
