package gestion;

import zooAnimales.Animal;

public class Zona {
	
	//	INSTANCE VARIABLES
	private String nombre;
	private Zoologico zoo;
	private Animal[] animales;
	
	
	//	CONSTRUCTORS
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona(String nombre, Zoologico zoo, Animal[] animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	
	// INSTANCE METHOS
	public int cantidadAnimales() {
		return this.animales.length;
	}
	
	public void agregarAnimal(Animal animal) {
		Animal new_arr[] = new Animal[animales.length + 1];
		for (int i = 0; i < this.animales.length; i++) {
			new_arr[i] = this.animales[i];
		}
		new_arr[this.animales.length] = animal;
		this.animales = new_arr;
	}


	// SETTERS
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setZoo(Zoologico zoo) { this.zoo = zoo; }
	public void setAnimales(Animal[] animales) {this.animales = animales; }
	
	// GETTERS
	public String getNombre() { return this.nombre; }
	public Zoologico getZoo() { return this.zoo; }
	public Animal[] getAnimales() { return this.animales; }
}
