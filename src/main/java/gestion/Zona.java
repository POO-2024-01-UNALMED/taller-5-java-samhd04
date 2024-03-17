package gestion;

import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	public String nombre;
	public Zoologico zoo;
	public ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		
	}
	
	public Zona() {
		
	}
	
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
