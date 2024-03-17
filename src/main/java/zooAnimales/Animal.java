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
	private static ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		Animal.totalAnimales++;
	}

	public Animal() {
		Animal.totalAnimales++;
	}
	
	public static String totalPorTipo() {
		int Mamiferos = 0;
		int Aves = 0;
		int Reptiles = 0;
		int Peces = 0;
		int Anfibios = 0;
		
		for(int i = 0; i < zona.size(); i++) {
			for(int j = 0; j < zona.get(i).getAnimales().size(); j++) {
				if(zona.get(i).getAnimales().get(j) instanceof Anfibio) {
					Anfibios = Anfibios + 1;
				}
				
				if(zona.get(i).getAnimales().get(j) instanceof Pez) {
					Peces = Peces + 1;
				}
				
				if(zona.get(i).getAnimales().get(j) instanceof Reptil) {
					Reptiles = Reptiles + 1;
				}
				
				if(zona.get(i).getAnimales().get(j) instanceof Ave) {
					Aves = Aves + 1;
				}
				
				if(zona.get(i).getAnimales().get(j) instanceof Mamifero) {
					Mamiferos = Mamiferos + 1;
				}
			}
		}
		
		return "Mamiferos: " + Mamiferos + "\r\n" + "Aves: " + Aves + "\r\n" + "Reptiles: " + Reptiles + "\r\n" + "Peces: " + Peces + "\r\n" + "Anfibios: " + Anfibios;
	}
	
	public String toString() {
		Zona nuevaZona = null;
		Zoologico zoo = null;
		
		for(int i = 0; i < zona.size(); i++) {
			for(int j = 0; j < zona.get(i).getAnimales().size(); j++) {
				if(zona.get(i).getAnimales().get(j) == this) {
					nuevaZona = zona.get(i);
					zoo = zona.get(i).getZoo();
					return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero + ", la zona en la que me ubico es " + nuevaZona.getNombre() + ", en el " + zoo.getNombre();
				}
			}
			
		}
		
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero;
		
	}
	
	public String movimiento() {
		
		String movimiento = null;
		
		for(int i = 0; i < zona.size(); i++) {
			for(int j = 0; j < zona.get(i).getAnimales().size(); j++) {
				if(zona.get(i).getAnimales().get(j) == this && this instanceof Mamifero) {
					movimiento = "desplazarse";
				}
				
				if(zona.get(i).getAnimales().get(j) == this && this instanceof Ave) {
					movimiento = "volar";
				}
				
				if(zona.get(i).getAnimales().get(j) == this && this instanceof Reptil) {
					return "reptar";
				}
				
				if(zona.get(i).getAnimales().get(j) == this && this instanceof Pez) {
					return "nadar";
				}
				
				if(zona.get(i).getAnimales().get(j) == this && this instanceof Anfibio) {
					return "Saltar";
				}
			}
		}
		
		return movimiento;
	}
	
	public int getTotalAnimales() {
		return Animal.totalAnimales;
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
}
