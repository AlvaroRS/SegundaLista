/**
 * 
 * @author Alvaro
 * programa para verifica��o de senha.
 */
package br.com.reges.lista2;

// permite que o programa receba informa��es digitadas pelo usu�rio.
import java.util.Scanner;


public class Batata {
	
 
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	// define a senha de acesso
	String senhaTeste = "batatafrita";
	
	// recebe a senha digitada pelo usuario
	System.out.println("Informe a senha");
	  String senha = teclado.nextLine();
	  System.out.println(senha);
	  
	  
	  // verifica se a senha est� correta, e imprime mensagem.
	  if(senha.equals (senhaTeste)){
		  System.out.println("Acesso permitido");
	  }else{
		  System.out.println("Voc� n�o tem acesso ao sistema");
	  }
	}
}
