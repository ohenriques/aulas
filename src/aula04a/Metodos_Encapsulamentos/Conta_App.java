package aula04a.Metodos_Encapsulamentos;

public class Conta_App {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.setConta(1234);
		c1.setNome("Paulo");
		c1.setSaldo(1000);
		
		c1.imprimirRecibo();
		c1.deposito(0);
		c1.imprimirRecibo();
		
		c1.saque(0);
		c1.imprimirRecibo();
		
		
		
	}
}
