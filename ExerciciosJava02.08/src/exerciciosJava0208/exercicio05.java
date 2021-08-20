package exerciciosJava0208;
import javax.swing.JOptionPane;
public class exercicio05 {

	public static void main(String[] args) {
/*1.	Calcular e apresentar o valor do volume de uma lata de óleo, 
 * utilizando fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A 
 * representam respectivamente o volume, o raio e a altura. */
		
		double vet[] = new double [2];
		double volume = 0;
		
		vet[0] =Integer.parseInt(JOptionPane.showInputDialog("Qual o raio da lata?"));
		vet[1] = Integer.parseInt(JOptionPane.showInputDialog("Qual a altura da lata?"));
		
		volume = 3.14159 * vet [0] * vet[0] * vet[1] ;
		
		JOptionPane.showMessageDialog(null,"O volume dessa lata é:  " + String.format("%.2f",volume) + "L");	
		
	}

}
