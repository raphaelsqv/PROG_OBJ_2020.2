package AV2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import AV2telas.TelaApagarCachorro;
import AV2telas.TelaApagarFabricante;
import AV2telas.TelaApagarRacao;
import AV2telas.TelaAtualizarCachorro;
import AV2telas.TelaAtualizarFabricante;
import AV2telas.TelaAtualizarRacao;
import AV2telas.TelaCriarCachorro;
import AV2telas.TelaCriarFabricante;
import AV2telas.TelaCriarRacao;
import AV2telas.TelaProcurar;

import java.awt.Color;
import javax.swing.JTextField;

public class MenuPrincipal {

	private JFrame frmMenu;
	private JTextField txtPainelDeControle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuPrincipal window = new MenuPrincipal();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuPrincipal() {
		initialize();
		
		frmMenu.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.getContentPane().setForeground(Color.BLACK);
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 450, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Criar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
			new TelaCriarCachorro();
			
			
			
			
			}
		});
		btnNewButton.setBounds(43, 89, 89, 23);
		frmMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Procurar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaProcurar();
				
			}
		});
		btnNewButton_1.setBounds(43, 123, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Atualizar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaAtualizarCachorro();
				
			}
		});
		btnNewButton_2.setBounds(43, 157, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Apagar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaApagarCachorro();
				
			}
		});
		btnNewButton_3.setBounds(43, 191, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(335, 227, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_4);
		
		JLabel lbCachorro = new JLabel("Cachorro");
		lbCachorro.setHorizontalAlignment(SwingConstants.CENTER);
		lbCachorro.setBounds(43, 55, 89, 14);
		frmMenu.getContentPane().add(lbCachorro);
		
		JLabel lblRacao = new JLabel("Ra\u00E7\u00E3o");
		lblRacao.setHorizontalAlignment(SwingConstants.CENTER);
		lblRacao.setBounds(169, 55, 89, 14);
		frmMenu.getContentPane().add(lblRacao);
		
		JButton btnNewButton_5 = new JButton("Criar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaCriarRacao();
				
			}
		});
		btnNewButton_5.setBounds(169, 89, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_1_1 = new JButton("Procurar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaProcurar();
			}
		});
		btnNewButton_1_1.setBounds(169, 123, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Atualizar");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaAtualizarRacao();
				
			}
		});
		btnNewButton_2_1.setBounds(169, 157, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("Apagar");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaApagarRacao();
				
			}
		});
		btnNewButton_3_1.setBounds(169, 191, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_3_1);
		
		JLabel lblFabricante = new JLabel("Fabricante");
		lblFabricante.setHorizontalAlignment(SwingConstants.CENTER);
		lblFabricante.setBounds(294, 55, 89, 14);
		frmMenu.getContentPane().add(lblFabricante);
		
		JButton btnNewButton_6 = new JButton("Criar");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaCriarFabricante();
				
			}
		});
		btnNewButton_6.setBounds(294, 89, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_1_2 = new JButton("Procurar");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaProcurar();
			}
		});
		btnNewButton_1_2.setBounds(294, 123, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("Atualizar");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaAtualizarFabricante();
			}
		});
		btnNewButton_2_2.setBounds(294, 157, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_2_2);
		
		JButton btnNewButton_3_2 = new JButton("Apagar");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new TelaApagarFabricante();
			}
		});
		btnNewButton_3_2.setBounds(294, 191, 89, 23);
		frmMenu.getContentPane().add(btnNewButton_3_2);
		
		txtPainelDeControle = new JTextField();
		txtPainelDeControle.setText("Painel de Controle");
		txtPainelDeControle.setName("Titulo");
		txtPainelDeControle.setHorizontalAlignment(SwingConstants.CENTER);
		txtPainelDeControle.setColumns(10);
		txtPainelDeControle.setBackground(Color.LIGHT_GRAY);
		txtPainelDeControle.setBounds(10, 11, 414, 33);
		frmMenu.getContentPane().add(txtPainelDeControle);
	}

	public void setVisible(boolean b) {
		
		
		
		
		
	}

	
}
