/**
 * 
 */
package actividadAula;

/**
 * @author viach
 * Clase ejecutable que se encarga de instanciar todos los objetos de las clases Aula, Profesor
 * y Estudiante, y despu�s comprueba si tenemos clase llamando al m�todo consultaClase. En caso
 * de que sea as�, llamamos al m�todo alumnesAprobados y mostramos cuantos alumnos y cuantas
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
		
		aulaHoy = new Aula(123, 10, "filosofia");
		
		
		//Llamada al m�todo consultaClase
		tenemosClase = consultaClase(claseHoy, profesorHoy, aulaHoy);
		
		
		if(tenemosClase){
		System.out.println("\nSe ha realizado la clase \n");
		}
		else {System.out.println("\nNo se ha realizado la clase \n");}
		//Si hay clase llamamos al m�todo para mostrar aprobados
		if (tenemosClase)
			estudiantesAprobados(claseHoy);
			
	}
	
	
	//M�todo para comprobar si tenemos clase
	public static boolean consultaClase (Estudiante claseHoy[], Profesor profesorHoy, Aula aulaHoy) {
		//Variables
		boolean tenemosClase = true;
		final int ASISTENCIA_MIN_PORC = (aulaHoy.getOcupacionMax()/2);
		int numAsistentesHoy = 0;
		
		//Comprobamos que el profesorHoy asiste, que profesorHoy.materia y
		//aulaHoy.materia coinciden, y recorremos el vector claseHoy y comprobamos que los
		//alumnos asistentes son m�s del 50% de la ocupacionMax del aulaHoy
		if (!profesorHoy.asistencia) {
			tenemosClase = false;
		System.out.println("El Profesor no ha venido");
		}
		
		if (!profesorHoy.getMateria().equals(aulaHoy.getMateria())) {
			tenemosClase = false;
		System.out.println("La materia no es la que toca");
		}
		for (Estudiante estudiante : claseHoy) {
			if (estudiante.asistencia)
				numAsistentesHoy++;
			
		}
		
		
		if (numAsistentesHoy < ASISTENCIA_MIN_PORC) {
			tenemosClase = false;
		System.out.println("No hay suficientes alumnos");
		System.out.println("Hoy han asistido: " +numAsistentesHoy + " Alumnos");
		}
		
		
		return tenemosClase;
	}
	
	//M�todo para mostrar cuantos alumnos y alumnas han aprobado
	public static void estudiantesAprobados(Estudiante claseHoy[]) {
		//Variables
		int calificacion, i = 0, j = 0;
		Estudiante hombresAprobados[] = new Estudiante[claseHoy.length];
		Estudiante mujeresAprobadas[] = new Estudiante[claseHoy.length];
		
		//Recorremos el vector de estudiantes
		for (Estudiante estudiante : claseHoy) {
			calificacion = estudiante.getCalificacion();
			if (calificacion >= 5) {	//Est�n aprobados
				if (estudiante.getSexo() == "hombre") {
					hombresAprobados[i] = estudiante;
					i++;
				}
				else if (estudiante.getSexo() == "mujer") {
					mujeresAprobadas[j] = estudiante;
					j++;
				}
			}
		}
		
		//Imprimimos los aprobados
		System.out.println("Los Alumnos aprobados son:");
		for (i = 0; (hombresAprobados[i] != null) && (i < hombresAprobados.length) ;i++) {
			System.out.println(hombresAprobados[i].toString());		//Sin toString nos devuelve
																	//direcci�n de memoria
		}
		System.out.println("\nEn total han aprobado " +j + " Chicos.");
		
		System.out.println("\nLas Alumnas aprobadas son:");
		for (j = 0; (mujeresAprobadas[j] != null) && (j < mujeresAprobadas.length) ;j++) {
			System.out.println(mujeresAprobadas[j].toString());
		}
		System.out.println("\nEn total han aprobado " +j + " Chicas.");
		
	}

}
