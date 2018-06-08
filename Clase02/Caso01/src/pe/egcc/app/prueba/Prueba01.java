package pe.egcc.app.prueba;

import pe.egcc.app.service.SumaService;

public class Prueba01 {

	public static void main(String[] args) {
	
		// Datos
		int n1 = 12;
		int n2 = 15;
		
		// Proceso
		SumaService sumaService = new SumaService();
		int suma = sumaService.sumar(n1, n2);
		
		// Reporte
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);
		System.out.println("Suma: " + suma);
		
	}
	
	
}
