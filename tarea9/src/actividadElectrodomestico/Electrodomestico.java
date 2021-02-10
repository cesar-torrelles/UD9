/**
 * 
 */
package actividadElectrodomestico;

/**
 * @author viach
 * Superclase Electrodomestico.
 */
class Electrodomestico {
	//Constantes
	public final double PRECIO_BASE = 100;			//Precio
	public final String BLANCO = "blanco";			//Color
	public final String NEGRO = "negro";
	public final String ROJO = "rojo";
	public final String AZUL = "azul";
	public final String GRIS = "gris";
	public final String COLOR_DEFAULT = BLANCO;	
	public final char CONSUMO_A = 'A';				//Consumo
	public final char CONSUMO_B = 'B';
	public final char CONSUMO_C = 'C';
	public final char CONSUMO_D = 'D';
	public final char CONSUMO_E = 'E';
	public final char CONSUMO_F = 'F';
	public final char CONSUMO_DEFAULT = CONSUMO_A;
	public final double PESO_BASE = 5;				//Peso
	
	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	//Constructores
	//Contructor base con los atributos inicializados
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR_DEFAULT;
		this.consumoEnergetico = CONSUMO_DEFAULT;
		this.peso = PESO_BASE;
	}
	
	//Constructor con precioBase y peso como parámetros
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = BLANCO;
		this.consumoEnergetico = CONSUMO_F;
		this.peso = peso;	
	}
	
	//Constructor con precioBase, color, consumoEnergetico y peso (todos los atributos) como parámetros
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
		//Llamada a métodos de control
		this.color = comprobarColor(this.color);
		this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
	}
	
	//Getters y setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	//Método control atributo color
	private String comprobarColor (String color) {
		color.toLowerCase();
		switch (color) {
			case "blanco":
				this.color = BLANCO;
				break;
			case "negro":
				this.color = NEGRO;
				break;
			case "rojo":
				this.color = ROJO;
				break;
			case "azul":
				this.color = AZUL;
				break;
			case "gris":
				this.color = GRIS;
				break;
			default:
				this.color = COLOR_DEFAULT;
		}
		
		return this.color;
	}
	
	//Método control atributo consumoEnergetico
	private char comprobarConsumoEnergetico (char letra) {
		switch (letra) {
			case 'A', 'a':
				this.consumoEnergetico = CONSUMO_A;
				break;
			case 'B', 'b':
				this.consumoEnergetico = CONSUMO_B;
				break;
			case 'C', 'c':
				this.consumoEnergetico = CONSUMO_C;
				break;
			case 'D', 'd':
				this.consumoEnergetico = CONSUMO_D;
				break;
			case 'E', 'e':
				this.consumoEnergetico = CONSUMO_E;
				break;
			case 'F', 'f':
				this.consumoEnergetico = CONSUMO_F;
				break;
			default:
				this.consumoEnergetico = CONSUMO_DEFAULT;
		}
		
		return this.consumoEnergetico;
	}
	
	//Método para modificar el precio final del producto en
	//función de su peso y de su consumoEnergético
	public double precioFinal() {
		//Modificamos precio según consumoEnergetico
		switch (this.consumoEnergetico) {
			case 'A':
				this.precioBase += 100;
				break;
			case 'B':
				this.precioBase += 80;
				break;
			case 'C':
				this.precioBase += 60;
				break;
			case 'D':
				this.precioBase += 50;
				break;
			case 'E':
				this.precioBase += 30;
				break;
			case 'F':
				this.precioBase += 10;
		}
		
		//Modificamos precio según tamaño (peso)
		if (peso >= 0 && peso < 20)
			this.precioBase += 10;
		else if (peso >= 20 && peso < 50)
			this.precioBase += 50;
		else if (peso >= 50 && peso < 80)
			this.precioBase += 80;
		else if (peso >= 80)
			this.precioBase += 100;
		
		return this.precioBase;
	}
	
}
