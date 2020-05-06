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

		if(sexo=='F'){
			total = (cer*5.0) + (esp*7.0) + (ref*3.0) + 8.0;
			System.out.println("Relatorio: ");
			System.out.printf("Consumo= %.2f%n", (cer*5.0) + (esp*7.0) + (ref*3.0) );
			
			if(total<=38) {
				total = total+4;
				System.out.println("Couvert: R$ 4.00");
			}
			else {
				System.out.println("Isento de Covert");
				
			}
			
			System.out.println("Ingresso: R$ 8.00");
			
			System.out.printf("Valor a pagar= R$ %.2f", total );
			
			
	}
		
		
		if(sexo=='M'){
			
			total = (cer*5.0) + (esp*7.0) + (ref*3.0) + 10.0;
			System.out.println("Relatorio: ");
			System.out.printf("Consumo= %.2f%n", (cer*5.0) + (esp*7.0) + (ref*3.0) );
			
			if(total<=40) {
				total = total+4;
				System.out.println("Couvert: R$ 4.00");
			}
			else {
				System.out.println("Isento de Covert");
				
			}
			
			System.out.println("Ingresso: R$ 10.00");
			
			System.out.printf("Valor a pagar= R$ %.2f", total );
			
			
	}
			
			
	
			
		
		 
		
		
		sc.close();
	}

}
