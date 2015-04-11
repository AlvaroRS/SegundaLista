/**
 * 
 * @author Alvaro
 * programa que recebe as faltas e as notas de um alunos, depois infoma se aluno foi aprovado
 * ou reprovado.
 */
package br.com.reges.lista2;

// permite uso de interface gr�fica
import javax.swing.JOptionPane;

public class Aprovacao {

	public static void main(String[] args) {
		
		// recebe as informa��es do aluno; nome, notas e faltas.
		String nota = JOptionPane.showInputDialog("Informe o nome do aluno ");
		String primeiraNota = JOptionPane.showInputDialog("Informe a primeira nota");
		float nota1 = Float.parseFloat(primeiraNota);
		String segundaNota = JOptionPane.showInputDialog("Informe a segunda nota");
		float nota2 = Float.parseFloat(segundaNota);
		String terceiraNota = JOptionPane.showInputDialog("Informe a terceira nota");
		float nota3 = Float.parseFloat(terceiraNota);
		String falta = JOptionPane.showInputDialog("Informe n�mero de faltas ");
		Float faltas = Float.parseFloat(falta);
		  
		// verifica se o aluno foi reprovado por faltas 
		faltas = ((faltas / 80) * 100);
		float media = ((nota1 + nota2 + nota3)/3);
		if(faltas > 25){
			JOptionPane.showMessageDialog(null,"Reprovado por faltas");
			
			// Caso aluno n�o tenha sido reprovado por faltas, verifica se o mesmo foi reporvado
			// aprovado pelas suas notas.
		}else{
			if(media < 7 ){
				JOptionPane.showMessageDialog(null, "Reprovado por notas");
			}else{
				JOptionPane.showMessageDialog(null,"Aluno aprovado");
			}
		}
	}

}
