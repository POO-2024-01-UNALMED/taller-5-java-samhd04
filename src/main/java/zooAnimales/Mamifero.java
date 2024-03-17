package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
	ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	static int caballos;
	static int leones;
	boolean pelaje;
	int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		
	}
	
	public Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero.caballos++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public Mamifero crearLeon(String nombre, int edad, String genero) {
		Mamifero.leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public int cantidadMamiferos() {
		return listado.size();
	}
}
