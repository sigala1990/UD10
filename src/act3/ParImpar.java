package act3;

public class ParImpar {

	private int num;
	
	public ParImpar() {
		this.num = numRandom(0,999);
	}
		
	public void  controlarParImpar() throws MiExceptionAct3 {
			throw new MiExceptionAct3(num ,num % 2);	
	}
	
	public int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}
	
	
	
}
