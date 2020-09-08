package aula04a.Metodos_Encapsulamentos;

import javax.swing.JOptionPane;

public class Funcionario {

	private boolean statusFerias;
	private int idade;
	private float salario;
	private String nome;

	public boolean isStatusFerias() {
		return statusFerias;
	}

	public void setStatusFerias(boolean statusFerias) {
		this.statusFerias = statusFerias;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void imprimir() {

		JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nSalário: "
				+ getSalario() + "\nSatus Ferias: " + getSalario());
	}

}
