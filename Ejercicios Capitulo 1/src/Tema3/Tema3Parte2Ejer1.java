package Tema3;
import javax.swing.JOptionPane;

public class Tema3Parte2Ejer1 {

	public static void main(String[] args) {
		int numero1;
		float numero, suma = 0, media;
		String str2 = JOptionPane.showInputDialog("Introduzca el número de valores que desea: ");
		numero1 = Integer.parseInt(str2);
		for (int i = 0; i < numero1; i++) {
			String str = JOptionPane.showInputDialog("Introduce un número: ");
			numero = Float.parseFloat(str);
			suma = suma + numero;

		}
		media = suma / numero1;
		System.out.println("La media es: " + media);

	}

}
