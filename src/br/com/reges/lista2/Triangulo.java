/**
 * 
 * @author Alvaro
 * programa que recebe  três valores reais e informa se estes podem ou não formar os lados 
 * de um triângulo e qual tipo de triângulo seria: equilátero, isósceles ou escaleno..
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// recebe os valores
		 System.out.println("Informe o primerio número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo número");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o terceiro número");
		  int num3 = Integer.parseInt(teclado.nextLine());
		  
		  // recebe os valores podem ou não formar os lados de um triângulo 
		  //e qual tipo de triângulo seria
		  if(num1 < 0 || num2 < 0 || num3 < 0){
			  System.out.println("Os números informados não podem formar um triangulo");
		  }else{
			  if(num1 == num2 && num2 == num3){
				  System.out.println("Os números informados formam um triangulo equilátero");  
			  }else{
				  if(num1 != num2 && num2 != num3){
					  System.out.println("Os números informados formam um triangulo escaleno"); 
				  }else{
					  if(( num1 == num2 && num2 != num3 ) || (num1 == num3 && num2 != num3) || (num1 != num2 && num2 == num3)){
						  System.out.println("Os números informados formam um triangulo isósceles");
					  }
				  }
			  }
		  }
	}
	
}