package aula01.InputOutput;

import javax.swing.JOptionPane;

public class ValorTresProdutos {
	public static void main(String[] args) {

//		variables
		Double qtde1, valor1, qtde2, valor2, qtde3, valor3, result;

//		input
		qtde1 = Double.parseDouble(JOptionPane.showInputDialog("Quantidade 1:"));
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Valor 1:"));
		qtde2 = Double.parseDouble(JOptionPane.showInputDialog("Quantidade 2:"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Valor 2:"));
		qtde3 = Double.parseDouble(JOptionPane.showInputDialog("Quantidade 3:"));
		valor3 = Double.parseDouble(JOptionPane.showInputDialog("Valor 3:"));

//		result
		result = (qtde1 * valor1) + (qtde2 * valor2) + (qtde3 * valor3);

//		output
		JOptionPane.showMessageDialog(null, "Resultado: " + result);
		
	}
}
