package unico;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Triangulo_invertido_espacios_izq {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*).
		
		int n;
		int f;
		int e;
		int a;
		
		System.out.print("Introduzca un número: ");
		n = Integer.parseInt(teclado.nextLine());
		
		for(f=1; f<=n; f++) {
			for (e=1; e<= f-1; e++) {
				System.out.print(" ");
			}
			
			for (a=1; a<=n-f+1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
