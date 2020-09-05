package aula01.InputOutput;

import javax.swing.JOptionPane;

public class AlgoritmoAreadeumRetangulo {

	public static void main(String[] args) {

		// declaração de variáveis

		int base, altura, area;

		// realizando a conversão enquanto gravo os dados na variavel
		base = Integer.parseInt(JOptionPane.showInputDialog("Insira Base do Triangulo:"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura do Triangulo:"));

		// soma dos valor
		area = base * altura;

		// mostrando os valores na saída na SWING
		JOptionPane.showMessageDialog(null, "Area do Triangulo é: " + area);

	}

}
