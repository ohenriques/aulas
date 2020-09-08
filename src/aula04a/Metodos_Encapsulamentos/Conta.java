package aula04a.Metodos_Encapsulamentos;

import javax.swing.JOptionPane;

public class Conta {

	private String nome;
	private int conta;
	private float saldo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float deposito(float valorDeposito) {
		return this.saldo = getSaldo() + Float
				.parseFloat(JOptionPane.showInputDialog("Depositar: ", valorDeposito));

	}

	public float saque(float valorSaque) {
		return this.saldo = getSaldo() - Float.parseFloat(JOptionPane.showInputDialog("Saque: ",valorSaque));

	}

	public void imprimirRecibo() {
		JOptionPane.showMessageDialog(null,
				"Nome: " + getNome() + "\nConta: " + getConta() + "\nSaldo: " + getSaldo());
	}
}
