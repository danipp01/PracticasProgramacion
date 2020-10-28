import javax.swing.JOptionPane;

public class cap3 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca un número para sumar: ");
		int entero1 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzca otro número: ");
		int entero2 = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduzcs otro número: ");
		int entero3 = Integer.parseInt(str);
		int suma = entero1 + entero2 + entero3;
		System.out.println("El valor de la suma es: " + suma);
			
		

	}

}
