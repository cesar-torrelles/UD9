package models;

public class Television extends Electrodomestico {
	// Atributos
	private double resolucion;
	private boolean sintonizadorTDT;

	// Constantes
	private final double resolucion_DEF = 20;
	private final boolean sintonizadorTDT_DEF = false;

	// Constructores
	// Constructor por defecto
	public Television() {
		super();
		this.resolucion = resolucion_DEF;
		this.sintonizadorTDT = sintonizadorTDT_DEF;
	}

	// Constructor con el precio y el peso
	public Television(double precioBase, double peso, double resolucion, boolean sintonizadorTDT) {
		super(precioBase, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Constructor con todos los atributos
	public Television(double precioBase, String color, char consumoEnergetico, double peso, double precioFinal,
			double resolucion, boolean sintonizadorTDT) {
		super(precioBase, color, consumoEnergetico, peso, precioFinal);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}

	// Llamamos al m�todo para saber el precio final, añadiendo los parametros
	// propios de la Television (resolucion,sintonizador TDT)
	public double precioFinal(double precioFinal, double resolucion, boolean sintonizadorTDT) {
		if (resolucion > 40) {
			precioFinal = precioFinal * 0.3;
		}
		if (sintonizadorTDT == true) {
			precioFinal += 50;
		}
		return (precioFinal);
	}

	// Override de la superclase Electrodomestico
	// metodo para imprimir los datos del electrodomestico, añadimos "resolucion" y
	// "sintonizadorTDT" al metodo
	public String toString() {
		return "Television [precioBase = " + precioBase + ", color =" + color + ", consumo Energético = " + consumoEnergetico
				+ ", peso = " + peso + ", precio final = " + precioFinal + ", resolución = " + resolucion
				+ ", sintonizadorTDT = " + sintonizadorTDT + "]";
	}

	// Getters y Setters
	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}

}
