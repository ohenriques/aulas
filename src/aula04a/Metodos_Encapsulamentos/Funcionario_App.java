package aula04a.Metodos_Encapsulamentos;

public class Funcionario_App {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		
		funcionario1.setNome("Paulo");
		funcionario1.setIdade(23);
		funcionario1.setSalario(1234);
		funcionario1.setStatusFerias(true);
		
		funcionario2.setNome("Henrique");
		funcionario2.setIdade(44);
		funcionario2.setSalario(9876);
		funcionario2.setStatusFerias(true);
		
		funcionario3.setNome("Souza");
		funcionario3.setIdade(77);
		funcionario3.setSalario(576);
		funcionario3.setStatusFerias(false);
		
		funcionario1.imprimir();
		funcionario2.imprimir();
		funcionario3.imprimir();
		
		
	}
}
