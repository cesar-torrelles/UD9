/**
 * 
 */
package actividadElectrodomestico;

/**
 * @author viach
 * Subclase Lavadora.
 */
class Lavadora extends Electrodomestico{
	//Constante
	public final double CARGA_DEFAULT = 5;
	
	//Atributos
	private double carga;

	//Constructores
	//Constructor por defecto
	public Lavadora() {
		super();
		this.carga = CARGA_DEFAULT;
	}
	
	//Constructor con precio, peso y carga pasados por prámetros
	public Lavadora(double precioBase, double peso, double carga) {
		super(precioBase, peso);
		this.carga = carga;
	}

	//Constructor con todos los atributos
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso,
			double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	//Getter y setter de carga
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	//Método padre precioFinal modificado para añadirle modificación de precio por carga
	public double precioFinal() {
		super.precioFinal();
		
		//Modificamos el precio en función de la carga
		if (carga > 30)
			this.precioBase += 50;
		return this.precioBase;
	}

}
