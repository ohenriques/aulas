package aula03.Classes;

public class ContaBancaria {

//	atributos
	public int numero;
	public String titular;
	public float saldo;

//	metodos
	public void sacar(float valor) {
		this.saldo = saldo - valor;
	}

	public void depositar(float valor) {
		this.saldo = saldo + valor;
	}

	public void transferir(ContaBancaria origem, ContaBancaria destino, float valor) {

	}
}
