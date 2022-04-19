package act2;

public class act2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
				System.out.println("Hola mundo");
				throw new MiExceptionAct2();
		} catch (MiExceptionAct2 ex) {
		//	System.out.println(ex);
			System.out.println(ex.getMessage());
			// TODO: handle exception
		}
	}
}
