package act4;

public class Calculadora {

	private double resultado;
	
	
	public Calculadora() {

	}
	
	public void suma(double op1, double op2) {//suma
		double resultado = op1 + op2; 
		System.out.println(resultado);
	}
	
	public void resta(double op1, double op2) {//resta
		double resultado = op1 - op2; 
		System.out.println(resultado);
	}
	public void multiplicar(double op1, double op2) {//producto
		double resultado = op1 * op2; 
		System.out.println(resultado);
	}
	public void potencia(double op1, double op2) {//elevado
		double resultado = Math.pow(op1, op2);
		System.out.println(resultado);
	}
	public void raizCuadrada(double op1) {//raizcuadrada
		double resultado = Math.sqrt(op1);
	}
	public void raizCubica(double op1) {//raizalatres
		double resultado = Math.cbrt(op1);
		System.out.println(resultado);
	}
	public void division(double op1, double op2) throws MiExceptionAct4 {//division
		if(op2 == 0) {//no se puede dividir por 0
			throw new MiExceptionAct4(7);
		}else {
			double resultado = op1 / op2;	
		}		 
		System.out.println(resultado);
	}
}
