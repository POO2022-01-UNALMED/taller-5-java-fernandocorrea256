package zooAnimales;

import gestion.Zona;

public class Reptil extends Animal{
	
	// CLASS VARIABLES
	private static Reptil[] listado;
	public static int iguanas;
	public static int serpientes;
	
	// INSTANCE VARIABLES
	private String colorEscamas;
	private int largoCola;

	// CONTRUCTORS
	public Reptil() {
		this("", 0, "humedal", "M", null, "", 0);
	}
	
	
	public Reptil(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		
		// UPDATE listado
		Reptil new_listado[] = new Reptil[listado.length + 1];
		for (int i = 0; i < listado.length; i++) {
			new_listado[i] = listado[i];
		}
		new_listado[listado.length] = this;
		listado = new_listado;
	}
	
	// CLASS METHODS
	public static int cantidadReptiles() {
		return listado.length;
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
	public String desplazarse() {
		return "reptar";
	}
}
