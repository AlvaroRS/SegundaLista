/**
 * 
 * @author Alvaro
 * programa que recebe três números, e os apresenta em ordem crescente.
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Crescente3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		// recebe os números.
		 System.out.println("Informe o primerio número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o segundo número");
		  int num2 = Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Informe o terceiro número");
		  int num3 = Integer.parseInt(teclado.nextLine());
		  
		  
		  // ordena os números, e os apresenta.
		  if(num1 < num2 && num2 < num3){
			  System.out.println(num1+", "+num2+", "+num3);
		  }else{
			  if(num1 < num3 && num3 < num2){
				  System.out.println(num1+", "+num3+", "+num2);
			  }else{
				  if(num2 < num1 && num1 < num3){
				  System.out.println(num2+", "+num1+", "+num3);
				  }else{
					  if(num2 < num3 && num3 < num1){
						  System.out.println(num2+", "+num3+", "+num1);
					  }else{
						  if(num3 < num1 && num1 < num2){
							  System.out.println(num3+", "+num1+", "+num2);
						  }else{
							  if(num3 < num2 && num2 < num1){
								  System.out.println(num3+", "+num2+", "+num1);
							  }
						  }
					  }
				  }
			  }
		  }
	}

}
