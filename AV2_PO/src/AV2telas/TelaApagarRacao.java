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

public class TelaApagarRacao {

	RacaoDAO mod = new RacaoDAO();
	RacaoController control = new RacaoController();
	TesteBD conex = new TesteBD();
	
	
	private JFrame frmTelaApagarRacao;
	private JTextField txtCriar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaApagarRacao window = new TelaApagarRacao();
					window.frmTelaApagarRacao.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaApagarRacao() {
		initialize();
		
		frmTelaApagarRacao.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaApagarRacao = new JFrame();
		frmTelaApagarRacao.setTitle("Tela Deletar Racao");
		frmTelaApagarRacao.getContentPane().setName("Login\r\n");
		frmTelaApagarRacao.getContentPane().setLayout(null);
		
		txtCriar = new JTextField();
		txtCriar.setEditable(false);
		txtCriar.setBounds(10, 11, 414, 42);
		txtCriar.setHorizontalAlignment(SwingConstants.CENTER);
		txtCriar.setBackground(Color.LIGHT_GRAY);
		txtCriar.setText("Inserir Ra\u00E7\u00E3o a ser apagado abaixo:");
		txtCriar.setName("Titulo");
		frmTelaApagarRacao.getContentPane().add(txtCriar);
		txtCriar.setColumns(10);
		
		JFormattedTextField racao_campo = new JFormattedTextField();
		racao_campo.setBounds(140, 88, 160, 20);
		frmTelaApagarRacao.getContentPane().add(racao_campo);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD));
		lblNewLabel.setBounds(50, 91, 80, 14);
		frmTelaApagarRacao.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Deletar!!!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				mod.setNome(racao_campo.getText());
				//racao_campo
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBounds(171, 227, 89, 23);
		frmTelaApagarRacao.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.setBounds(323, 228, 101, 23);
		frmTelaApagarRacao.getContentPane().add(btnNewButton_4);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new MenuPrincipal();
			}
		});
		btnMenuPrincipal.setBounds(323, 194, 101, 23);
		frmTelaApagarRacao.getContentPane().add(btnMenuPrincipal);
		frmTelaApagarRacao.setBounds(100, 100, 450, 300);
		frmTelaApagarRacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
