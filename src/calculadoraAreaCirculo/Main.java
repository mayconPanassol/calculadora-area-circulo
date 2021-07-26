package calculadoraAreaCirculo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double area, raio;

		System.out.print("Digite o valor do raio: ");
		raio = sc.nextDouble();

		area = Math.PI * Math.pow(raio, 2);

		System.out.printf("A = %.4f", area);

		sc.close();
	}

}
