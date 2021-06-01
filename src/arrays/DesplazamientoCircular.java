package arrays;

import java.util.Scanner;

public class DesplazamientoCircular {

	public static void main(String[] args) {
		
		Scanner entra = new Scanner(System.in);

		int array [] = new int [10];
		int ultimo;
		
		for(int i=0; i<10; i++) {
			System.out.print(i+".- Digita un número ");
			array [i] = entra.nextInt();
		}
		
		ultimo=array[9];
		
		for(int i=9; i>0; i--) {
			
			array[i] = array[i-1];
			
		}
		
		
		array [0] = ultimo;
		
		for (int i=0; i<10; i++) {
			System.out.println("El nuevo acomodo es: "+(i)+" .- "+array[i]);
		}
		
		
	}

}
