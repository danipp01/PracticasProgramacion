import javax.swing.JOptionPane;

public class Tema2Parte3Ejer2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog(
				"Indique el tipo de operación que desea realizar: 1=raices; 2=potencias; 3=módulo división");
		int seleccion = Integer.parseInt(str);

		if (seleccion == 1) {
			String str1 = JOptionPane.showInputDialog("Introduzca la base: ");
			float numero1 = Float.parseFloat(str1);
			String str2 = JOptionPane.showInputDialog("Introduzca la raiz: ");
			float numero2 = Float.parseFloat(str2);
			System.out.println(Math.pow(numero1, 1 / numero2));
		}
		if (seleccion == 2) {
			String str1 = JOptionPane.showInputDialog("Introduzca la base: ");
			float numero1 = Float.parseFloat(str1);
			String str2 = JOptionPane.showInputDialog("Introduzca el exponente: ");
			float numero2 = Float.parseFloat(str2);
			System.out.println(Math.pow(numero1, numero2));
		}
		if (seleccion == 3) {
			String str1 = JOptionPane.showInputDialog("Introduzca el divisor: ");
			float numero1 = Float.parseFloat(str1);
			String str2 = JOptionPane.showInputDialog("Introduzca el dividendo: ");
			float numero2 = Float.parseFloat(str2);
			System.out.println(numero1 % numero2);
		}

	}

}
