package aula01.InputOutput;

import javax.swing.JOptionPane;

public class MediaDe4Num {
	public static void main(String[] args) {

//		declarando variveis
		int num1, num2, num3, num4, result;

		// entrada dos dados
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2: "));
		num3 = Integer.parseInt(JOptionPane.showInputDialog("Número 3: "));
		num4 = Integer.parseInt(JOptionPane.showInputDialog("Número 4: "));

		// soma dos valores e média

		result = (num1 + num2 + num3 + num4) / 4;
		// mostrar a media dos valores

		JOptionPane.showMessageDialog(null, "A média dos números é: " + result);
	}
}
