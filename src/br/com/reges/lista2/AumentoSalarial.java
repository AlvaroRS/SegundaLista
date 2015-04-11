/**
 * 
 * @author Alvaro
 * programa que recebe o salario do funcionario, calcula o aumento que o mesmo deve receber
 * e apresenta o valor do novo salario com o aumento
 */
package br.com.reges.lista2;

// permite o o usuário insira informações pelo teclado.
import java.util.Scanner;

public class AumentoSalarial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float aumento = 0;
		
		// recebe salario do funcionário
		System.out.println("Informe o valor do salário");
		  float salario = Float.parseFloat(teclado.nextLine());
		  
		  
		  // calcula o valor do aumento que o funcionário deve receber
		  if(salario <= 600){
			   aumento = (float) (salario * 0.3);
		  }else{
			  if(salario <= 1100){
			   aumento = (float) (salario * 0.25);
		  }else{
			  if(salario <= 2400){
				   aumento = (float) (salario * 0.2);
			  }else{
				  if(salario <= 3500){
					   aumento = (float) (salario * 0.15);
				  }else{
					  if(salario > 3500){
						   aumento = (float) (salario * 0.1);
					  }
				  }
			  }
		  }
	   }
		  // calcula o valor do novo salários
		  float novoSalario = (float) (salario + aumento);
		  
		  // imprime o novo salario
		  System.out.println("O valor de novoSalario do produto será: " + novoSalario );
		

	}

}
