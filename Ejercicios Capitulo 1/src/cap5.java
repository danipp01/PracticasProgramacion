import javax.swing.JOptionPane;

public class cap5 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduzca una variable entera: ");
		int entero1 = Integer.parseInt(str);
		String str1 = JOptionPane.showInputDialog("Introduzca otra variable entera: ");
		int entero2 = Integer.parseInt(str1);
		System.out.println("El valor antiguo de la variable 1 es :" + entero1);
		System.out.println("El valor nuevo de la primera variable es: " + entero2);
		System.out.println("El valor antiguo de la variable 2 es :" + entero2);
		System.out.println("El valor nuevo de la segunda variable es: " + entero1);
		
		

	}

}
