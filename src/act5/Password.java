package act5;

import java.util.Scanner;

import ExceptionCustom.ExceptionCustom;

public class Password {

	/*
	 * @Auth Adria Queralt
	 */
	private int longitud;
	private String password;

	public Password() {
		this.longitud = 8;
		this.password = generarPassword(longitud);
	}

	public Password(int longitud) {
		//super();
		this.longitud = longitud;
		this.password = generarPassword(longitud);
	}

	public String generarPassword(int size) { // recoge valor por codigo ASCII
		int i = 0;
		String passwordfinal = "";
		while (i < size) {
			int numRandom = numRandom(1, 4);
			int numTipo = 0;
			switch (numRandom) {
			case 1:
				numTipo = numRandom(48, 57); // 0-9
				break;
			case 2:
				numTipo = numRandom(65, 91); // A-Z
				break;
			case 3:
				numTipo = numRandom(97, 123); // a-z
				break;
			}
			i++;
			char caracter = (char) numTipo;
			passwordfinal += caracter;
		}
		return passwordfinal;
	}

	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}

	public boolean esFuerte() {//controlamos si la pasword tiene  mayus mins y nnumeros
		int contadorMayus = 0, contadorMin = 0, contadorNum = 0;
		for (int i = 0; i < password.length(); i++) {
			char letra = password.charAt(i);

			if ((int) letra > 48 && (int) letra < 57) {// 0-9
				contadorNum++;
			} else if ((int) letra > 65 && (int) letra < 91) {// Mayus
				contadorMayus++;
			} else if ((int) letra > 97 && (int) letra < 123) {// Mins
				contadorMin++;
			}
		}
		if (contadorNum > 4 && contadorMin > 0 && contadorMayus > 1) {
			return true;
		}
		return false;
	}
	

	public void comprobarPasswd()  throws ExceptionCustom {//lanzamiento exception en el metodo
		Scanner sc = new Scanner(System.in);
		boolean acertada = false;
		int contador = 0;
		while(!acertada && contador < 3) {
			System.out.println("Introduce la pwd");
			String text = sc.nextLine();
			if(text.equals(password)) {//si coincide
				acertada = true;
				System.out.println("Logueado!");
			}	
			contador++;
			
		}
		if(contador == 3 && !acertada) {//intentos finalizados y no la a acertado
				throw new ExceptionCustom(6);
			}
			
		}
	
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
