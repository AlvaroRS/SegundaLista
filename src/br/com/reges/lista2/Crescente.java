/**
 * 
 * @author Alvaro
 * programa que recebe dois números, e os apresenta em ordem crescente.
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Crescente {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// recebe os númeors
		System.out.println("Informe o primerio número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo número");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  // ordena e apresenta os numeros
		  if(num1 > num2 ){
			  System.out.println(num1 + ","+num2);
		  }else{
			  System.out.println(num2 +","+num1);
			  

			  }

	}

}
