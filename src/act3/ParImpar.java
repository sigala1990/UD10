package act3;

import ExceptionCustom.ExceptionCustom;

public class ParImpar {

	private int num;
	
	public ParImpar() {
		this.num = numRandom(0,999);
	}
		
	public void  controlarParImpar() throws ExceptionCustom {
		if(num% 2 == 0) {
			throw new ExceptionCustom(1,num);
		}else {
			throw new ExceptionCustom(2,num);
		}
				
	}
	
	public int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}
	
	
	
}
