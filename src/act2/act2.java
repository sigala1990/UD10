package act2;

import ExceptionCustom.ExceptionCustom;

public class act2 {

	public static void main(String[] args) {
		try {
				System.out.println("Hola mundo");
				throw new ExceptionCustom(0);
		} catch (ExceptionCustom ex) {
			System.out.println(ex.getMessage());
		}
	}
}
