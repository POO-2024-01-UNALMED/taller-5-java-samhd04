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
		this.zona = null;
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
			return "Mi nombre es " + nombre 
					+ ", tengo una edad de " 
					+ edad + ", habito en " 
					+ habitat + "y mi genero es " 
					+ genero;
		} else {
			return "Mi nombre es " + nombre 
					+ ", tengo una edad de " 
					+ edad + ", habito en " 
					+ habitat + "y mi genero es " 
					+ genero + "la zona en la que me ubico es " 
					+ zona.getNombre() + ", en el " + zona.getZoo();
		}
		
	}
	
	public String movimiento() {
		if(this instanceof Mamifero) {
			return "desplazarse";
		}else if(this instanceof Ave) {
			return "volar";
		}else if(this instanceof Reptil) {
			return "reptar";
		}else if(this instanceof Pez) {
			return "nadar";
		}else if(this instanceof Anfibio) {
			return "saltar";
		}else {
			return null;
		}
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
		return genero;
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
