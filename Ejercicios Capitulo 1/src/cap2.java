import javax.swing.JOptionPane;

public class cap2 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un número entero:" );
		int entero = Integer.parseInt(str);
		System.out.println("El número entero es: " + entero);
		str = JOptionPane.showInputDialog("Introduce un número flotante: ");
		float flotante = Float.parseFloat(str);
		System.out.println("El número flotante es: " + flotante);
		str = JOptionPane.showInputDialog("Introduce un número doble: ");
		double doble = Double.parseDouble(str);
		System.out.println("El número doble es: " + doble);
		
		
		
	}

}
