package aula01.InputOutput;

import javax.swing.JOptionPane;

public class NomeUsu�rio {
	public static void main(String[] args) {

		// vari�veis
		String nameUser;

//		input
		nameUser = JOptionPane.showInputDialog("Insira seu nome: ");

//		output
		JOptionPane.showMessageDialog(null, "Ol� "+nameUser);
		
	}
}
