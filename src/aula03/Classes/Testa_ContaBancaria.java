package aula03.Classes;

public class Testa_ContaBancaria {
	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria();
		c1.numero = 123;
		c1.titular = "hugo";
		c1.saldo = 2400;

		ContaBancaria c2 = new ContaBancaria();
		c2.numero = 456;
		c2.saldo = 500;
		c2.titular = "Pieta";

		ContaBancaria c3 = new ContaBancaria();
		c3.numero = 789;
		c3.saldo = 10500;
		c3.titular = "Severino";

		System.out.println("Titular da conta: " + c1.titular);
		System.out.println("Número da conta: " + c1.numero);
		c1.depositar(400);
		System.out.println("Saldo da conta: " + c1.saldo);
	}
}
