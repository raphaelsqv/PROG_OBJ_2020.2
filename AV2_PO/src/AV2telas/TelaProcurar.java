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
import AV2.controller.RacaoController;
import AV2.jdbc.TesteBD;
import AV2.model.CachorroDAO;
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
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class TelaProcurar {

	CachorroDAO mod = new CachorroDAO();
	CachorroController control = new CachorroController();
	TesteBD conex = new TesteBD();

	
	FabricanteDAO modf = new FabricanteDAO();
	FabricanteController controlf = new FabricanteController();
	
		
	RacaoDAO modr = new RacaoDAO();
	RacaoController controlr = new RacaoController();
	
////////////////////////////////////////////////////////////////////////////////////	
	
	
	private JFrame frmTelaProcurarCachorro;
	private JTextField txtCriar;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProcurar window = new TelaProcurar();
					window.frmTelaProcurarCachorro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaProcurar() {
		initialize();
		
		frmTelaProcurarCachorro.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTelaProcurarCachorro = new JFrame();
		frmTelaProcurarCachorro.setTitle("Tela Procurar Cachorro");
		frmTelaProcurarCachorro.getContentPane().setName("Login\r\n");
		frmTelaProcurarCachorro.getContentPane().setLayout(null);
		
		txtCriar = new JTextField();
		txtCriar.setBounds(10, 11, 414, 42);
		txtCriar.setHorizontalAlignment(SwingConstants.CENTER);
		txtCriar.setBackground(Color.LIGHT_GRAY);
		txtCriar.setText("Inserir dados abaixo:");
		txtCriar.setName("Titulo");
		frmTelaProcurarCachorro.getContentPane().add(txtCriar);
		txtCriar.setColumns(10);
		
		JButton btnNewButton = new JButton("Procurar");
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBounds(323, 165, 101, 23);
		frmTelaProcurarCachorro.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_4.setActionCommand("System.exit(0);");
		btnNewButton_4.setBounds(323, 228, 101, 23);
		frmTelaProcurarCachorro.getContentPane().add(btnNewButton_4);
		
		JButton btnMenuPrincipal = new JButton("Menu Principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			//	new MenuPrincipal();
				
				MenuPrincipal menuprincipal = new MenuPrincipal(); 
				
			menuprincipal.setVisible(true);
	//		menuprincipal.dispose();
			
			
			
			}
		});
		btnMenuPrincipal.setBounds(323, 199, 101, 23);
		frmTelaProcurarCachorro.getContentPane().add(btnMenuPrincipal);
		
		table = new JTable();
		table.setBounds(20, 64, 264, 166);
		frmTelaProcurarCachorro.getContentPane().add(table);
		frmTelaProcurarCachorro.setBounds(100, 100, 450, 300);
		frmTelaProcurarCachorro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
