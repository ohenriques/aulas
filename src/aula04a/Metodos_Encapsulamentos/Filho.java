package aula04a.Metodos_Encapsulamentos;

public class Filho extends Pai {

	public void imprimirFilho() {
		System.out.println("Valor de a " + a); // valor A � publico
		System.out.println("Valor de b " + b); // Valor B � protegido
		System.out.println("Valor de c " + getC()); // Valor C � privado;
	}

}
