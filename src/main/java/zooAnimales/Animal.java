package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	int totalAnimales;
	String nombre;
	int edad;
	String habitat;
	String genero;
	ArrayList<Zona> zona = new ArrayList<Zona>();
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		totalAnimales++;
	}

	public Animal() {
		totalAnimales++;
	}
	
	public void totalPorTipo() {
		int Mamiferos = 0;
		int Aves = 0;
		int Reptiles = 0;
		int Peces = 0;
		int Anfibios = 0;
		
		for(int i = 0; i < zona.size(); i++) {
			for(int j = 0; j < zona.get(i).animales.size(); j++) {
				if(zona.get(i).animales.get(j) instanceof Anfibio) {
					Anfibios = Anfibios + 1;
				}
				
				if(zona.get(i).animales.get(j) instanceof Pez) {
					Peces = Peces + 1;
				}
				
				if(zona.get(i).animales.get(j) instanceof Reptil) {
					Reptiles = Reptiles + 1;
				}
				
				if(zona.get(i).animales.get(j) instanceof Ave) {
					Aves = Aves + 1;
				}
				
				if(zona.get(i).animales.get(j) instanceof Mamifero) {
					Mamiferos = Mamiferos + 1;
				}
			}
		}
		
		System.out.println("Mamiferos:" + Mamiferos);
		System.out.println("Aves:" + Aves);
		System.out.println("Reptiles:" + Reptiles);
		System.out.println("Peces:" + Peces);
		System.out.println("Anfibios:" + Anfibios);
	}
	
	public String toString() {
		Zona nuevaZona = null;
		Zoologico zoo = null;
		
		for(int i = 0; i < zona.size(); i++) {
			for(int j = 0; j < zona.get(i).animales.size(); j++) {
				if(zona.get(i).animales.get(j) == this) {
					nuevaZona = zona.get(i);
					zoo = zona.get(i).zoo;
					return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero + ", la zona en la que me ubico es " + nuevaZona.nombre + ", en el " + zoo.nombre;
				}
			}
			
		}
		
		return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + "y mi genero es " + genero;
		
	}
	
	public String movimiento() {
		
		String movimiento = null;
		
		for(int i = 0; i < zona.size(); i++) {
			for(int j = 0; j < zona.get(i).animales.size(); j++) {
				if(zona.get(i).animales.get(j) == this && this instanceof Mamifero) {
					movimiento = "desplazarse";
				}
				
				if(zona.get(i).animales.get(j) == this && this instanceof Ave) {
					movimiento = "volar";
				}
				
				if(zona.get(i).animales.get(j) == this && this instanceof Reptil) {
					return "reptar";
				}
				
				if(zona.get(i).animales.get(j) == this && this instanceof Pez) {
					return "nadar";
				}
				
				if(zona.get(i).animales.get(j) == this && this instanceof Anfibio) {
					return "Saltar";
				}
			}
		}
		
		return movimiento;
	}
}
