package aula04a.Metodos_Encapsulamentos;

public class ExemploMetodoEstatico {

	private static int objetos = 0;

	public ExemploMetodoEstatico() {
		objetos++;
	}

	public static int getObjetos() {
		return objetos;
	}

}
