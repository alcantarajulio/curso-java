
package Fundamentos;


public class Temperatura {

		public static void main(String[] args) {
			
			System.out.println("Bem Vindo a Conversora de Fahrenheit para Celsius!");
			// (°F - 32) x 5.0/9.0 = °C
			
			final int ajuste = 32;
			final double multiplicador = 5.0 / 9.0;
			double Fahrenheit = 86;
			double Celsius = (Fahrenheit - ajuste) * multiplicador;
			
			System.out.println(Fahrenheit + "°F em Celsius se torna: " + Celsius + "°C");
		}
}
