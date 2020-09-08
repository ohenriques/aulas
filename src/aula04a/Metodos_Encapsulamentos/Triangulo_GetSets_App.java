package aula04a.Metodos_Encapsulamentos;

public class Triangulo_GetSets_App {
	
	public static void main(String[] args) {
		
		
		Triangulo_GetSets t1 = new Triangulo_GetSets();
		Triangulo_GetSets t2 = new Triangulo_GetSets();
		
		t1.setBase(10);
		t1.setAltura(20);
		
		t2.setBase(5);
		t2.setAltura(8);
		
		t1.imprimeDados();
		t2.imprimeDados();
		
	}

}
