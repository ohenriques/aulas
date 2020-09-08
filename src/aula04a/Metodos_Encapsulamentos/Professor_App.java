package aula04a.Metodos_Encapsulamentos;

public class Professor_App {

	public static void main(String[] args) {
		
		Professor p1 = new Professor();
		Professor p2 = new Professor();
		Professor p3 = new Professor();
		
		p1.setNome("Paulo");
		p1.setMatricula(1234);
		p1.setCargaHoraria(44);
		
		p2.setNome("Henrique");
		p2.setMatricula(432);
		p2.setCargaHoraria(99);
		
		p3.setNome("Souza");
		p3.setMatricula(12333);
		p3.setCargaHoraria(88);
		
		p1.imprimir();
		p2.imprimir();
		p3.imprimir();
		
		
	}
}
