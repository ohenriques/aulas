package aula01.InputOutput;

import javax.swing.JOptionPane;

public class SomatoriaMedia {

	public static void main(String[] args) {

//		variables
		int num1, num2, num3, num4, media, soma;

//		input
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Numero 3: "));
		num4 = Integer.parseInt(JOptionPane.showInputDialog("Numero 4: "));

//		result
		media = (num1 + num2 + num3 + num4) / 4;
		soma = num1 + num2 + num3 + num4;

//		output
		JOptionPane.showMessageDialog(null, "Media: " + media + " Soma: " + soma);
	}
}
