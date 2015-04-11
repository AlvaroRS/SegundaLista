/**
 * 
 * @author Alvaro
 * programa que recebe um número, e informa se este é par ou impar.
 */
package br.com.reges.lista2;

// permite entrada de dados pelo teclado.
import java.util.Scanner;

public class ParInpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// recebe número informado pelo usuários
		System.out.println("Informe um número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		 
		  // verifica se o número é par ou impar e imprime mensagem.
		  if(num1 % 2 == 0){
			  System.out.println("O número é par");
			  
		  }else{
		  System.out.println("O número é impar");
		  }

	}

}


