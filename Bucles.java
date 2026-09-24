import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		metodoBucleFor();
	}

	public static void metodoBucleFor() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int numero = teclado.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);

		}
	}

	public static void metodoBucleWhile() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero entero: ");
		int numero = teclado.nextInt();

		while (numero < 10) {
			System.out.println("El numero introducido es menor que 10, introduce uno mayor.");
			numero = teclado.nextInt();
		}
		System.out.println("Finalizando programa.");
	}

	public static void metodoBucleDOWhile() {
		Scanner teclado = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Introduce un numero entero: ");
			numero = teclado.nextInt();
		} while (numero < 10);

		System.out.println("Finalizando programa.");
	}

}
