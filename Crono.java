package SATURNO;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.RowSpec;
//import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Crono extends JFrame implements Runnable, ActionListener{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


public static int onoff = 0;



JLabel tempo;
Thread hilo;
boolean cronometroActivo;
boolean pausar;

/////////Ativador
boolean iniciado = true;
/////////////////////////////////////////////////////////////////////////

public Crono()    {
	getContentPane().setBackground(Color.LIGHT_GRAY);
	setTitle("Cronometro");
	setSize( 764, 453 );
	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	getContentPane().setLayout(null);

/////////////////////BOTAO INICIAR
	JButton btn = new JButton( "Iniciar" );
	btn.setBounds(510, 321, 132, 23);
	btn.addActionListener( this );
	
		JButton btnD = new JButton( "Parar" );
		btnD.setBounds(385, 321, 103, 23);
		// btnD.setVisible(false);
		btnD.addActionListener( this );
		
///////	REINICIAR do 0  /////////////////
			JButton btnP = new JButton( "Reiniciar" );
			btnP.setBounds(257, 321, 103, 23);
			btnP.addActionListener( this );
			getContentPane().add( btnP );
		getContentPane().add( btnD );
	getContentPane().add( btn );
	
//////////// FECHAR  /////////////////////
	JButton btnF = new JButton("Fechar");
	btnF.setBounds(70, 321, 89, 23);
	getContentPane().add(btnF);
	btnF.addActionListener( this );
		
	
	
	
	
	JLabel lblNewLabel = new JLabel("David Bastos Raphael Vieira");
	lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setBounds(32, 26, 682, 52);
	getContentPane().add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("Lasalle");
	lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Raz\\Pictures\\lasalle.png"));
	lblNewLabel_1.setBounds(42, 89, 235, 114);
	getContentPane().add(lblNewLabel_1);
	
////////////////GRAFICO DO RELOGIO ////////////
		tempo = new JLabel( "00:00:000" );
		tempo.setBounds(300, 89, 414, 152);
		tempo.setFont( new Font("Serif", Font.BOLD, 77) );
		tempo.setHorizontalAlignment( JLabel.CENTER );
		tempo.setForeground( Color.WHITE );
		tempo.setBackground( Color.LIGHT_GRAY );
		tempo.setOpaque( true );
		
			getContentPane().add( tempo );
			
			

	this.setLocationRelativeTo( null );
	setVisible( true );
}

///////////////////////////////////////////////

public void run(){
	Integer minutos = 0 , segundos = 0, milesimos = 0;
	
	
////////////////GRAFICO //////////
	String min = "", seg = "", mil = "";
	try {

		//Ajuste do tempo  ////////////
		
		while( cronometroActivo ) {
			
			if (!pausar) {

				Thread.sleep( 4 );
				
////////////////////////////////AJUSTANDO MILESIMOS
				milesimos += 4;
				
				
				if( milesimos == 1000 ) {
					milesimos = 0;
					segundos += 1;
					
//////////////////FORMULA DOS SEGUNDO E MINUTOS ///////////
					
					if( segundos == 60 )
					{
						segundos = 0;
						minutos++;
					}
					
					// AJUSTE DE COR DO FUNDO
					if (minutos%2==0)
					{
						tempo.setBackground(Color.GREEN);
						
					}
					else
						tempo.setBackground(Color.YELLOW);
					
				}

////////////////////////////FORMATACAO -> 00:00:000 /////////////////////////
				
				if( minutos < 10 ) min = "0" + minutos;
				else min = minutos.toString();
				if( segundos < 10 ) seg = "0" + segundos;
				else seg = segundos.toString();

				if( milesimos < 10 ) mil = "00" + milesimos;
				else if( milesimos < 100 ) mil = "0" + milesimos;
				else mil = milesimos.toString();

				
				tempo.setText( min + ":" + seg + ":" + mil );
			}
		}
		tempo.setText( min + ":" + seg + ":" + mil );

	}catch(Exception e){System.out.println("Error");}
	
//////////////////RESETAR RELOGIO 00:00:000  ///////////////////////
	tempo.setText( "00:00:000" );
}

//BOTOES
public void actionPerformed( ActionEvent evt ) {
	Object o = evt.getSource();
	
	// INICIAR
	if( o instanceof JButton ) {
		JButton btn = (JButton)o;
		if( btn.getText().equals("Iniciar") ){
			iniciarCronometro();
		}
		
	// REINICIAR	
		if( btn.getText().equals("Reiniciar") ) {
			reiniciarCronometro();
		}
		
	// PARAR	
		if( btn.getText().equals("Parar") ) {
			pararCronometro();
		}
		
	// FECHAR	
		if( btn.getText().equals("Fechar") ) {
			fecharCronometro();
		}
		
		
		
	}
}

//INICIAR CRONOMETRO

public void iniciarCronometro() {

	if (iniciado) {
		hilo = new Thread( this ); 	
		cronometroActivo = true;
		pausar = false;       
		hilo.start();
		iniciado = false;
	}else {
	}        
}

//COMANDO PARAR
public void pararCronometro(){
	pausar = true ;
	 
	iniciado = true;
///////////////////////////////////////////////////////////////////////////////////////////
}

public void reiniciarCronometro(){
	cronometroActivo = false;
	iniciado = true;
	
		
	tempo.setText( "00:00:000" );
///////////////////////////////////////////////////////////////////////////////////////////
}
//Comando Fechar
public void fecharCronometro(){
	System.exit(getDefaultCloseOperation());
		}

	
public static void main(String[] args) {		
	new Crono();
	
	
}
}