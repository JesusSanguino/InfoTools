package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dominio.Radar_foto;
import Persistencia.AgenteBBDD;

public class InterfazDGT extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		AgenteBBDD agente=new AgenteBBDD();
		//agente.getPropietario();
		Radar_foto radar=new Radar_foto();
		radar.crear_Expediente(agente);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazDGT frame = new InterfazDGT();
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
	public InterfazDGT() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
