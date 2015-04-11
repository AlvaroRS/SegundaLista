/**
 * 
 * @author Alvaro
 * programa que recebe o valor de compra de um produto e calcula seu valor de venda.
 */
package br.com.reges.lista2;

import java.util.Scanner;

public class Revenda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float lucro;
		
		// recebe o valor de compra do produto
		System.out.println("Informe o valor de compra do produto");
		  float compra = Float.parseFloat(teclado.nextLine());
		  
		  // calcula o valor de venda do produto
		  if(compra < 20){
			   lucro = (float) (compra * 0.45);
		  }else{
			   lucro = (float) (compra * 0.3);
		  }
		  float venda = (float) (compra + lucro);
		  
		  // imprime o valor de venda do produto.
		  System.out.println("O valor de venda do produto será: " + venda );
	}

}
