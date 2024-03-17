package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	ArrayList<Pez> listado = new ArrayList<Pez>();
	static int salmones;
	static int bacalaos;
	String colorEscamas;
	int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		
	}

	public Pez() {
		
	}
	
	public Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public int cantidadPeces() {
		return listado.size();
	}
}
