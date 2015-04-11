/**
 * 
 * @author Alvaro
 * programa que recebe dois números, e informa se o primeiro número é divisivel pelo segundo.
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
	// recebe os números.
		System.out.println("Informe o primerio número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo número");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  
		  // verifica se o primeiro número é divisível pelo segndo.
		  if(num1 % num2 == 0){
			  System.out.println(num1 + " é divisível por " + num2);
			  
		  }else{
		  System.out.println(num1 + " não é divisível por " + num2);
		  

		  }

	}
}