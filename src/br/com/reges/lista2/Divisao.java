/**
 * 
 * @author Alvaro
 * programa que recebe dois n�meros, e informa se o primeiro n�mero � divisivel pelo segundo.
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
	// recebe os n�meros.
		System.out.println("Informe o primerio n�mero");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo n�mero");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  
		  // verifica se o primeiro n�mero � divis�vel pelo segndo.
		  if(num1 % num2 == 0){
			  System.out.println(num1 + " � divis�vel por " + num2);
			  
		  }else{
		  System.out.println(num1 + " n�o � divis�vel por " + num2);
		  

		  }

	}
}