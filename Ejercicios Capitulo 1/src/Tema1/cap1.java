import javax.swing.JOptionPane;

public class cap1 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Introduce un número entero" );
		int entero = Integer.parseInt(str);
		str = JOptionPane.showInputDialog("Introduce un número flotante");
		float flotante = Float.parseFloat(str);
		str = JOptionPane.showInputDialog("Introduce un número doble");
		double doble = Double.parseDouble(str);
		System.out.println("Los números son: " + entero + flotante + doble ); 
	
		

	}

}

