package zooAnimales;

import gestion.Zona;

public class Animal {

	//	CLASS VARIABLES
	private static int totalAnimales;
	

	//	INSTANCE VARIABLES
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	

	//	CONSTRUCTORS
	public Animal() {
		this("", 0, "", "", null);
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this(nombre, edad, habitat, genero, null);
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		
		totalAnimales++;
	}
	
	// CLASS METHODS
	public static void totalPorTipo() {
		System.out.println("Mamiferos :" + Mamifero.cantidadMamiferos());
		System.out.println("Aves :" + Ave.cantidadAves());
		System.out.println("Reptiles :" + Reptil.cantidadReptiles());
		System.out.println("Anfibios :"+ Anfibio.cantidadAnfibios());
	}
	
	
	// INSTANCE METHODS
	public String toString() {
		if(this.zona != null) {
			return "Mi nombre es " + this.nombre + 
				", tengo una edad de " + this.edad + 
				", habito en " + this.habitat + 
				" y mi genero es " + this.genero + 
				", la zona en la que me ubico es " + this.zona.getNombre();
		} else {
			return "Mi nombre es " + this.nombre + 
					", tengo una edad de " + this.edad + 
					", habito en " + this.habitat + 
					" y mi genero es " + this.genero;
		}
	}

	// SETTERS
	public void setNombre(String nombre) { this.nombre = nombre; }
	public void setEdad(int edad) { this.edad = edad; }
	public void setHabitat(String habitat) { this.habitat = habitat; }
	public void setGenero(String genero) { this.genero = genero; }
	public void setZona(Zona zona) { this.zona = zona; }
	
	public void setTotalAnimales(int total) { totalAnimales = total; } 
	
	// GETTERS
	public String getNombre() { return this.nombre; }
	public int getEdad() { return this.edad; }
	public String getHabitat() { return this.habitat; }
	public String getGenero() { return this.genero; }
	public Zona getZona() { return this.zona; }
	
	public int getTotalAnimales() { return totalAnimales; }
}
