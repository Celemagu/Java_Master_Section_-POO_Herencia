package com.cmateus.ejemplo;

import com.cmateus.pooherencia.*;

public class EjemploHerenciaConstructores {

	public static void main(String[] args) {
		
		
		System.out.println("======== Creando la instancia de la clase alumno =========");
		Alumno alumno = new Alumno ("Cesar", "Mateus" , 32, "Institucion Nacional");
		alumno.setNotaCastellano(5.5);
		alumno.setNotaMatematicas(6.3);
		alumno.setNotaHistoria(4.9);
		alumno.setEmail("correoalumno@correo.com");
		
		System.out.println("======== Creando la instancia de la clase alumno Internacional =========");
		AlumnoInternacional alumnoInt = new AlumnoInternacional ("Isabella", "Mazabuel", "Italia");
		alumnoInt.setEdad(9);
		alumnoInt.setInstitucion("Instituto Nacional");
		alumnoInt.setNotaIdiomas(6.8);
		alumnoInt.setNotaCastellano(6.2);
		alumnoInt.setNotaHistoria(5.8);
		alumnoInt.setNotaMatematicas(6.5);
		alumnoInt.setEmail("correoalumnoInt@correo.com");
		
		System.out.println("======== Creando la instancia de la clase Profesor =========");
		Profesor profesor = new Profesor ("Andrés", "Guzman", "Matematicas");
		profesor.setEdad(37);
		profesor.setEmail("correoprofesor@correo.com");
		
		
				System.out.println("======== - =========");
				
		imprimir (alumno);
		imprimir (alumnoInt);
		imprimir (profesor);
		
				
		
	}
	
	public static void imprimir(Persona persona) {
		System.out.println("Imprimiendo datos en comun del tipo persona:");
		System.out.println("nombre: " + persona.getNombre() + ", apellido:  " + persona.getApellido()+ ", edad:  " +persona.getEdad() +
							", email: " +persona.getEmail() );
		if (persona instanceof Alumno) {
			System.out.println("Imprimiendo los datos del tipo alumno:");
			System.out.println("Institucion: " + ((Alumno)persona).getInstitucion());
			System.out.println("Nota matematicas: " + ((Alumno)persona).getNotaMatematicas());
			System.out.println("Nota hostoria: " + ((Alumno)persona).getNotaHistoria());
			System.out.println("Nota Castellano: " + ((Alumno)persona).getNotaCastellano());
			
			if (persona instanceof AlumnoInternacional) {
				System.out.println("Imprimiendo los datos del tipo alumno Internacional:");
				System.out.println("Nota Idiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
				System.out.println("Pais: " + ((AlumnoInternacional)persona).getPais());
			}
			
			System.out.println("======== Sobre escritura promedio =========");
			System.out.println("Promedio:" + ((Alumno)persona).calcularPromedio());
			System.out.println("======== - =========");
			
		}
	
		if (persona instanceof Profesor) {
			System.out.println("Imprimiendo los datos del tipo profesor:");
			System.out.println("Asignatura: " + ((Profesor)persona).getAsignatura());
		}
		
		System.out.println("======== Sobre escritura saludar =========");
		System.out.println(persona.saludar());
		
		
		
		System.out.println("======== - =========");

	}

}
