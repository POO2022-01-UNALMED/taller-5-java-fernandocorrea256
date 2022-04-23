package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Pez extends Animal{

	// CLASS VARIABLES
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	
	// INSTANCE VARIABLES
	private String colorEscamas;
	private int cantidadAletas;


	// CONSTRUCTORS
	public Pez() { 
		this("", 0, "Agua", "F", null, "", 2); 
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this(nombre, edad, habitat, genero, null, colorEscamas, cantidadAletas);
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
		listado.add(this);
	}
	
	// CLASS METHODS
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, null, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, null, "gris", 6);
	}
	
	// INSTANCE METHODS
	public String movimiento() {
		return "nadar";
	}

	// SETTERS
	public void setColorEscamas(String colorEscamas) { this.colorEscamas = colorEscamas; }
	public void setCantidadAletas(int cantidadAletas) { this.cantidadAletas = cantidadAletas; }
	
	// GETTERS
	public String getColorEscamas() { return this.colorEscamas; }
	public int getCantidadAletas() { return this.cantidadAletas; }
}
