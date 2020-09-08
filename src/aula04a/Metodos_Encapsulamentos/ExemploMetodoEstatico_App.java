package aula04a.Metodos_Encapsulamentos;

public class ExemploMetodoEstatico_App {

	public static void main(String[] args) {

		System.out.println("Total de Objetos: " + ExemploMetodoEstatico.getObjetos());
		System.out.println("Criando o primeiro Objeto...");
		ExemploMetodoEstatico obj1 = new ExemploMetodoEstatico();
		
		System.out.println("Total de Objetos: " + ExemploMetodoEstatico.getObjetos());
		System.out.println("Criando o segundo Objeto...");
		
		ExemploMetodoEstatico obj2 = new ExemploMetodoEstatico();
		
		System.out.println("Total de Objetos: " + ExemploMetodoEstatico.getObjetos());
		System.out.println("Criando o terceiro Objeto...");
		ExemploMetodoEstatico obj3 = new ExemploMetodoEstatico();
		System.out.println("Total de Objetos: " + ExemploMetodoEstatico.getObjetos());

	}
}
