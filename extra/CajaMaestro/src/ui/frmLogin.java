package ui;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdOperador;
	private JTextField txtContrasenia;
	private JLabel lblContrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin frame = new frmLogin();
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
	public frmLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 700);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);

		JPanel pnlLogin = new JPanel();
		pnlLogin.setBackground(new Color(139, 0, 0));
		pnlLogin.setBounds(0, 0, 727, 700);
		pnlLogin.setLayout(null);
		getContentPane().add(pnlLogin);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(10, 11, 349, 632);
		panel.setLayout(null);
		pnlLogin.add(panel);
		
		JPanel imgMaestro = new JPanel();
		imgMaestro.setBackground(new Color(139, 0, 0));
		imgMaestro.setBounds(10, 132, 329, 193);
		imgMaestro.setLayout(null);
		panel.add(imgMaestro);
		
		ImageIcon imagen = new ImageIcon(getClass().getResource("/ui/img/maestro.jpg"));
		JLabel lblImagen = new JLabel("");
		lblImagen.setBounds(0, 21, 329, 145);
		Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
		lblImagen.setIcon(icono);
		imgMaestro.add(lblImagen);
		
		JPanel pnlEntradas = new JPanel();
		pnlEntradas.setBackground(new Color(139, 0, 0));
		pnlEntradas.setBounds(10, 331, 329, 290);
		pnlEntradas.setLayout(null);
		panel.add(pnlEntradas);
		
		JLabel lblIdOperador = new JLabel("ID del Operador:");
		lblIdOperador.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIdOperador.setForeground(Color.WHITE);
		lblIdOperador.setBounds(26, 24, 112, 29);
		pnlEntradas.add(lblIdOperador);
		
		lblContrasenia = new JLabel("Contraseña:");
		lblContrasenia.setVisible(false);
		lblContrasenia.setForeground(Color.WHITE);
		lblContrasenia.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblContrasenia.setBounds(53, 64, 80, 29);
		pnlEntradas.add(lblContrasenia);
		
		txtIdOperador = new JTextField();
		txtIdOperador.setColumns(5);
		txtIdOperador.setBounds(136, 29, 151, 20);
		txtIdOperador.setFocusable(true);
		txtIdOperador.requestFocusInWindow();
		pnlEntradas.add(txtIdOperador);
		
		txtContrasenia = new JTextField("a");
		txtContrasenia.setVisible(false);
		txtContrasenia.setColumns(4);
		txtContrasenia.setFocusable(false);
		txtContrasenia.setBounds(136, 69, 151, 20);
		pnlEntradas.add(txtContrasenia);
		
		JPanel pnlTeclado = new JPanel();
		pnlTeclado.setBackground(SystemColor.inactiveCaptionBorder);
		pnlTeclado.setBounds(369, 11, 348, 413);
		pnlTeclado.setLayout(null);
		pnlLogin.add(pnlTeclado);
		
		JPanel pnlTeclas = new JPanel();
		pnlTeclas.setBackground(new Color(139, 0, 0));
		pnlTeclas.setBounds(10, 58, 328, 346);
		pnlTeclas.setLayout(null);
		pnlTeclado.add(pnlTeclas);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(20, 0, 66, 69);
		pnlTeclas.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(86, 0, 66, 69);
		pnlTeclas.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(151, 0, 66, 69);
		pnlTeclas.add(btn9);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_Cancelar();
			}
		});
		btnCancelar.setBounds(216, 0, 88, 69);
		pnlTeclas.add(btnCancelar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_Borrar();
			}
		});
		btnBorrar.setBounds(216, 68, 88, 69);
		pnlTeclas.add(btnBorrar);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(151, 68, 66, 69);
		pnlTeclas.add(btn6);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(20, 68, 66, 69);
		pnlTeclas.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(86, 68, 66, 69);
		pnlTeclas.add(btn5);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(151, 136, 66, 69);
		pnlTeclas.add(btn3);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(20, 136, 66, 69);
		pnlTeclas.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(86, 136, 66, 69);
		pnlTeclas.add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(86, 204, 66, 69);
		pnlTeclas.add(btn0);
		
		JButton btnVacio2 = new JButton("");
		btnVacio2.setBounds(151, 204, 66, 69);
		pnlTeclas.add(btnVacio2);
		
		JButton btnVacio1 = new JButton("");
		btnVacio1.setBounds(20, 204, 66, 69);
		pnlTeclas.add(btnVacio1);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_Atras();
			}
		});
		btnAtras.setBounds(216, 136, 88, 69);
		pnlTeclas.add(btnAtras);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_Entrar();
			}
		});
		btnEntrar.setBounds(216, 204, 88, 142);
		pnlTeclas.add(btnEntrar);
		
		JButton btnAbajoLargo = new JButton("");
		btnAbajoLargo.setBounds(20, 271, 197, 75);
		pnlTeclas.add(btnAbajoLargo);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.inactiveCaptionBorder);
		panel_3.setBounds(369, 603, 348, 40);
		pnlLogin.add(panel_3);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setIcon(new ImageIcon(frmLogin.class.getResource("/ui/img/signo-de-interrogacion.png")));
		btnAyuda.setBounds(369, 462, 132, 69);
		pnlLogin.add(btnAyuda);
		
		JPanel pnlDatos = new JPanel();
		pnlDatos.setBackground(new Color(139, 0, 0));
		pnlDatos.setBounds(0, 654, 727, 46);
		pnlLogin.add(pnlDatos);
		
		btn0.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(0);}});
		btn1.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(1);}});
		btn2.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(2);}});
		btn3.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(3);}});
		btn4.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(4);}});
		btn5.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(5);}});
		btn6.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(6);}});
		btn7.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(7);}});
		btn8.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(8);}});
		btn9.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_PonerNumero(9);}});
	}

	protected void btn_Atras() {
		// TODO Auto-generated method stub
		if(txtIdOperador.isFocusable()==true) {
			if (!txtIdOperador.getText().isEmpty()) {
				txtIdOperador.setText(txtIdOperador.getText().substring(0, txtIdOperador.getText().length() - 1));
	        }
			txtIdOperador.requestFocus();
		}
		if(txtContrasenia.isFocusable()==true) {
			if (!txtContrasenia.getText().isEmpty()) {
	            txtContrasenia.setText(txtContrasenia.getText().substring(0, txtContrasenia.getText().length() - 1));
	        }
			txtContrasenia.requestFocus();
		}
	}

	protected void btn_Cancelar() {
		// TODO Auto-generated method stub
		txtIdOperador.setText("");
		txtContrasenia.setText("a");
		txtContrasenia.setFocusable(false);
		txtIdOperador.setFocusable(true);
		txtContrasenia.setVisible(false);
		lblContrasenia.setVisible(false);
		txtIdOperador.requestFocus();
		
	}

	protected void btn_Borrar() {
		// TODO Auto-generated method stub
		if(txtIdOperador.isFocusable()==true) {
			txtIdOperador.setText("");
			txtContrasenia.setFocusable(false);
			txtIdOperador.requestFocus();
		}
		if(txtContrasenia.isFocusable()==true) {
			txtContrasenia.setText("");
			txtContrasenia.requestFocus();
			txtIdOperador.setFocusable(false);
		}
	}

	protected void btn_Entrar() {
		if(txtIdOperador.getText().length()<5 && txtIdOperador.isFocusable()==true) {
			JOptionPane.showMessageDialog(null, "Complete los campos");
			txtIdOperador.requestFocus();
			return;
		}
		if(txtContrasenia.getText().length()<4 && txtContrasenia.isFocusable()==true){
			JOptionPane.showMessageDialog(null, "Complete los campos");
			txtContrasenia.requestFocus();
			return;
		}
		if(txtIdOperador.getText().length()==5 && txtContrasenia.isFocusable()==false){
			txtContrasenia.setText("");
			txtIdOperador.setFocusable(false);
			txtContrasenia.setFocusable(true);
			lblContrasenia.setVisible(true);
			txtContrasenia.setVisible(true);
			txtContrasenia.requestFocusInWindow();
		}
		
		if(txtContrasenia.getText().length()==4) {
			this.dispose();
			frmInicio inicio = new frmInicio();
			inicio.setVisible(true);
			return;
		}
		
	}

	protected void btn_PonerNumero(int n) {
		String texto;
		if(txtIdOperador.isFocusable()==true) {
			texto = txtIdOperador.getText();
			if(texto.length()<=4) {
				txtIdOperador.setText(texto+n);
			}
		}
		if(txtContrasenia.isFocusable()==true) {
			texto = txtContrasenia.getText();
			if(texto.length()<=3) {
				txtContrasenia.setText(texto+n);
			}
		}
	}
}
