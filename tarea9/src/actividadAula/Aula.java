/**
 * 
 */
package actividadAula;

/**
 * @author viach
 * Clase Aula
 */
class Aula {
	//Atributos
	private int id;
	private int ocupacionMax;
	private String materia;
	
	
	//Constructores
	public Aula(int id, int ocupacionMax, String materia) {
		this.id = id;
		this.ocupacionMax = ocupacionMax;
		this.materia = materia;
	}

	
	//Getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOcupacionMax() {
		return ocupacionMax;
	}

	public void setOcupacionMax(int ocupacionMax) {
		this.ocupacionMax = ocupacionMax;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	
}
