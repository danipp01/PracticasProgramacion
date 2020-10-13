import javax.swing.JOptionPane;
public class cap6 {

	public static void main(String[] args) {
		float Euribor;
		float Diferencial;
		float Capital;
		int N;
		float InteresAnual;
		float Im;
		float CuotaMensual;

		String str = JOptionPane.showInputDialog("Introduzca Euribor:");

		Euribor = Float.parseFloat(str);

		String str1 = JOptionPane.showInputDialog("Introduzca Diferencial:");

		Diferencial = Float.parseFloat(str1);

		String str2 = JOptionPane.showInputDialog("Introduzca Capital:");

		Capital = Float.parseFloat(str2);

		String str3 = JOptionPane.showInputDialog("Introduzca N:");
		
		N = Integer.parseInt(str3);
		
		

		InteresAnual = Euribor + Diferencial;
		Im = (InteresAnual / 12) / 100;
		CuotaMensual = (float) (Capital * ((Im * Math.pow(1 + Im, N)) / (Math.pow(1 + Im, N) - 1)));

		System.out.println(CuotaMensual);

	}

}
