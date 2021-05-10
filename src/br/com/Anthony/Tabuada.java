package br.com.Anthony;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		 int valor1 = tec.nextInt();
		 int multiplicador = 0;
		 while (multiplicador <= 10) {
			System.out.println(valor1 + "x" + multiplicador + "=" + (valor1 * multiplicador ) ); 
			multiplicador += 1;
		 }
		 
		
	}

}
