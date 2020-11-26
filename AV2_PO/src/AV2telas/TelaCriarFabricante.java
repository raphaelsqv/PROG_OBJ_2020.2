package AV2telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import AV2.MenuPrincipal;
import AV2.controller.FabricanteController;
import AV2.controller.RacaoController;
import AV2.jdbc.TesteBD;
import AV2.model.FabricanteDAO;
import AV2.model.RacaoDAO;

import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTree;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCriarFabricante {

	FabricanteDAO mod = new FabricanteDAO();
	FabricanteController control = new FabricanteController();
	TesteBD conex = new TesteBD();	
	
	
	
	
	private JFrame frmTelaCriarFabricante;
	private JTextField txtCriar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarFabricante window = new TelaCriarFabricante();
					window.frmTelaCriarFabricante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCriarFabricante() {
		initialize();
		
		frmTelaCriarFabricante.setVisible(true);		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaCriarFabricante = new JFrame();
		frmTelaCriarFabricante.setTitle("Tela Criar Fabricante");
		frmTelaCriarFabricante.getContentPane().setName("Login\r\n");
		frmTelaCriarFabricante.getContentPane().setLayout(null);
		
		txtCriar = new JTextField();
		txtCriar.setBounds(10, 11, 414, 42);
		txtCriar.setHorizontalAlignment(SwingConstants.CENTER);
		txtCriar.setBackground(Color.LIGHT_GRAY);
		txtCriar.setText("Inserir dados abaixo:");
		txtCriar.setName("Titulo");
		frmTelaCriarFabricante.getContentPane().add(txtCriar);
		txtCriar.setColumns(10);
		
		JFormattedTextField NomeFabricante_preencher = new JFormattedTextField();
		NomeFabricante_preencher.setBounds(140, 88, 160, 20);
		frmTelaCriarFabricante.getContentPane().add(NomeFabricante_preencher);
		
		JLabel lblNewFabricante = new JLabel("Nome");
		lblNewFabricante.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewFabricante.setFont(lblNewFabricante.getFont().deriveFont(lblNewFabricante.getFont().getStyle() | Font.BOLD));
		lblNewFabricante.setBounds(50, 91, 80, 14);
		frmTelaCriarFabricante.getContentPane().add(lblNewFabricante);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				mod.setNome(NomeFabricante_preencher.getText());
			}
			
			
			
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBounds(171, 227, 89, 23);
		frmTelaCriarFabricante.getContentPane().add(btnNewButton);
		
		JLabel lblCNPJFabricante = new JLabel("CNPJ");
		lblCNPJFabricante.setHorizontalAlignment(SwingConstants.CENTER);
		lblCNPJFabricante.setFont(lblCNPJFabricante.getFont().deriveFont(lblCNPJFabricante.getFont().getStyle() | Font.BOLD));
		lblCNPJFabricante.setBounds(50, 124, 80, 14);
		frmTelaCriarFabricante.getContentPane().add(lblCNPJFabricante);
		
		JFormattedTextField CNPJ_preencher = new JFormattedTextField();
		CNPJ_preencher.setBounds(140, 121, 160, 20);
		frmTelaCriarFabricante.getContentPane().add(CNPJ_preencher);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(323, 228, 101, 23);
		frmTelaCriarFabricante.getContentPane().add(btnNewButton_4);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new MenuPrincipal();
			}
		});
		btnMenuPrincipal.setBounds(323, 194, 101, 23);
		frmTelaCriarFabricante.getContentPane().add(btnMenuPrincipal);
		frmTelaCriarFabricante.setBounds(100, 100, 450, 300);
		frmTelaCriarFabricante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
