package ui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class frmOptionYesNo extends JFrame {

	private JPanel contentPane;
	JButton btnSi, btnNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmOptionYesNo frame = new frmOptionYesNo();
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
	public frmOptionYesNo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 193);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 193);
		panel.setLayout(null);
		getContentPane().add(panel);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setBackground(new Color(128, 0, 0));
		lblNewLabel_2_1.setBounds(10, 0, 34, 26);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel = new JLabel("¿Está seguro que desea CANCELAR esta operación?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(70, 47, 346, 34);
		panel.add(lblNewLabel);
		
		btnSi = new JButton("Sí");
		btnSi.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSi.setBounds(70, 92, 89, 66);
		panel.add(btnSi);
		
		btnNo = new JButton("No");
		btnNo.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNo.setBounds(285, 92, 89, 66);
		panel.add(btnNo);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(SystemColor.activeCaption);
		lblNewLabel_1.setBounds(0, 0, 450, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(95, 158, 160));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(22, 41, 34, 44);
		panel.add(lblNewLabel_2);
		
		
	}
	
	public interface ConfirmacionListener {
	    void siClicado();
	    void noClicado();
	}
	
	public void agregarListener(ConfirmacionListener listener) {
		btnSi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listener.siClicado();
	            dispose();
			}
		});

		btnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				listener.noClicado();
	            dispose();
			}
		});
    }

	
}
