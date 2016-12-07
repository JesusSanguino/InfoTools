package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dominio.Gestor_BD;
import Dominio.Propietario;
import Dominio.Radar_foto;
import Persistencia.AgenteBBDD;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfazDGT extends JFrame {

	private JPanel contentPane;
	private JList<Integer> listMatriculas;
	Gestor_BD gestor =new Gestor_BD();
	AgenteBBDD agente= new AgenteBBDD();
	private JTextArea textPro;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Radar_foto radar=new Radar_foto();
		//radar.crear_Expediente(agente);
		
		
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
		setBounds(100, 100, 577, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblRadar = new JLabel("RADAR");
		panel_1.add(lblRadar);
		
		JButton btnOn = new JButton("ON");
		panel_1.add(btnOn);
		
		JButton btnOff = new JButton("OFF");
		panel_1.add(btnOff);
		
		JTabbedPane menu = new JTabbedPane(JTabbedPane.TOP);
		menu.setToolTipText("");
		contentPane.add(menu, BorderLayout.CENTER);
		
		JPanel Expedientes = new JPanel();
		menu.addTab("Expedientes", null, Expedientes, null);
		GridBagLayout gbl_Expedientes = new GridBagLayout();
		gbl_Expedientes.columnWidths = new int[]{92, 0, 0, 61, 110, 137, 0};
		gbl_Expedientes.rowHeights = new int[]{19, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_Expedientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Expedientes.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Expedientes.setLayout(gbl_Expedientes);
		
		JLabel lblListasDeExpediente = new JLabel("Lista de Expediente");
		GridBagConstraints gbc_lblListasDeExpediente = new GridBagConstraints();
		gbc_lblListasDeExpediente.gridwidth = 2;
		gbc_lblListasDeExpediente.insets = new Insets(0, 0, 5, 5);
		gbc_lblListasDeExpediente.gridx = 0;
		gbc_lblListasDeExpediente.gridy = 0;
		Expedientes.add(lblListasDeExpediente, gbc_lblListasDeExpediente);
		
		JLabel lblExpecipicaciones = new JLabel("Expecipicaciones:");
		GridBagConstraints gbc_lblExpecipicaciones = new GridBagConstraints();
		gbc_lblExpecipicaciones.gridwidth = 2;
		gbc_lblExpecipicaciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblExpecipicaciones.gridx = 4;
		gbc_lblExpecipicaciones.gridy = 0;
		Expedientes.add(lblExpecipicaciones, gbc_lblExpecipicaciones);
		
		JList listExpediente = new JList();
		listExpediente.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listExpediente = new GridBagConstraints();
		gbc_listExpediente.gridwidth = 3;
		gbc_listExpediente.gridheight = 5;
		gbc_listExpediente.insets = new Insets(0, 0, 5, 5);
		gbc_listExpediente.fill = GridBagConstraints.BOTH;
		gbc_listExpediente.gridx = 0;
		gbc_listExpediente.gridy = 1;
		Expedientes.add(listExpediente, gbc_listExpediente);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridwidth = 2;
		gbc_textArea.gridheight = 5;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 4;
		gbc_textArea.gridy = 1;
		Expedientes.add(textArea, gbc_textArea);
		
		JButton btnDetalles = new JButton("Ver Detalles");
		GridBagConstraints gbc_btnDetalles = new GridBagConstraints();
		gbc_btnDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_btnDetalles.gridx = 1;
		gbc_btnDetalles.gridy = 7;
		Expedientes.add(btnDetalles, gbc_btnDetalles);
		
		JPanel BPropietario = new JPanel();
		menu.addTab("Buscar Propietario", null, BPropietario, null);
		GridBagLayout gbl_BPropietario = new GridBagLayout();
		gbl_BPropietario.columnWidths = new int[]{116, 116, 46, 64, 183, 0, 0};
		gbl_BPropietario.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_BPropietario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_BPropietario.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		BPropietario.setLayout(gbl_BPropietario);
		
		JLabel lblListaDeMatriculas = new JLabel("Lista de matriculas");
		GridBagConstraints gbc_lblListaDeMatriculas = new GridBagConstraints();
		gbc_lblListaDeMatriculas.gridwidth = 2;
		gbc_lblListaDeMatriculas.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaDeMatriculas.gridx = 0;
		gbc_lblListaDeMatriculas.gridy = 0;
		BPropietario.add(lblListaDeMatriculas, gbc_lblListaDeMatriculas);
		
		JLabel lblExpecificacionesPropietario = new JLabel("Expecificaciones Propietario");
		GridBagConstraints gbc_lblExpecificacionesPropietario = new GridBagConstraints();
		gbc_lblExpecificacionesPropietario.gridwidth = 2;
		gbc_lblExpecificacionesPropietario.insets = new Insets(0, 0, 5, 5);
		gbc_lblExpecificacionesPropietario.gridx = 3;
		gbc_lblExpecificacionesPropietario.gridy = 0;
		BPropietario.add(lblExpecificacionesPropietario, gbc_lblExpecificacionesPropietario);
		
		listMatriculas = new JList();
		
		listMatriculas.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listMatriculas.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listMatriculas = new GridBagConstraints();
		gbc_listMatriculas.gridheight = 3;
		gbc_listMatriculas.gridwidth = 2;
		gbc_listMatriculas.insets = new Insets(0, 0, 5, 5);
		gbc_listMatriculas.fill = GridBagConstraints.BOTH;
		gbc_listMatriculas.gridx = 0;
		gbc_listMatriculas.gridy = 1;
		BPropietario.add(listMatriculas, gbc_listMatriculas);
		
		textPro = new JTextArea();
		textPro.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_textPro = new GridBagConstraints();
		gbc_textPro.gridwidth = 2;
		gbc_textPro.gridheight = 3;
		gbc_textPro.insets = new Insets(0, 0, 5, 5);
		gbc_textPro.fill = GridBagConstraints.BOTH;
		gbc_textPro.gridx = 3;
		gbc_textPro.gridy = 1;
		BPropietario.add(textPro, gbc_textPro);
		
		JButton btnDetallesP = new JButton("Ver Detalles");
		
		GridBagConstraints gbc_btnDetallesP = new GridBagConstraints();
		gbc_btnDetallesP.insets = new Insets(0, 0, 5, 5);
		gbc_btnDetallesP.gridx = 1;
		gbc_btnDetallesP.gridy = 5;
		BPropietario.add(btnDetallesP, gbc_btnDetallesP);
		
		//Empiezo sentencias
		//inicializaciones
		System.out.println((int) (Math.random()*120+(120)));
		agente.conexion();
		ArrayList<Integer> v=new ArrayList<Integer>();
		v= gestor.devolver_matricula(agente);
		DefaultListModel<Integer> modelo = new DefaultListModel<Integer>();
		
		//pasar matriculas a la lista matriculas
		for(int i=0;i<v.size();i++){
			
			modelo.addElement(v.get(i));
			
		}
		listMatriculas.setModel(modelo);
		btnDetallesP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Propietario p;
				System.out.println(listMatriculas.getSelectedValue());
				p=gestor.devolver_propietario(agente,listMatriculas.getSelectedValue());
				
				textPro.setText("DNI= "+p.getDNI()+"\n\nNombre= "+p.getNombre()+"\n\nApellidos= "+p.getApellidos());
			}
		});
		
	}

}
