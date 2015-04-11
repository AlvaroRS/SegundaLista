/**
 * 
 * @author Alvaro
 * programa que recebe  tr�s valores reais e informa se estes podem ou n�o formar os lados 
 * de um tri�ngulo e qual tipo de tri�ngulo seria: equil�tero, is�sceles ou escaleno..
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// recebe os valores
		 System.out.println("Informe o primerio n�mero");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo n�mero");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o terceiro n�mero");
		  int num3 = Integer.parseInt(teclado.nextLine());
		  
		  // recebe os valores podem ou n�o formar os lados de um tri�ngulo 
		  //e qual tipo de tri�ngulo seria
		  if(num1 < 0 || num2 < 0 || num3 < 0){
			  System.out.println("Os n�meros informados n�o podem formar um triangulo");
		  }else{
			  if(num1 == num2 && num2 == num3){
				  System.out.println("Os n�meros informados formam um triangulo equil�tero");  
			  }else{
				  if(num1 != num2 && num2 != num3){
					  System.out.println("Os n�meros informados formam um triangulo escaleno"); 
				  }else{
					  if(( num1 == num2 && num2 != num3 ) || (num1 == num3 && num2 != num3) || (num1 != num2 && num2 == num3)){
						  System.out.println("Os n�meros informados formam um triangulo is�sceles");
					  }
				  }
			  }
		  }
	}
	
}