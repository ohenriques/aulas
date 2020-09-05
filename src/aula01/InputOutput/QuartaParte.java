package aula01.InputOutput;

import javax.swing.JOptionPane;

public class QuartaParte {
	public static void main(String[] args) {

//		variables
		int num, quadrado;
		double num2, quadrado2;
		
//		input
		num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo numero: "));

//		result ------ Using the library Math
		quadrado = num * num;
		quadrado2 = Math.pow(num2, 2);

//		output
		JOptionPane.showMessageDialog(null, "O quadrado no 1º número " + num + " é " + quadrado);
		JOptionPane.showMessageDialog(null, "O quadrado no 2º número " + num2 + " é " + quadrado2);
		
	}
}
