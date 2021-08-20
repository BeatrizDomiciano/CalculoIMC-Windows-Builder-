package exerciciosJava0208;
import javax.swing.JOptionPane;
public class exercicio02 {

	public static void main(String[] args) {
/*Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
*Fazer um algoritmo que calcule e escreva:
    *a maior e a menor altura do grupo;
	*média de altura dos homens;
	*o número de mulheres */
		
		int sexo[] = new int [10];
		int fem = 0;
	    double alt[] = new double [10];
	    int maior = 0;
	    int menor = 0;
	    int quantH = 0;
	    double somaH = 0;
	    double mediaH = 0;
	    
		
		for (int i=0; i<10; i++) {
			
			sexo[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Feminino ou 2 para Masculino"));
			switch (sexo[i]) {
			case 1: JOptionPane.showMessageDialog(null,"Feminino");
			break;
			case 2: JOptionPane.showMessageDialog(null,"Masculino");
			break;
			default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA" , "ERRO" , JOptionPane.ERROR_MESSAGE); 
			}
			alt[i]= Integer.parseInt(JOptionPane.showInputDialog("Qual a sua altura em cm?"));
			
			//Quantas mulheres
			if (sexo[i]< 2) { 
				fem =fem + 1 ;
			}
			
			//Soma de altura dos homens
			if (sexo[i] > 1) {
				quantH = quantH + 1;
				somaH = alt[i] + somaH;
			}
			
			//Maior e menor altura
			if (alt[i]<alt[menor]) {
					menor = i; 
			}
			if (alt[i] >alt [maior]) {
				maior = i;
			}
		}

		//Média da altura dos homens
		mediaH = somaH / quantH ;
		
		JOptionPane.showMessageDialog(null,"A maior altura digitada foi: "+ alt[maior] + " cm");
		JOptionPane.showMessageDialog(null,"A menor altura digitada foi: "+ alt[menor] + " cm");
		JOptionPane.showMessageDialog(null,"O total de mulheres foi:  "+ fem);
		JOptionPane.showMessageDialog(null,"A média da altura dos homens é:  "+ mediaH);
	}

}
