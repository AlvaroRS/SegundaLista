/**
 * 
 * @author Alvaro
 * programa para verificação de senha.
 */
package br.com.reges.lista2;

// permite que o programa receba informações digitadas pelo usuário.
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
	  
	  
	  // verifica se a senha está correta, e imprime mensagem.
	  if(senha.equals (senhaTeste)){
		  System.out.println("Acesso permitido");
	  }else{
		  System.out.println("Você não tem acesso ao sistema");
	  }
	}
}
