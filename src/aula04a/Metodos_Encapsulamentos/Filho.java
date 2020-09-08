package aula04a.Metodos_Encapsulamentos;

public class Filho extends Pai {

	public void imprimirFilho() {
		System.out.println("Valor de a " + a); // valor A é publico
		System.out.println("Valor de b " + b); // Valor B é protegido
		System.out.println("Valor de c " + getC()); // Valor C é privado;
	}

}
