package Tema3;
import javax.swing.JOptionPane;

public class Tema3Parte1Ejer3 {

	public static void main(String[] args) {
		int numero, numero1, positivo = 0, negativo = 0;
		String str = JOptionPane.showInputDialog("Introduce el numero de variables que quiera usa: ");
		numero = Integer.parseInt(str);

		for (int i = 0; i < numero; i++) {
			String str2 = JOptionPane.showInputDialog("Introduce un número entero: ");
			numero1 = Integer.parseInt(str2);
			if (numero1 < 0) {
				negativo += 1;
			} else if (numero1 > 0) {
				positivo += 1;
			}

		}
		System.out.println("Los números positivos son: " + positivo +
				" \nLos números negativos son: " + negativo);
	}
}
