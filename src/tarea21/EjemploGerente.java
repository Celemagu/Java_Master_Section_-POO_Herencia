package tarea21;

import com.cmateus.pooherencia.Alumno;

public class EjemploGerente {

	public static void main(String[] args) {
		
								
		Gerente gerente = new Gerente ("1022ABC", "Cesar", "Mateus", "Cra9 call 36", 10000, 102, 100000);
		gerente.aumentarRem(15);
		gerente.setPresupuesto(300000);
		System.out.println(gerente);
		

	}

}
