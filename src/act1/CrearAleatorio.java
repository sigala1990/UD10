package act1;

public class CrearAleatorio {

	private int numRandom;
	private int contadorIntento;
	private boolean acertado;
	

	public CrearAleatorio() {
		this.numRandom = crearNumRandom();	
		this.acertado = false;
		this.contadorIntento = 1;
	}
	
	public int crearNumRandom() {
		return numRandom(1,500); 
	}
	
	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}
	
	public void comprobar(int num) {
		if(num > numRandom) {
			System.out.println("El numero es mas pequeño que "+ num);
			contadorIntento++;
		}else if (num < numRandom) {
			System.out.println("El numero es mas grande que "+ num);
			contadorIntento++;
		}else {
			System.out.println("Has acertado enorabuena");
			System.out.println("Tus intentos han sido "+ contadorIntento );
			acertado = true;
		}
		
	}
	
	public void incrementoContador() {
		contadorIntento++;
	}

	public boolean isAcertado() {
		return acertado;
	}

	public void setAcertado(boolean acertado) {
		this.acertado = acertado;
	}

	
	public int getNumRandom() {
		return numRandom;
	}

	public void setNumRandom(int numRandom) {
		this.numRandom = numRandom;
	}

	public int getContadorIntento() {
		return contadorIntento;
	}

	public void setContadorIntento(int contadorIntento) {
		this.contadorIntento = contadorIntento;
	}
	
	/*public boolean esMenor(int num) {
		if(num > numRandom) {
			return true;
		}
		return false;
	}
	
	public boolean esMayor(int num) {
		if(num < numRandom) {
			return true;
		}
		return false;
	}*/
	
	
}
