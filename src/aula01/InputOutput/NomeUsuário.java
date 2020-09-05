package aula01.InputOutput;

import javax.swing.JOptionPane;

public class NomeUsuário {
	public static void main(String[] args) {

		// variáveis
		String nameUser;

//		input
		nameUser = JOptionPane.showInputDialog("Insira seu nome: ");

//		output
		JOptionPane.showMessageDialog(null, "Olá "+nameUser);
		
	}
}
