package aula04a.Metodos_Encapsulamentos;

import javax.swing.JOptionPane;

public class Professor {

	private String nome;
	private int matricula;
	private int cargaHoraria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public void imprimir() {
		JOptionPane.showMessageDialog(null,
				"Nome: " + getNome() + "\nMatricula: " + getMatricula() + "\nCarga horaria: " + getCargaHoraria());
	}

}
