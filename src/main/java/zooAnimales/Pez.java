package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}

	public Pez() {
		this(null, 0, null, null, null, 0);
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez.salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez.bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public int cantidadPeces() {
		return listado.size();
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
}
