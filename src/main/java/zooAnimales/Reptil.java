package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

public class Reptil extends Animal{
	
	// CLASS VARIABLES
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	
	// INSTANCE VARIABLES
	private String colorEscamas;
	private int largoCola;

	// CONTRUCTORS
	public Reptil() {
		this("", 0, "humedal", "M", null, "", 0);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this(nombre, edad, habitat, genero, null, colorEscamas, largoCola);
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		
		listado.add(this);
	}
	
	// CLASS METHODS
	public static int cantidadReptiles() {
		return listado.size();
	}

	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		return new Reptil(nombre, edad, "humedal", genero, null, "verde", 3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		return new Reptil(nombre, edad, "jungla", genero, null, "blanco", 1);
	}
	
	// INSTANCE METHODS
	public String movimiento() {
		return "reptar";
	}
	
	// SETTERS
	public void setColorEscamas(String colorEscamas) { this.colorEscamas = colorEscamas; }
	public void setLargoCola(int largoCola) { this.largoCola = largoCola; }
	
	// GETTERS
	public String getColorEscamas() { return this.colorEscamas; }
	public int getLargoCola() { return this.largoCola; }
}
