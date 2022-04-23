package ExceptionCustom;

public class ExceptionCustom extends Exception {

	private int code;
	private int num;

	public ExceptionCustom(int code) {
		super();
		this.code = code;
	}
	public ExceptionCustom(int code,int num) {
		super();
		this.code = code;
		this.num = num;
	}

	public ExceptionCustom(String msg) {
		super(msg);
	}

	public ExceptionCustom() {

	}

	@Override
	public String getMessage() {
		String msg = "";


		switch (code) {
		case 0:
			msg = "Mensaje mostrado por pantalla\nExepcion capturada con mensaje: Esto es un objeto Exception\nPrograma terminado";
			break;
		case 1:
			msg += "Generando numero aleatorio...\n";
			msg += "El num aleatorio generado es : " + num + "\n";
			msg += "Es par";
			break;
		case 2:
			msg += "Generando numero aleatorio...\n";
			msg += "El num aleatorio generado es : " + num + "\n";
			msg += "Es impar";
			break;
		case 3:
			msg = "No se puede dividir por 0, la proxima vez introduce otro numero como segundo operando";
			break;
		case 4:
			msg = "No se puede dividir por 0, la proxima vez introduce otro numero como segundo operando";
			break;
		case 5:
			msg = "La raiz cuadrada no puede ser negativa";
			break;
		case 6:
			msg = "Fallaste 3 veces, tendras que loguear de nuevo";
			break;
		default:
			msg += "";
			break;
		}
		System.out.println(msg);
		// TODO Auto-generated method stub
		return msg;

	}

}
