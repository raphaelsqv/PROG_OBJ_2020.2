package AV2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {

	private JFrame frmTelaLogin;
	private JTextField txtLogin;
	private JPasswordField password_preencher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
	//				window.frmTelaLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
		
		frmTelaLogin.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmTelaLogin = new JFrame();
		frmTelaLogin.setTitle("Tela Login");
		frmTelaLogin.getContentPane().setName("Login\r\n");
		frmTelaLogin.getContentPane().setLayout(null);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(10, 11, 414, 42);
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setBackground(Color.LIGHT_GRAY);
		txtLogin.setText("Bem vindo");
		txtLogin.setName("Titulo");
		frmTelaLogin.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JFormattedTextField Login_preencher = new JFormattedTextField();
		Login_preencher.setBounds(152, 90, 160, 20);
		frmTelaLogin.getContentPane().add(Login_preencher);
		
		password_preencher = new JPasswordField();
		password_preencher.setBounds(152, 121, 160, 20);
		frmTelaLogin.getContentPane().add(password_preencher);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setFont(lblNewLabel.getFont().deriveFont(lblNewLabel.getFont().getStyle() | Font.BOLD));
		lblNewLabel.setBounds(62, 92, 80, 14);
		frmTelaLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(lblNewLabel_1.getFont().deriveFont(lblNewLabel_1.getFont().getStyle() | Font.BOLD));
		lblNewLabel_1.setBounds(62, 124, 80, 14);
		frmTelaLogin.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				new MenuPrincipal();
		//		Despite();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 13));
		btnNewButton.setBounds(182, 171, 89, 23);
		frmTelaLogin.getContentPane().add(btnNewButton);
		frmTelaLogin.setBounds(100, 100, 450, 300);
		frmTelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
