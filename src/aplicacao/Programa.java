package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		char sexo;
		
		int cer,ref,esp;
		double  total;
		
		System.out.println("Sexo: ");
		sexo = sc.next().charAt(0);
		
		System.out.println("Quantidade de cervejas: ");
		cer = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		ref = sc.nextInt();
		System.out.println("Quantidade de espetinhos: "); 
		esp = sc.nextInt();
		
		sc.close();
	}

}
