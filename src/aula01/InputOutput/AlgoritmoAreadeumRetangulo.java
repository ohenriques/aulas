package aula01.InputOutput;

import javax.swing.JOptionPane;

public class AlgoritmoAreadeumRetangulo {

	public static void main(String[] args) {

		// declara��o de vari�veis

		int base, altura, area;

		// realizando a convers�o enquanto gravo os dados na variavel
		base = Integer.parseInt(JOptionPane.showInputDialog("Insira Base do Triangulo:"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura do Triangulo:"));

		// soma dos valor
		area = base * altura;

		// mostrando os valores na sa�da na SWING
		JOptionPane.showMessageDialog(null, "Area do Triangulo �: " + area);

	}

}
