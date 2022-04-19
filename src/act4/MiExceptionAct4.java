package act4;

public class MiExceptionAct4 extends Exception {

	private int code;

	public MiExceptionAct4(int code) {
		super();
		this.code = code;
		
	}

	public MiExceptionAct4(String msg) {
		super(msg);
	}

	public MiExceptionAct4() {
		
	}
		
	@Override
	public String getMessage() {
		String msg ="";
		
		switch (code) {
			case 1:
				break;
			case 7:
				msg +="No se puede pasar 0 como segundo operando.";
				break;
			default:
				break;
		}
		System.out.println(msg);
		// TODO Auto-generated method stub
		return msg;

	}


	


}
