package exerciciosJava0208;
import javax.swing.JOptionPane;
public class exercicio03 {

	public static void main(String[] args) {
/*programa que calcule a m�dia de sal�rios de uma empresa, pedindo ao usu�rio
*a grade de funcion�rios e os sal�rios, e devolvendo a m�dia salarial.*/
		
		int salarios[] = new int [20];
		int i =0;
		double soma = 0;
		
		for (i = 0; i < salarios.length; i++) {
			salarios[i] =Integer.parseInt(JOptionPane.showInputDialog("Digite o sal�rio do " + i + " funcion�rio."));
			
			switch (salarios[i]) {
			case 0: JOptionPane.showMessageDialog(null,"Coloque um sal�rio.");
			}
			soma = salarios[i] + soma;
		}
		double media = soma / salarios.length;
		JOptionPane.showMessageDialog(null,"A m�dia salarial da empresa �: R$" + media);
		
	}

}

