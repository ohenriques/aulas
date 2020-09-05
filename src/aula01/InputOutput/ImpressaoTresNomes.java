package aula01.InputOutput;

import javax.swing.JOptionPane;

public class ImpressaoTresNomes {

	public static void main(String[] args) {

//		variable
		String name1, name2, name3;

//		input
		name1 = JOptionPane.showInputDialog("Primeiro nome: ");
		name2 = JOptionPane.showInputDialog("Segundo nome: ");
		name3 = JOptionPane.showInputDialog("Terceiro nome: ");

//		output
		JOptionPane.showMessageDialog(null, "Olá " + name1 +" "+ name2 +" "+ name3);
	}

}
