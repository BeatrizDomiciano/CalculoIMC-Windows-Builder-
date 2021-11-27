package IMC;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtPeso;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 379);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 196));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalcule = new JLabel("Calcule seu IMC");
		lblCalcule.setForeground(new Color(102, 0, 0));
		lblCalcule.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblCalcule.setBounds(10, 0, 198, 52);
		contentPane.add(lblCalcule);
		
		JLabel lblDigitePeso = new JLabel("Digite seu peso: ");
		lblDigitePeso.setForeground(new Color(153, 102, 51));
		lblDigitePeso.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDigitePeso.setBounds(10, 87, 112, 20);
		contentPane.add(lblDigitePeso);
		
		txtPeso = new JTextField();
		txtPeso.setForeground(new Color(153, 102, 0));
		txtPeso.setBackground(new Color(204, 153, 102));
		txtPeso.setBounds(122, 87, 86, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);
		
		JLabel lblKG = new JLabel("Kg.");
		lblKG.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblKG.setForeground(new Color(153, 102, 0));
		lblKG.setBounds(218, 87, 46, 20);
		contentPane.add(lblKG);
		
		JLabel lblDigiteSuaAltura = new JLabel("Digite sua altura: ");
		lblDigiteSuaAltura.setForeground(new Color(153, 102, 51));
		lblDigiteSuaAltura.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblDigiteSuaAltura.setBounds(10, 140, 120, 20);
		contentPane.add(lblDigiteSuaAltura);
		
		txtAltura = new JTextField();
		txtAltura.setForeground(new Color(153, 102, 0));
		txtAltura.setColumns(10);
		txtAltura.setBackground(new Color(204, 153, 102));
		txtAltura.setBounds(133, 140, 86, 20);
		contentPane.add(txtAltura);
		
		JLabel lblMetros = new JLabel("metros.");
		lblMetros.setForeground(new Color(153, 102, 0));
		lblMetros.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMetros.setBounds(229, 140, 58, 20);
		contentPane.add(lblMetros);
		
		JLabel lblSeuImc = new JLabel("Seu IMC \u00E9: ");
		lblSeuImc.setForeground(new Color(153, 102, 51));
		lblSeuImc.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblSeuImc.setBounds(10, 204, 86, 20);
		contentPane.add(lblSeuImc);
		
		JLabel lblVocEst = new JLabel("Voc\u00EA est\u00E1:");
		lblVocEst.setForeground(new Color(153, 102, 51));
		lblVocEst.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblVocEst.setBounds(10, 237, 79, 20);
		contentPane.add(lblVocEst);
		
		JLabel lblIMC = new JLabel("?");
		lblIMC.setHorizontalAlignment(SwingConstants.CENTER);
		lblIMC.setForeground(new Color(153, 102, 0));
		lblIMC.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblIMC.setBounds(96, 204, 96, 20);
		contentPane.add(lblIMC);
		
		JLabel lblResult = new JLabel("?");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setForeground(new Color(153, 102, 0));
		lblResult.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblResult.setBounds(96, 237, 96, 20);
		contentPane.add(lblResult);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon("C:\\Users\\beatr\\eclipse-workspace\\IMC\\src\\IMC\\imagemIMCentrada.jpg"));
		lblImagem.setBounds(318, 5, 212, 329);
		contentPane.add(lblImagem);
		
		JButton bntCalcular = new JButton("CALCULAR");
		bntCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				float peso=0, alt=0, imc;
				peso= Float.parseFloat(txtPeso.getText());
				alt= Float.parseFloat(txtAltura.getText());
				imc = peso/(alt*alt);
				
				String x = String.format("%,2f", imc);
				
				lblIMC.setText(x);
				
				if(imc<25) {
					lblIMC.setForeground(Color.blue);
					lblResult.setForeground(Color.blue); 
					lblResult.setText("abaixo do");
					lblImagem.setIcon(new ImageIcon("C:\\Users\\beatr\\eclipse-workspace\\IMC\\src\\IMC\\IMCAbaixoDoPeso.jpg"));
				}else if(imc>30) {
					lblIMC.setForeground(Color.orange);
					lblResult.setForeground(Color.orange); 
					lblResult.setText("acima do");
					lblImagem.setIcon(new ImageIcon("C:\\Users\\beatr\\eclipse-workspace\\IMC\\src\\IMC\\IMCAcimaDoPEso.png"));
				} else {
					lblIMC.setForeground(Color.green);
					lblResult.setForeground(Color.green); 
					lblResult.setText("dentro do");
					lblImagem.setIcon(new ImageIcon("C:\\Users\\beatr\\eclipse-workspace\\IMC\\src\\IMC\\IMCNoPeso.jpg"));
				}
				
			}
		});
		bntCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bntCalcular.setBackground(new Color(245, 222, 179));
		bntCalcular.setFont(new Font("Times New Roman", Font.BOLD, 16));
		bntCalcular.setForeground(new Color(153, 102, 51));
		bntCalcular.setBounds(10, 291, 131, 28);
		contentPane.add(bntCalcular);
		
		JButton bntSair = new JButton("SAIR");
		bntSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(ABORT);
			}
		});
		bntSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bntSair.setBackground(new Color(245, 222, 179));
		bntSair.setFont(new Font("Times New Roman", Font.BOLD, 16));
		bntSair.setForeground(new Color(153, 102, 51));
		bntSair.setBounds(162, 291, 121, 28);
		contentPane.add(bntSair);
		
		JLabel lblPeso = new JLabel("peso.");
		lblPeso.setForeground(new Color(153, 102, 0));
		lblPeso.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPeso.setBounds(206, 237, 58, 20);
		contentPane.add(lblPeso);
		
		
	}
}
