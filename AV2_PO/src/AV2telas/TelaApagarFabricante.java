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
import AV2.controller.CachorroController;
import AV2.controller.FabricanteController;
import AV2.jdbc.TesteBD;
import AV2.model.CachorroDAO;
import AV2.model.FabricanteDAO;

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

public class TelaApagarFabricante {

	//Modelo
		FabricanteDAO mod = new FabricanteDAO();
		FabricanteController control = new FabricanteController();
		TesteBD conex = new TesteBD();
	
	
	
	private JFrame frmTelaApagarFabricante;
	private JTextField txtCriar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaApagarFabricante window = new TelaApagarFabricante();
					window.frmTelaApagarFabricante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaApagarFabricante() {
		initialize();
		
		frmTelaApagarFabricante.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaApagarFabricante = new JFrame();
		frmTelaApagarFabricante.setTitle("Tela Deletar Fabricante");
		frmTelaApagarFabricante.getContentPane().setName("Login\r\n");
		frmTelaApagarFabricante.getContentPane().setLayout(null);
		
		txtCriar = new JTextField();
		txtCriar.setBounds(10, 11, 414, 42);
		txtCriar.setHorizontalAlignment(SwingConstants.CENTER);
		txtCriar.setBackground(Color.LIGHT_GRAY);
		txtCriar.setText("Inserir Fabricante a ser apagado abaixo:");
		txtCriar.setName("Titulo");
		frmTelaApagarFabricante.getContentPane().add(txtCriar);
		txtCriar.setColumns(10);
		
		JFormattedTextField fabricante_campo = new JFormattedTextField();
		fabricante_campo.setBounds(140, 88, 160, 20);
		frmTelaApagarFabricante.getContentPane().add(fabricante_campo);
		
		JLabel lblNewLabel = new JLabel("CNPJ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD));
		lblNewLabel.setBounds(50, 91, 80, 14);
		frmTelaApagarFabricante.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Deletar!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				mod.setNome(fabricante_campo.getText());
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBounds(171, 227, 89, 23);
		frmTelaApagarFabricante.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.setBounds(323, 228, 101, 23);
		frmTelaApagarFabricante.getContentPane().add(btnNewButton_4);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new MenuPrincipal();
			}
		});
		btnMenuPrincipal.setBounds(323, 194, 101, 23);
		frmTelaApagarFabricante.getContentPane().add(btnMenuPrincipal);
		frmTelaApagarFabricante.setBounds(100, 100, 450, 300);
		frmTelaApagarFabricante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
