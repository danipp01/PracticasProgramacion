import javax.swing.JOptionPane;

public class Tema2Cap7 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		int e;
		    String str1 = JOptionPane.showInputDialog("Introduzca un número");
		    String str2 = JOptionPane.showInputDialog("Introduzca un número");
		    String str3 = JOptionPane.showInputDialog("Introduzca un número");
		    String str4 = JOptionPane.showInputDialog("Introduzca un número");
		    String str5 = JOptionPane.showInputDialog("Introduzca un número");
		    
		    
		      a = Integer.parseInt(str1); 
		      b = Integer.parseInt(str2); 
		      c = Integer.parseInt(str3); 
		      d = Integer.parseInt(str4); 
		      e = Integer.parseInt(str5); 
		      if ((a>b&&a>c)&&(a>d&&a>e)){
		    	  System.out.printf("%d\t Es el mayor",a );

		    	  }else if ((b>a&&b>c)&&(b>d&&b>e)){
		    	  System.out.printf("%d\t Es el mayor", b);

		    	  } else if((c>a&&c>b)&& (c>d&&c>e)){
		    	  System.out.printf("%d\t Es el mayor\n",c);

		    	  }else if ((e>a&&e>b)&&(e>c&&e>d)){
		    	  System.out.printf("%d\t Es el mayor\n",e);

		    	  }else if ((d>a&&d>b)&& (d>c&&d>e)){
		    	   System.out.printf("%d\t Es el mayor\n",d);
		    	  }
				 
	}

}
