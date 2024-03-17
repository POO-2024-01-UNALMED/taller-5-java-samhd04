package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal {
	ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	static int ranas;
	static int salamandras;
	String colorPiel;
	boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		
	}

	public Anfibio() {
		
	}
	
	public Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio.ranas++;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio.salamandras++;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
	}
	
	public int cantidadAnfibios() {
		return listado.size();
	}
}
