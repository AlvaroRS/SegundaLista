/**
 * 
 * @author Alvaro
 * programa que recebe dois números, e apresenta o maior deles .
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// recebe os numeros
		System.out.println("Informe o primerio número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo número");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  
		  // verifica qual é maior, e o imprime.
		  if(num1 > num2 ){
			  System.out.println(num1);
			  
		  }else{
		  System.out.println(num2);
		  

		  }

	}

}
