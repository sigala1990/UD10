package act2;

public class MiExceptionAct2 extends Exception {

	private int code;

	public MiExceptionAct2(int codigoError) {
		super();
		this.code = codigoError;
	}

	public MiExceptionAct2(String msg) {
		super(msg);
	}

	public MiExceptionAct2() {
		
	}
		
	@Override
	public String getMessage() {
		
		String msg ="";
		switch (code) {

		default:
			msg = "Mensaje mostrado por pantalla\nExepcion capturada con mensaje: Esto es un objeto Exception\nPrograma terminado";
			break;
		}
		// TODO Auto-generated method stub
		return msg;

	}

	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
