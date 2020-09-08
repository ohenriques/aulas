package aula04a.Metodos_Encapsulamentos;

public class ContaAgua_App {
	
	public static void main(String[] args) {
		
		ContaAgua c1 = new ContaAgua();
		
		c1.setAno(2020);
		c1.setMes(6);
		c1.setNumero(1234);
	
		c1.setM3(0);
		
		c1.calcularValor();		
	
		c1.imprimirDados();
		
	}

}
