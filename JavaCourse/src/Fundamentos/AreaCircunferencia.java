package Fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		
		
		double raio = 3.4;
		final double pi = 3.14159;
		//System.out.println(2 + 3);
		//System.out.println(2 + raio);
		//System.out.println(2 + pi);
		
		double area = pi * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = pi * raio * raio;
		System.out.println("Área = " + area);
	}
}
