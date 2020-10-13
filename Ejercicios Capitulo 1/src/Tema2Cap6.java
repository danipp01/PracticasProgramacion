import javax.swing.JOptionPane;

public class Tema2Cap6 {

	public static void main(String[] args) {
		int entero1;
		String str = JOptionPane.showInputDialog("Introduzca un número entero:");
		entero1 = Integer.parseInt(str);
		if (entero1 % 2 == 0 & entero1 != 0) {
			System.out.println("Este número es par: " + entero1);
		}
		if (entero1 % 2 == 1) {
			System.out.println("Este número es impar: " + entero1);
		}

	}

}
