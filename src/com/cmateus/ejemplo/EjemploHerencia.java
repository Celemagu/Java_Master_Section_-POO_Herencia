package com.cmateus.ejemplo;

import com.cmateus.pooherencia.*;

public class EjemploHerencia {

	public static void main(String[] args) {
		
		
		System.out.println("======== Creando la instancia de la clase alumno =========");
		Alumno alumno = new Alumno ();//  si se declara como Persona ya que es el padre de alumno
		alumno.setNombre("Cesar");
		alumno.setApellido("Mateus");
		alumno.setInstitucion("Institucion Nacional"); // al ser tipo persona se debe castear (primer parentesis) para tomar los atributos de alumno
		alumno.setNotaCastellano(5.5);
		alumno.setNotaHistoria(6.3);
		alumno.setNotaHistoria(4.9);
		
		System.out.println("======== Creando la instancia de la clase alumno Internacional =========");
		AlumnoInternacional alumnoInt = new AlumnoInternacional ();
		alumnoInt.setNombre("Isabella");
		alumnoInt.setApellido("Mazabuel");
		alumnoInt.setPais("Italia");
		alumnoInt.setEdad(9);
		alumnoInt.setInstitucion("Instituto Nacional");
		alumnoInt.setNotaIdiomas(6.8);
		alumnoInt.setNotaCastellano(6.2);
		alumnoInt.setNotaHistoria(5.8);
		alumnoInt.setNotaMatematicas(6.5);
		
		System.out.println("======== Creando la instancia de la clase Profesor =========");
		Profesor profesor = new Profesor ();
		profesor.setNombre("Andrés");
		profesor.setApellido("Guzman");
		profesor.setAsignatura("Matematicas");
		
		System.out.println("======== - =========");
		System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido()+ " " +alumno.getInstitucion());
		System.out.println("Alumno internacional: "+ alumnoInt.getNombre() + " " + alumnoInt.getApellido() + " " + alumnoInt.getInstitucion()+ " " + alumnoInt.getPais());
		System.out.println("Profesor de "+profesor.getAsignatura()+": "+profesor.getNombre()+" "+ profesor.getApellido());
		
		
		Class clase = alumnoInt.getClass();
		while(clase.getSuperclass() != null) {
			String hija = clase.getName();
			String padre = clase.getSuperclass().getName();
			System.out.println(hija + " es una clase hija de la clase padre " + padre);
			clase = clase.getSuperclass();
					
		}
	}

}
