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
import AV2.bo.Cachorro;
import AV2.controller.CachorroController;
import AV2.jdbc.TesteBD;
import AV2.model.CachorroDAO;

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

public class TelaCriarCachorro {

//	CachorroDAO mod = new CachorroDAO();
	CachorroController control = new CachorroController();
	TesteBD conex = new TesteBD();
	
	
	
	private JFrame frmTelaCriarCachorro;
	private JTextField txtCriar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCriarCachorro window = new TelaCriarCachorro();
					window.frmTelaCriarCachorro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCriarCachorro() {
		initialize();
		
		frmTelaCriarCachorro.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaCriarCachorro = new JFrame();
		frmTelaCriarCachorro.setTitle("Tela Criar Cachorro");
		frmTelaCriarCachorro.getContentPane().setName("Login\r\n");
		frmTelaCriarCachorro.getContentPane().setLayout(null);
		
		txtCriar = new JTextField();
		txtCriar.setBounds(10, 11, 414, 42);
		txtCriar.setHorizontalAlignment(SwingConstants.CENTER);
		txtCriar.setBackground(Color.LIGHT_GRAY);
		txtCriar.setText("Inserir dados abaixo:");
		txtCriar.setName("Titulo");
		frmTelaCriarCachorro.getContentPane().add(txtCriar);
		txtCriar.setColumns(10);
		
		JFormattedTextField cachorro_nome = new JFormattedTextField();
		cachorro_nome.setBounds(140, 88, 160, 20);
		frmTelaCriarCachorro.getContentPane().add(cachorro_nome);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD));
		lblNewLabel.setBounds(50, 91, 80, 14);
		frmTelaCriarCachorro.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Cachorro cachorro = new Cachorro();
				cachorro.setNome(cachorro_nome.getText());
				cachorro.setIdade(cachorro_idade.getText());
				CachorroController controller = new CachorroController();
				controller.create(cachorro);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBounds(171, 227, 89, 23);
		frmTelaCriarCachorro.getContentPane().add(btnNewButton);
		
		JLabel lblIdadeCachorro = new JLabel("Idade");
		lblIdadeCachorro.setHorizontalAlignment(SwingConstants.CENTER);
		lblIdadeCachorro.setFont(lblIdadeCachorro.getFont().deriveFont(lblIdadeCachorro.getFont().getStyle() | Font.BOLD));
		lblIdadeCachorro.setBounds(50, 124, 80, 14);
		frmTelaCriarCachorro.getContentPane().add(lblIdadeCachorro);
		
		JFormattedTextField cachorro_idade = new JFormattedTextField();
		cachorro_idade.setBounds(140, 121, 160, 20);
		frmTelaCriarCachorro.getContentPane().add(cachorro_idade);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(323, 228, 101, 23);
		frmTelaCriarCachorro.getContentPane().add(btnNewButton_4);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new MenuPrincipal();
			}
		});
		btnMenuPrincipal.setBounds(323, 194, 101, 23);
		frmTelaCriarCachorro.getContentPane().add(btnMenuPrincipal);
		frmTelaCriarCachorro.setBounds(100, 100, 450, 300);
		frmTelaCriarCachorro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
