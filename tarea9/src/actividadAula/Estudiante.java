/**
 * 
 */
package actividadAula;

import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

/**
 * @author viach
 * Subclase de Persona, clase Estudiante
 */
class Estudiante extends Persona {
	//Atributos
	private int calificacion;
	public final int INDICE_ASISTENCIA_ESTUDIANTE = 50;
	
	
	//Constructor
	public Estudiante(String nombre, int edad, String sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}

	
	//Getters y setters
	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	
	//M�todo que identif�ca si un estudiante se ha presentado a la clase o no
	public boolean presenteEnClase () {
		//Variables
		boolean presente;
		
		//Generamos un valor aleatorio entre 1 y 100
		int	valorAleatorio = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		
		//Comprobamos si un estudiante ha asistido a la clase
		if (valorAleatorio <= INDICE_ASISTENCIA_ESTUDIANTE)
			presente = true;
		else
			presente = false;
		
		return presente;
	}
	
	//M�todo toString() @override
	public String toString() {
		return "Nombre: " + this.nombre + " Edad: " + this.edad +" años "+ " Calificacion: " +
				this.calificacion+ " puntos ";
	}
	
}
