/**
 * 
 */
package actividadAula;

/**
 * @author viach
 * Superclase abstracta Persona, clase padre de Estudiante y Profesor
 */
abstract class Persona {
	//Atributos
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	//Constructores
	//Constructor por defecto. En esta clase nunca se debería de usar
	public Persona() {
		this.nombre = "PRUEBA";
		this.edad = 0;
		this.sexo = "PRUEBA";
	}
	
	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}


	//Getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	//Método que identifíca si una persona se ha presentado a la clase o no
	public abstract boolean presenteEnClase ();
	
}
