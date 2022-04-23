package gestion;

import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	
	//	INSTANCE VARIABLES
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	
	//	CONSTRUCTORS
	public Zona() {
		
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}
	
	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	
	// INSTANCE METHOS
	public int cantidadAnimales() {
		return this.animales.size();
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}


	// SETTERS
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setZoo(Zoologico zoo) { this.zoo = zoo; }
	public void setAnimales(ArrayList<Animal> animales) {this.animales = animales; }
	
	// GETTERS
	public String getNombre() { return this.nombre; }
	public Zoologico getZoo() { return this.zoo; }
	public ArrayList<Animal> getAnimales() { return this.animales; }
}
