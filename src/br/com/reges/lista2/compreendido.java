/**
 * 
 * @author Alvaro
 * programa que recebe um n�mero, e verifica se o memso est� compreendido entre 20 e 90.
 */
package br.com.reges.lista2;

// permite que o progrma recebe informa��es, digitadas pelo usu�rio.
import java.util.Scanner;

public class compreendido {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		// recebe o n�mero
		System.out.println("Informe o  n�mero");
		  int num1 = Integer.parseInt(teclado.nextLine());
		  
		  // verifica se o numero est� compreendido entre 20 e 90, e imprime mensagem
		  if(num1 > 20 && num1 < 90 ){
			  System.out.println( num1 + " est� compreendido entre 20 e 90");
		  }else{
			  System.out.println(num1 + " N�O est� compreendido entre 20 e 90");
			  

		  }
	}

}
