package aula01.InputOutput;

import javax.swing.JOptionPane;

public class VolumeCilindro {
	public static void main(String[] args) {

//		declarar variáveis
		double raio, altura, result;

//		entrando com valores
		raio = Double.parseDouble(JOptionPane.showInputDialog("Raio: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));

//		calculando volume
		result = 3.14 * raio * (2 * altura);

//		mostrando resultado
		JOptionPane.showMessageDialog(null, "Volume é: " + result);
	}
}
