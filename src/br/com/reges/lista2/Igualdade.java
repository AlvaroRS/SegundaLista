/**
 * 
 * @author Alvaro
 * programa que recebe dois números, e infoma se eles são iguais ou não.
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Igualdade {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Recebe os números
		
		System.out.println("Informe o primerio número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo número");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  
		  // verifica se os números são iguais, e imprime mensagem.
		  
		  if(num1 == num2){
			  System.out.println("Os números são iguais");
			  
		  }else{
		  System.out.println("Os números são diferentes");
		  }

	}

}
