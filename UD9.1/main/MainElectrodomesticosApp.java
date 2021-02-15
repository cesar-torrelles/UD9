package main;

import models.Electrodomestico;
import models.Lavadora;
import models.Television;

public class MainElectrodomesticosApp {

	public static void main(String[] args) {
		
		//Creamos un array de 10 posiciones
		Electrodomestico electrodomesticos [] = new Electrodomestico [10];
		
		//Creamos las donde almacenaremos la suma de cada tipo de electrodomestico variables
		int sumaLavadora = 0;
		double sumaElectrodomestico = 0;
		int sumaTelevision = 0;
		
		//introducimos todos los datos en el array
		electrodomesticos [0] = new Lavadora (100, "Blanco", 'A', 50, 0, 10);
		electrodomesticos [1] = new Electrodomestico (50, "Rojo", 'B', 5, 0);
		electrodomesticos [2] = new Television (150, "Negro", 'C', 20, 0, 40, true);
		electrodomesticos [3] = new Television (150, "Azul", 'D', 15, 0, 20, false);
		electrodomesticos [4] = new Lavadora (200, "Gris", 'A', 100, 0, 40);
		electrodomesticos [5] = new Electrodomestico (50, "Blanco", 'E', 30, 0);
		electrodomesticos [6] = new Electrodomestico (70, "Azul", 'F', 25, 0);
		electrodomesticos [7] = new Television (120, "Blanco", 'B', 50, 0, 35, true);
		electrodomesticos [8] = new Lavadora (100, "Negro", 'C', 70, 0, 35);
		electrodomesticos [9] = new Electrodomestico (170, "Gris", 'A', 100, 0);
		
		
		//creamos un loop 
		// dentro de este loop crearemos el objeto "e" perteneciente a la clase Electrodomestico
		//indicaremos que dentro del loop se recorra la misma cantidad de posiciones que posee el array
		for (Electrodomestico e : electrodomesticos){
			
			//si el tipo de elctrodomestico guardado en "e" es de la misma clase que "Lavadora"
			//se recoje su precio final, se suman a los siguientes valores dsel mismo tipo
			if (e instanceof Lavadora) {
				sumaLavadora += e.precioFinal();
			}
			
			
			//y los de tipo "Television"
			if (e instanceof Television) {
				sumaTelevision +=  e.precioFinal();;
			}
			
			//se repite la accion con los de tipo "Electrodomestico"
			if (e instanceof Electrodomestico) {
				sumaElectrodomestico += e.precioFinal(); 
			}
			
			
			
			//Se llama al metodo toString para que imprima la lista de todos los productos
			System.out.println(e.toString());
			System.out.println();
	}
		//Al sumar el valor de los electrodomesticos se incluyen a las lavadoras y los televisores
		//por lo tanto restamos el valor total de los electrodomesticos menos las lavadoras y los televisores
		sumaElectrodomestico = sumaElectrodomestico-(sumaTelevision+sumaLavadora);
		
		//finalmente imprimimos en pantalla los totales
		System.out.println("El precio de todas las lavadoras és = " + sumaLavadora);
		System.out.println("El precio de todos los electrodomésticos és = " + sumaElectrodomestico);
		System.out.println("El precio de todas las televisiones és = " + sumaTelevision);
		
			
		}
		
	}

