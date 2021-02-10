/**
 * 
 */
package actividadAula;

/**
 * @author viach
 * Clase ejecutable que se encarga de instanciar todos los objetos de las clases Aula, Profesor
 * y Estudiante, y después comprueba si tenemos clase llamando al método consultaClase. En caso
 * de que sea así, llamamos al método alumnesAprobados y mostramos cuantos alumnos y cuantas
 * alumnas han aprobado.
 */
class TenemosClaseApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Variables
		boolean tenemosClase;
		Profesor profesorHoy;
		Aula aulaHoy;
		
		//Creamos objetos
		Estudiante claseHoy[] = new Estudiante[10];
		claseHoy[0] = new Estudiante("Raquel", 19, "mujer", 8);
		claseHoy[1] = new Estudiante("Marta", 18, "mujer", 9);
		claseHoy[2] = new Estudiante("Jose", 18, "hombre", 7);
		claseHoy[3] = new Estudiante("Alvaro", 20, "hombre", 8);
		claseHoy[4] = new Estudiante("Miguel", 18, "hombre", 5);
		claseHoy[5] = new Estudiante("Alba", 18, "mujer", 4);
		claseHoy[6] = new Estudiante("Lucia", 19, "mujer", 10);
		claseHoy[7] = new Estudiante("Edgard", 19, "hombre", 4);
		claseHoy[8] = new Estudiante("Francisco", 18, "hombre", 9);
		claseHoy[9] = new Estudiante("Ana", 20, "mujer", 7);

		profesorHoy = new Profesor("Ana", 20, "mujer", "filosofia");
		
		aulaHoy = new Aula(123, 15, "filosofia");
		
		
		//Llamada al método consultaClase
		tenemosClase = consultaClase(claseHoy, profesorHoy, aulaHoy);
		
		//Si hay clase llamamos al método para mostrar aprobados
		//if (tenemosClase)
			
	}
	
	//Método para comprobar si tenemos clase
	public static boolean consultaClase (Estudiante claseHoy[], Profesor profesorHoy, Aula aulaHoy) {
		//Variables
		boolean tenemosClase = true;
		
		//Comprobamos que materia.Profesor y materia.Aula coinciden, así como recorremos
		//el array y comprobamos que los alumnos asistentes son más del 50% de la ocupacionMax
		//del aula
		
		return tenemosClase;
	}
	
	//Método para mostrar cuantos alumnos y alumnas han aprobado
	

}
