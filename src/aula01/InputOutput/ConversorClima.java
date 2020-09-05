package aula01.InputOutput;

import javax.swing.JOptionPane;

public class ConversorClima {
	public static void main(String[] args) {

//	variables
		int tempCel, tempFah;

//	input
		tempCel = Integer.parseInt(JOptionPane.showInputDialog("Temperatura em Celsius: "));

//	result
		tempFah = (9 * tempCel + 160) / 5;

//	output
		JOptionPane.showMessageDialog(null, tempCel + " Graus Celsius são " + tempFah + " Fahrenheits");
	}
}
