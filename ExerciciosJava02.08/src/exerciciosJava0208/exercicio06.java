package exerciciosJava0208;
import javax.swing.JOptionPane;
public class exercicio06 {

	public static void main(String[] args) {
/*programa para determinar a quantidade de cavalos necess�rios para se levantar uma massa de m quilogramas  
*a uma altura de h metros em t segundos.*/ 

		double vet[] = new double [3];
		double cavalos = 0;
		
		
		vet[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Massa (m) em quilogramas."));			
		vet[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura (h) em metros."));
		vet[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite e o Tempo (t) em segundos."));

		
	    cavalos = (vet[0] * vet[1] / vet[2]) / 745.6999;
	    
	    JOptionPane.showMessageDialog(null,"A quantidade necess�ria de Cavalos para carregar \n"
	    		+vet[0]+ " Quilos\n"
	    		+ " a uma dist�ncia de "+vet[1]+" de Metros\n"
	    		+ " por "+vet[2]+" segundos �: \n"
	    		+ String.format("%.2f",cavalos));
	}
}
