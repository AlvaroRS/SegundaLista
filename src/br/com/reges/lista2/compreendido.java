/**
 * 
 * @author Alvaro
 * programa que recebe um número, e verifica se o memso está compreendido entre 20 e 90.
 */
package br.com.reges.lista2;

// permite que o progrma recebe informações, digitadas pelo usuário.
import java.util.Scanner;

public class compreendido {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// recebe o número
		System.out.println("Informe o  número");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  // verifica se o numero está compreendido entre 20 e 90, e imprime mensagem
		  if(num1 > 20 && num1 < 90 ){
			  System.out.println( num1 + " está compreendido entre 20 e 90");
		  }else{
			  System.out.println(num1 + " NÃO está compreendido entre 20 e 90");
			  

		  }
	}

}
