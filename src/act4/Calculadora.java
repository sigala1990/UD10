package act4;

import java.util.Scanner;

import ExceptionCustom.ExceptionCustom;

public class Calculadora {

	public Calculadora() {

	}

	public void suma(double op1, double op2) {// suma
		double resultado = op1 + op2;
		System.out.println(resultado);
	}

	public void resta(double op1, double op2) {// resta
		double resultado = op1 - op2;
		System.out.println(resultado);
	}

	public void multiplicar(double op1, double op2) {// producto
		double resultado = op1 * op2;
		System.out.println(resultado);
	}

	public void potencia(double op1, double op2) {// elevado
		double resultado = Math.pow(op1, op2);
		System.out.println(resultado);
	}

	public void raizCuadrada(double op1) throws ExceptionCustom {// raizcuadrada
		if (op1 < 0) {
			throw new ExceptionCustom(5);
		}
		double resultado = Math.sqrt(op1);
	}

	public void raizCubica(double op1) {// raizalatres
		double resultado = Math.cbrt(op1);
		System.out.println(resultado);
	}

	public void division(double op1, double op2) throws ExceptionCustom {// division
		double resultado = 0;
		if (op2 == 0) {// no se puede dividir por 0
			throw new ExceptionCustom(3);
		} else {
			resultado = op1 / op2;
		}
		System.out.println(resultado);
	}
	public void consola() {
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
				suma(operante1, operante2);
				break;
			case "2":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				resta(operante1, operante2);
				break;
			case "3":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				multiplicar(operante1, operante2);
				break;
			case "4":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				potencia(operante1, operante2);
				break;
			case "5":
				operante1 = unDoubleScanner("Indica el primer operante");
				try {
					raizCuadrada(operante1);	
				} catch (Exception e) {
					e.getMessage();
				}
				
				break;
			case "6":
				operante1 = unDoubleScanner("Indica el primer operante");
				raizCubica(operante1);
				break;
			case "7":
				operante1 = unDoubleScanner("Indica el primer operante");
				operante2 = unDoubleScanner("Indica el segundo operante");
				try {
					division(operante1, operante2);
				}catch (ExceptionCustom e) {
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
}
