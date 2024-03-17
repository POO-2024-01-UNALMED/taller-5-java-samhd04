package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = null;
		Animal.totalAnimales++;
	}

	public Animal() {
		this(null, 0, null, null);
		Animal.totalAnimales++;
	}
	
	public static String totalPorTipo() {
		
		return "Mamiferos: " + Mamifero.getListado().size() + "\r\n" 
		+ "Aves: " + Ave.getListado().size() + "\r\n" 
		+ "Reptiles: " + Reptil.getListado().size() + "\r\n" 
		+ "Peces: " + Pez.getListado().size() + "\r\n" 
		+ "Anfibios: " + Anfibio.getListado().size();
	}
	
	public String toString() {
		
		if(getZona() == null) {
			return "Mi nombre es " + getNombre() 
					+ ", tengo una edad de " 
					+ getEdad() + ", habito en " 
					+ getHabitat() + "y mi genero es " 
					+ getGenero();
		} else {
			return "Mi nombre es " + getNombre() 
					+ ", tengo una edad de " 
					+ getEdad() + ", habito en " 
					+ getHabitat() + "y mi genero es " 
					+ getGenero() + "la zona en la que me ubico es " 
					+ getZona().getNombre() + ", en el " + getZona().getZoo().getNombre();
		}
		
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public Zona getZona() {
		return zona;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
}
