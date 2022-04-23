package act3;

import ExceptionCustom.ExceptionCustom;

public class act3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ParImpar num = new ParImpar();
		try {
			num.controlarParImpar();	
		}catch (ExceptionCustom e) {
			// TODO: handle exception
			e.getMessage();
		}
		
		}
		
	
}
