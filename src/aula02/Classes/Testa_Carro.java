package aula02.Classes;

public class Testa_Carro {
	public static void main(String[] args) {

//		instanciando dois objetos com motor desligado = 0 =false
		Carro car1 = new Carro();
		car1.marca = "GM";
		car1.modelo = "Fiesta";
		car1.ano = 2019;
		car1.valor = 27879f;
		car1.statusMotor = false;

		Carro car2 = new Carro();
		car2.marca = "Ferrari";
		car2.modelo = "F234";
		car2.ano = 2020;
		car2.valor = 279f;
		car2.statusMotor = false;

		car1.ligar();
		System.out.println("-----------------");
		car2.desligar();
	}
}
