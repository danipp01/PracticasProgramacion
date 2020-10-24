package Tema3;
import javax.swing.JOptionPane;

public class Tema3Parte1Ejer2 {

	public static void main(String[] args) {
		int numero, numero1, suma = 0;
		String str2 = JOptionPane.showInputDialog("Introduzca el número de valores que desea: ");
		numero1 = Integer.parseInt(str2);
		for (int i = 0; i < numero1; i++) {
			String str = JOptionPane.showInputDialog("Introduce un número: ");
			numero = Integer.parseInt(str);
			if (numero > 10) {
				suma += numero;
			}
			System.out.println("El número introducido es: " + numero + " El valor de la suma es:" + suma);
		}
		
	}

}
