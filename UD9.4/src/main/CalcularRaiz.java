
package main;

//importamos 
import raices.raices;

//creamos una nueva Main donde crearemos los objetos y le pediremos que se realicen los calculos
public class CalcularRaiz {

	public static void main(String[] args) {

		// declaramos las variables con los parametros necesarios para realizar los
		// calculos

		double a = 1;
		double b = -5;
		double c = 6;
		char signoNegativo = '-';

		// imprimimos el valor del discriminante

		System.out
				.println("El discriminante es: " + raices.getDiscriminante(a, b, c, signoNegativo) + " por lo tanto: ");

		// usamos un condicional en funcion de si la ecuacion tiene una raiz o dos
		if (raices.tieneRaiz(a, b, c, signoNegativo)) {

			System.out.println("La ecuacion tiene una raiz \nEl resultados es:  ");

		} else {
			System.out.println("La ecuacion tiene dos raices \nLos resultados son: ");
		}

		// llamamos al metodo Calcular para que realice el calculo final
		raices.Calcular(a, b, c, signoNegativo);

		

	}

}
