package exerciciosJava0208;
import javax.swing.JOptionPane;
public class exercicio04 {

	public static void main(String[] args) {
/*programa que leia as quatro medidas hp, lp, ha e la, calcule e imprima quanto 
*azulejos com as medidas dadas s�o necess�rios para cobrir a parede dada.*/

		double medidas[]= new double [4];
		double quantAzu = 0;
		
		medidas[0]= Integer.parseInt(JOptionPane.showInputDialog("Qual a altura da parede?"));
		medidas[1]= Integer.parseInt(JOptionPane.showInputDialog("Qual a largura da parede?"));
		medidas[2]= Integer.parseInt(JOptionPane.showInputDialog("Qual a altura do azulejo?"));
		medidas[3]= Integer.parseInt(JOptionPane.showInputDialog("Qual a largura do azulejo?"));
		
		quantAzu = (medidas[0] * medidas[1]) / ((medidas[2]/100) * (medidas[3]/100) );
		
		JOptionPane.showMessageDialog(null,"A quantidade de azulejos necessaria �: " + String.format("%.2f",quantAzu));	
	}

}
