/**
 * 
 */
package actividadAula;

import java.util.concurrent.ThreadLocalRandom;	//Para generar valores aleatorios

/**
 * @author viach
 * Subclase de Persona, clase Profesor
 */
class Profesor extends Persona {
	//Constantes
	public final String MATEM = "matematicas";
	public final String FILOS = "filosofia";
	public final String FISIC = "fisica";
	public final int INDICE_ASISTENCIA_PROFESOR = 80;
	
	
	//Atributo
	private String materia;
	
	
	//Constructor
	public Profesor(String materia) {
		super();
		this.materia = materia;
	}


	//Getters y setters
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}


	//Método que identifíca si un profesor se ha presentado a la clase o no
	public boolean presenteEnClase () {
		//Variables
		boolean presente;
		
		//Generamos un valor aleatorio entre 1 y 100
		int	valorAleatorio = ThreadLocalRandom.current().nextInt(1, 100 + 1);
		
		//Comprobamos si el profesor ha asistido a la clase
		if (valorAleatorio <= INDICE_ASISTENCIA_PROFESOR)
			presente = true;
		else
			presente = false;
		
		return presente;
	}
	
}
