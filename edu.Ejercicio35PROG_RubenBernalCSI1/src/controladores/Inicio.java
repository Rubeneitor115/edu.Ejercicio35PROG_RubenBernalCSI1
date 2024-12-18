/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.LocalDate;
import java.time.Period;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 181224
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 181224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creo las dos fechas
		LocalDate inicio = LocalDate.of(2021, 4, 1);
		LocalDate fin = LocalDate.of(2023, 9, 30);

		//Calculo la diferencia entre las dos fechas
		Period periodo = Period.between(inicio, fin);

		//Imprimo los resultados
		System.out.println("Años: " + periodo.getYears() + ", Meses: " + periodo.getMonths() + ", Días: " + periodo.getDays());

	}

}
