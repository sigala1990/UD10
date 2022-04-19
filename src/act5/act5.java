package act5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class act5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password pwd = new Password();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño de la pass");
		int valorSc = sc.nextInt();
		
		List<Password> list = new ArrayList<Password>();
		List<Boolean> listBoolean = new ArrayList<Boolean>();
		for (int i = 0; i < 20; i++) {
			Password pwd2 = new Password(valorSc);
			list.add(pwd2);
			listBoolean.add(pwd2.esFuerte());
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i+1)+" "+list.get(i).getPassword() +" "+ listBoolean.get(i) );
		}
	}

}
