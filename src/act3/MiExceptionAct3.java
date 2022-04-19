package act3;

public class MiExceptionAct3 extends Exception {

	private int resto;
	private int numRandom;

	public MiExceptionAct3(int numRandom, int resto) {
		super();
		this.numRandom = numRandom;
		this.resto = resto;
	}

	public MiExceptionAct3(String msg) {
		super(msg);
	}

	public MiExceptionAct3() {
		
	}
		
	@Override
	public String getMessage() {
		String msg ="";
		msg +="Generando numero aleatorio...\n";
		msg +="El num aleatorio generado es : "+ numRandom+"\n";
	
		switch (resto) {
			case 1:
				msg +="Es impar";
				break;
			default:
				msg += "Es par";
				break;
		}
		System.out.println(msg);
		// TODO Auto-generated method stub
		return msg;

	}

	public int getResto() {
		return resto;
	}

	public void setResto(int resto) {
		this.resto = resto;
	}

	public int getNumRandom() {
		return numRandom;
	}

	public void setNumRandom(int numRandom) {
		this.numRandom = numRandom;
	}

	


}
