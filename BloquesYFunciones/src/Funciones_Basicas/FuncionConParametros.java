package Funciones_Basicas;



public class FuncionConParametros {

	public static void main(String[] args) {

		System.out.println(SaludarPersona("Ricardo"));
		System.out.println(SaludarPersona("Ana"));
		System.out.println(SaludarPersona("Luis"));
		System.out.println(SaludarPersona("567"));
		
	}

	static String SaludarPersona(String nombre) {
		return "Hola "+nombre;
	}
}
