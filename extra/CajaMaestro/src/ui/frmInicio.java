package ui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ui.frmOptionYesNo.ConfirmacionListener;

import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmInicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JButton btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve, btnDiez, btnOnce, btnDoce;
	JLabel lblComun, lblEntrada, lblVarios, lblNotadeVenta, lblTitulo, lblInfo;
	private JPanel pnlTeclas;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnCancelar;
	private JButton btnBorrar;
	private JButton btn6;
	private JButton btn4;
	private JButton btn5;
	private JButton btn3;
	private JButton btn1;
	private JButton btn2;
	private JButton btn0;
	private JButton btnVacio2;
	private JButton btnVacio1;
	private JButton btnAtras;
	private JButton btnEntrar;
	private JButton btnAbajoLargo;
	JPanel pnlBotones;
	
	frmOptionYesNo pnlOption;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmInicio frame = new frmInicio();
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
	public frmInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 700);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		pnlOption = new frmOptionYesNo();
		pnlOption.setVisible(false);
		
		
		JPanel panelInicio = new JPanel();
		panelInicio.setBackground(new Color(139, 0, 0));
		panelInicio.setBounds(0, 0, 727, 700);
		panelInicio.setLayout(null);
		getContentPane().add(panelInicio);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(10, 134, 316, 304);
		panelInicio.add(panel);
		
		pnlBotones = new JPanel();
		pnlBotones.setVisible(true);
		pnlBotones.setBackground(SystemColor.inactiveCaptionBorder);
		pnlBotones.setBounds(336, 86, 381, 352);
		pnlBotones.setLayout(null);
		panelInicio.add(pnlBotones);
		
		btnUno = new JButton("Cantidad");
		btnUno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUno.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnUno.setBounds(10, 29, 83, 94);
		pnlBotones.add(btnUno);
		
		btnNueve = new JButton("Ingreso");
		btnNueve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNueve.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnNueve.setBounds(10, 235, 83, 94);
		pnlBotones.add(btnNueve);
		
		btnSeis = new JButton("Verificacion de precio");
		btnSeis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSeis.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnSeis.setBounds(103, 130, 83, 94);
		pnlBotones.add(btnSeis);
		
		btnSiete = new JButton("Bandeja de entrada");
		btnSiete.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSiete.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnSiete.setBounds(196, 130, 83, 94);
		pnlBotones.add(btnSiete);
		
		btnCinco = new JButton("Peso");
		btnCinco.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnCinco.setBounds(10, 130, 83, 94);
		pnlBotones.add(btnCinco);
		
		btnDos = new JButton("Nose");
		btnDos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDos.setVisible(false);
		btnDos.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnDos.setBounds(103, 29, 83, 94);
		pnlBotones.add(btnDos);
		
		btnTres = new JButton("Cantidad");
		btnTres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTres.setVisible(false);
		btnTres.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnTres.setBounds(196, 29, 83, 94);
		pnlBotones.add(btnTres);
		
		btnCuatro = new JButton("Cantidad");
		btnCuatro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCuatro.setVisible(false);
		btnCuatro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnCuatro.setBounds(288, 29, 83, 94);
		pnlBotones.add(btnCuatro);
		
		btnOcho = new JButton("Cantidad");
		btnOcho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOcho.setVisible(false);
		btnOcho.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnOcho.setBounds(289, 130, 83, 94);
		pnlBotones.add(btnOcho);
		
		btnDiez = new JButton("Cantidad");
		btnDiez.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDiez.setVisible(false);
		btnDiez.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnDiez.setBounds(103, 235, 83, 94);
		pnlBotones.add(btnDiez);
		
		btnOnce = new JButton("Cantidad");
		btnOnce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnOnce.setVisible(false);
		btnOnce.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnOnce.setBounds(196, 235, 83, 94);
		pnlBotones.add(btnOnce);
		
		btnDoce = new JButton("Cantidad");
		btnDoce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDoce.setVisible(false);
		btnDoce.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnDoce.setBounds(288, 235, 83, 94);
		pnlBotones.add(btnDoce);
		
		lblTitulo = new JLabel("Común");
		lblTitulo.setForeground(SystemColor.textHighlight);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTitulo.setBounds(10, 11, 158, 14);
		pnlBotones.add(lblTitulo);
		
		lblComun = new JLabel("Común");
		lblComun.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_Comun();
			}
		});
		lblComun.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblComun.setHorizontalAlignment(SwingConstants.CENTER);
		lblComun.setOpaque(true);
		lblComun.setBackground(SystemColor.inactiveCaptionBorder);
		lblComun.setBounds(336, 437, 76, 75);
		panelInicio.add(lblComun);
		
		lblEntrada = new JLabel("Entrada");
		lblEntrada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_Entrada();
			}
		});
		lblEntrada.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblEntrada.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntrada.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEntrada.setOpaque(true);
		lblEntrada.setBackground(SystemColor.inactiveCaption);
		lblEntrada.setBounds(411, 437, 76, 75);
		panelInicio.add(lblEntrada);
		
		lblVarios = new JLabel("Varios");
		lblVarios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_Varios();
			}
		});
		lblVarios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVarios.setHorizontalAlignment(SwingConstants.CENTER);
		lblVarios.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblVarios.setOpaque(true);
		lblVarios.setBackground(SystemColor.inactiveCaption);
		lblVarios.setBounds(486, 437, 76, 75);
		panelInicio.add(lblVarios);
		
		lblNotadeVenta = new JLabel("No de Venta");
		lblNotadeVenta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn_NotadeVenta();
			}
		});
		lblNotadeVenta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNotadeVenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotadeVenta.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNotadeVenta.setOpaque(true);
		lblNotadeVenta.setBackground(SystemColor.inactiveCaption);
		lblNotadeVenta.setBounds(562, 437, 102, 75);
		panelInicio.add(lblNotadeVenta);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(10, 86, 316, 30);
		panelInicio.add(panel_1);
		
		lblInfo = new JLabel("SELECCIONE PROCED.");
		lblInfo.setHorizontalTextPosition(SwingConstants.LEFT);
		lblInfo.setFont(new Font("Cascadia Code", Font.BOLD, 11));
		lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblInfo.setBackground(SystemColor.inactiveCaption);
		lblInfo.setOpaque(true);
		lblInfo.setBounds(10, 37, 316, 42);
		panelInicio.add(lblInfo);
		
		JPanel pnlDatos = new JPanel();
		pnlDatos.setBackground(new Color(139, 0, 0));
		pnlDatos.setBounds(0, 654, 727, 46);
		panelInicio.add(pnlDatos);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAyuda.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnAyuda.setBounds(336, 538, 83, 94);
		panelInicio.add(btnAyuda);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuscar.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnBuscar.setBounds(429, 538, 83, 94);
		panelInicio.add(btnBuscar);
		
		JButton btnInventario = new JButton("Inventario");
		btnInventario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnInventario.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, SystemColor.activeCaption));
		btnInventario.setBounds(522, 538, 83, 94);
		panelInicio.add(btnInventario);
		
		textField = new JTextField();
		textField.setBounds(110, 492, 161, 30);
		panelInicio.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Saldo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(38, 500, 46, 14);
		panelInicio.add(lblNewLabel);
		
		pnlTeclas = new JPanel();
		pnlTeclas.setVisible(false);
		pnlTeclas.setLayout(null);
		pnlTeclas.setBackground(new Color(139, 0, 0));
		pnlTeclas.setBounds(356, 113, 328, 346);
		panelInicio.add(pnlTeclas);
		
		btn7 = new JButton("7");
		btn7.setBounds(20, 0, 66, 69);
		pnlTeclas.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(86, 0, 66, 69);
		pnlTeclas.add(btn8);
		
		btn9 = new JButton("9");
		btn9.setBounds(151, 0, 66, 69);
		pnlTeclas.add(btn9);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(216, 0, 88, 69);
		pnlTeclas.add(btnCancelar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(216, 68, 88, 69);
		pnlTeclas.add(btnBorrar);
		
		btn6 = new JButton("6");
		btn6.setBounds(151, 68, 66, 69);
		pnlTeclas.add(btn6);
		
		btn4 = new JButton("4");
		btn4.setBounds(20, 68, 66, 69);
		pnlTeclas.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(86, 68, 66, 69);
		pnlTeclas.add(btn5);
		
		btn3 = new JButton("3");
		btn3.setBounds(151, 136, 66, 69);
		pnlTeclas.add(btn3);
		
		btn1 = new JButton("1");
		btn1.setBounds(20, 136, 66, 69);
		pnlTeclas.add(btn1);
		
		btn2 = new JButton("2");
		btn2.setBounds(86, 136, 66, 69);
		pnlTeclas.add(btn2);
		
		btn0 = new JButton("0");
		btn0.setBounds(86, 204, 66, 69);
		pnlTeclas.add(btn0);
		
		btnVacio2 = new JButton("");
		btnVacio2.setBounds(151, 204, 66, 69);
		pnlTeclas.add(btnVacio2);
		
		btnVacio1 = new JButton("");
		btnVacio1.setBounds(20, 204, 66, 69);
		pnlTeclas.add(btnVacio1);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(216, 136, 88, 69);
		pnlTeclas.add(btnAtras);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(216, 204, 88, 142);
		pnlTeclas.add(btnEntrar);
		
		btnAbajoLargo = new JButton("");
		btnAbajoLargo.setBounds(20, 271, 197, 75);
		pnlTeclas.add(btnAbajoLargo);
		
		btnUno.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnUno.getText());}});
		btnDos.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnDos.getText());}});
		btnTres.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnTres.getText());}});
		btnCuatro.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnCuatro.getText());}});
		btnCinco.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnCinco.getText());}});
		btnSeis.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnSeis.getText());}});
		btnSiete.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnSiete.getText());}});
		btnOcho.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnOcho.getText());}});
		btnNueve.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnNueve.getText());}});
		btnDiez.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnDiez.getText());}});
		btnOnce.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnOnce.getText());}});
		btnDoce.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Calcular(btnDoce.getText());}});
		
		btnCancelar.addMouseListener(new MouseAdapter() {@Override public void mouseClicked(MouseEvent e) {btn_Cancelar();} });
		
		pnlOption.agregarListener(new ConfirmacionListener() {
			@Override
            public void siClicado() {
				lblInfo.setText("SELECCIONE PROCED.");
				pnlBotones.setVisible(true);
				pnlTeclas.setVisible(false);
				lblComun.setVisible(true);
				lblEntrada.setVisible(true);
				lblVarios.setVisible(true);
				lblNotadeVenta.setVisible(true);
                btn_Comun();
                
				
            }

            @Override
            public void noClicado() {
            	return;
            }
		});
	}

	protected void btn_Cancelar() {
		pnlOption.setVisible(true);
	}

	protected void btn_Calcular(String name) {
		if(name=="Cantidad") {
			lblInfo.setText("ENTRE CANTIDAD");
			pnlBotones.setVisible(false);
			pnlTeclas.setVisible(true);
			lblComun.setVisible(false);
			lblEntrada.setVisible(false);
			lblVarios.setVisible(false);
			lblNotadeVenta.setVisible(false);
		}
		if(name=="Peso") {
			lblInfo.setText("ENTRE PESO O PULSE INTRO PARA PESO EN BALANZA");
			pnlBotones.setVisible(false);
			pnlTeclas.setVisible(true);
			lblComun.setVisible(false);
			lblEntrada.setVisible(false);
			lblVarios.setVisible(false);
			lblNotadeVenta.setVisible(false);
		}
		if(name=="Verificacion de precio") {
			lblInfo.setText("ENTRE ARTICULO PARA VERIFICACION DE PRECIO");
			pnlBotones.setVisible(false);
			pnlTeclas.setVisible(true);
			lblComun.setVisible(false);
			lblEntrada.setVisible(false);
			lblVarios.setVisible(false);
			lblNotadeVenta.setVisible(false);
		}
		if(name=="Bandeja de entrada") {
			
		}
		
	}

	protected void btn_NotadeVenta() {
		lblTitulo.setText("Nota de Venta");
		lblComun.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblComun.setBackground(SystemColor.inactiveCaption);
		lblEntrada.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEntrada.setBackground(SystemColor.inactiveCaption);
		lblVarios.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblVarios.setBackground(SystemColor.inactiveCaption);
		lblNotadeVenta.setBorder(null);
		lblNotadeVenta.setBackground(SystemColor.inactiveCaptionBorder);
		
		btnUno.setVisible(true);
		btnDos.setVisible(true);
		btnTres.setVisible(true);
		btnCuatro.setVisible(true);
		btnCinco.setVisible(true);
		btnSeis.setVisible(false);
		btnSiete.setVisible(true);
		btnOcho.setVisible(false);
		btnNueve.setVisible(true);
		btnDiez.setVisible(false);
		btnOnce.setVisible(false);
		btnDoce.setVisible(true);
	}

	protected void btn_Varios() {
		lblTitulo.setText("Varios");
		lblComun.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblComun.setBackground(SystemColor.inactiveCaption);
		lblEntrada.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEntrada.setBackground(SystemColor.inactiveCaption);
		lblVarios.setBorder(null);
		lblVarios.setBackground(SystemColor.inactiveCaptionBorder);
		lblNotadeVenta.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNotadeVenta.setBackground(SystemColor.inactiveCaption);
		
		btnUno.setVisible(true);
		btnDos.setVisible(false);
		btnTres.setVisible(true);
		btnCuatro.setVisible(false);
		btnCinco.setVisible(false);
		btnSeis.setVisible(false);
		btnSiete.setVisible(false);
		btnOcho.setVisible(false);
		btnNueve.setVisible(false);
		btnDiez.setVisible(false);
		btnOnce.setVisible(false);
		btnDoce.setVisible(false);
	}

	protected void btn_Entrada() {
		lblTitulo.setText("Entrada");
		lblComun.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblComun.setBackground(SystemColor.inactiveCaption);
		lblEntrada.setBorder(null);
		lblEntrada.setBackground(SystemColor.inactiveCaptionBorder);
		lblVarios.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblVarios.setBackground(SystemColor.inactiveCaption);
		lblNotadeVenta.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNotadeVenta.setBackground(SystemColor.inactiveCaption);
		
		btnUno.setVisible(true);
		btnDos.setVisible(true);
		btnTres.setVisible(true);
		btnCuatro.setVisible(true);
		btnCinco.setVisible(true);
		btnSeis.setVisible(false);
		btnSiete.setVisible(true);
		btnOcho.setVisible(false);
		btnNueve.setVisible(false);
		btnDiez.setVisible(false);
		btnOnce.setVisible(false);
		btnDoce.setVisible(false);
		
	}

	protected void btn_Comun() {
		lblTitulo.setText("Común");
		lblComun.setBorder(null);
		lblComun.setBackground(SystemColor.inactiveCaptionBorder);
		lblEntrada.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblEntrada.setBackground(SystemColor.inactiveCaption);
		lblVarios.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblVarios.setBackground(SystemColor.inactiveCaption);
		lblNotadeVenta.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNotadeVenta.setBackground(SystemColor.inactiveCaption);
		
		btnUno.setVisible(true);
		btnDos.setVisible(false);
		btnTres.setVisible(false);
		btnCuatro.setVisible(false);
		btnCinco.setVisible(true);
		btnSeis.setVisible(true);
		btnSiete.setVisible(true);
		btnOcho.setVisible(false);
		btnNueve.setVisible(true);
		btnDiez.setVisible(false);
		btnOnce.setVisible(false);
		btnDoce.setVisible(false);
		
		
	}

}
