package Tema3;

import javax.swing.JOptionPane;

public class Tema3Parte1Ejer1 {

	public static void main(String[] args) {
		int numero, suma = 0;
		
		for (int i = 0; i < 4; i++) {
			String str = JOptionPane.showInputDialog("Introduce un número: ");
			numero = Integer.parseInt(str);
			if (numero > 10) {
				suma += numero;
			}
			System.out.println("El número introducido es: " + numero + " El valor de la suma es:" + suma);		
		}
		
	}

}
