/**
 * 
 * @author Alvaro
 * programa que recebe dois n�meros, e infoma se eles s�o iguais ou n�o.
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Igualdade {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Recebe os n�meros
		
		System.out.println("Informe o primerio n�mero");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo n�mero");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  
		  // verifica se os n�meros s�o iguais, e imprime mensagem.
		  
		  if(num1 == num2){
			  System.out.println("Os n�meros s�o iguais");
			  
		  }else{
		  System.out.println("Os n�meros s�o diferentes");
		  }

	}

}
