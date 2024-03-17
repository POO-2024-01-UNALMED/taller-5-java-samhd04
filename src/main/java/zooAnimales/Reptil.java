package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
	ArrayList<Reptil> listado = new ArrayList<Reptil>();
	static int iguanas;
	static int serpientes;
	String colorEscamas;
	int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		
	}
	
	public Reptil() {
		
	}
	
	public Reptil crearIguana(String nombre, int edad, String genero) {
		Reptil.iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, "verde", 3);
	}
	
	public Reptil crearSerpiente(String nombre, int edad, String genero) {
		Reptil.serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
	}
	
	public int cantidadReptiles() {
		return listado.size();
	}
}
