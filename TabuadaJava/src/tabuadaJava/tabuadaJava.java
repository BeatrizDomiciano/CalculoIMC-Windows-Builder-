package tabuadaJava;
import javax.swing.JOptionPane;
public class tabuadaJava {

	public static void main(String[] args) {
		// Tabuada
		
		int tab = 1;
		while (tab > 0){
		tab = Integer.parseInt(JOptionPane.showInputDialog("Quer saber a tabuada de qual número?"));
		
		if (tab != 0) {
			for (int cont= 1; cont< 11; cont+=1) {
				int r = tab * cont;
				JOptionPane.showMessageDialog(null,tab + " X " + cont + " = " + r);;
			}
		}
			else {
				JOptionPane.showMessageDialog(null,"Você saiu do programa.");
			}	
		}
	}
}



