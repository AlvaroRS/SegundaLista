/**
 * 
 * @author Alvaro
 * programa que recebe um n�mero, e informa se este � par ou impar.
 */
package br.com.reges.lista2;

// permite entrada de dados pelo teclado.
import java.util.Scanner;

public class ParInpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// recebe n�mero informado pelo usu�rios
		System.out.println("Informe um n�mero");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		 
		  // verifica se o n�mero � par ou impar e imprime mensagem.
		  if(num1 % 2 == 0){
			  System.out.println("O n�mero � par");
			  
		  }else{
		  System.out.println("O n�mero � impar");
		  }

	}

}


