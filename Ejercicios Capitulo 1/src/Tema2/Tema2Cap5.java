package Tema2;
import javax.swing.JOptionPane;
public class Tema2Cap5 {

	public static void main(String[] args) {
		int numero1;
		String str1 = JOptionPane.showInputDialog("Introduzca un número entero:");
		numero1 = Integer.parseInt(str1);

		if (numero1 % 2 == 0) {
			System.out.println("Este número es par: " + numero1);
		}
		if (numero1 % 2 == 1) {
			System.out.println("Este número es impar: " + numero1);
		}

	}

}
