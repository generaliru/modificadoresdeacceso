package paquete_1;

public class Persona {
	String nombre = "Uriel"; //No deja acceder a el desde otras subclases.
	
	private int edad  = 23; //No deja acceser a el fuera de la clase contenedora
	
	protected String domiciolio = "Acacia 48"; // No deja acceder desde otro 
											   // paquete
	
	String saludar() {
		return "Hola, mi nombre es " + this.nombre;
	}
}
