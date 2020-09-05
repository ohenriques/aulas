package aula01.InputOutput;

import javax.swing.JOptionPane;

public class SomaDoisNumeros {
	public static void main(String[] args) {

//		nesse exercicio foi utilizado as strings, porém é possivel
//		realizar a conversao direto na code line.
		
		// declarando variáveis
		String firstNumero, secondNumber;
		int num1, num2, soma;

		// string recebe os valores digitados
		firstNumero = JOptionPane.showInputDialog("Numero 1:");
		secondNumber = JOptionPane.showInputDialog("Numero 2:");

		// conversão de STRING to INT
		num1 = Integer.parseInt(firstNumero);
		num2 = Integer.parseInt(secondNumber);

		// realizando a soma
		soma = num1 + num2;

//		mostrando resultado
		JOptionPane.showMessageDialog(null, "Resultado: " + soma);
	}
}
