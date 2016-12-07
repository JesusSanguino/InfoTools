package Presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Dominio.Gestor_BD;
import Dominio.Propietario;
import Dominio.Radar_foto;
import Dominio.Sancion;
import Persistencia.AgenteBBDD;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
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
	private JList<Integer> listsancion;
	private JTextArea textAsancion;
	private JLabel lblComprobarPagoDe;
	private JButton btnComprobar;
	

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
		Radar_foto f=new Radar_foto(); 
		agente.conexion();
		
		f.crear_Expediente(agente);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel Radar = new JPanel();
		contentPane.add(Radar, BorderLayout.NORTH);
		
		JLabel lblRadar = new JLabel("RADAR");
		Radar.add(lblRadar);
		
		JButton btnOn = new JButton("ON");
		Radar.add(btnOn);
		
		JButton btnOff = new JButton("OFF");
		Radar.add(btnOff);
		
		JTabbedPane Menu = new JTabbedPane(JTabbedPane.TOP);
		Menu.setToolTipText("");
		contentPane.add(Menu, BorderLayout.CENTER);
		
		JPanel Expedientes = new JPanel();
		Menu.addTab("Expedientes", null, Expedientes, null);
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
		
		JLabel lblEspecificaciones = new JLabel("Especificaciones:");
		GridBagConstraints gbc_lblEspecificaciones = new GridBagConstraints();
		gbc_lblEspecificaciones.gridwidth = 2;
		gbc_lblEspecificaciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecificaciones.gridx = 4;
		gbc_lblEspecificaciones.gridy = 0;
		Expedientes.add(lblEspecificaciones, gbc_lblEspecificaciones);
		
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
		Menu.addTab("Buscar Propietario", null, BPropietario, null);
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
		
		JLabel lblEspecificacionesPropietario = new JLabel("Especificaciones Propietario");
		GridBagConstraints gbc_lblEspecificacionesPropietario = new GridBagConstraints();
		gbc_lblEspecificacionesPropietario.gridwidth = 2;
		gbc_lblEspecificacionesPropietario.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecificacionesPropietario.gridx = 3;
		gbc_lblEspecificacionesPropietario.gridy = 0;
		BPropietario.add(lblEspecificacionesPropietario, gbc_lblEspecificacionesPropietario);
		
		listMatriculas = new JList<Integer>();
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
		
		
		//inicializaciones
		
		ArrayList<Integer> v=new ArrayList<Integer>();
		v= gestor.devolver_matricula(agente);
		DefaultListModel<Integer> modelo = new DefaultListModel<Integer>();
		
		//pasar matriculas a la lista matriculas
		for(int i=0;i<v.size();i++){
			
			modelo.addElement(v.get(i));
			
		}
		
		listMatriculas.setModel(modelo);
		
		
		JPanel Lsanciones = new JPanel();
		Menu.addTab("Sanciones", null, Lsanciones, null);
		GridBagLayout gbl_Lsanciones = new GridBagLayout();
		gbl_Lsanciones.columnWidths = new int[]{116, 101, 0, 0, 0, 0};
		gbl_Lsanciones.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_Lsanciones.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_Lsanciones.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Lsanciones.setLayout(gbl_Lsanciones);
		
		JLabel lblSanciones = new JLabel("ListaSanciones");
		GridBagConstraints gbc_lblSanciones = new GridBagConstraints();
		gbc_lblSanciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblSanciones.gridwidth = 2;
		gbc_lblSanciones.gridx = 0;
		gbc_lblSanciones.gridy = 0;
		Lsanciones.add(lblSanciones, gbc_lblSanciones);
		
		JLabel lblDetalles = new JLabel("Detalles");
		GridBagConstraints gbc_lblDetalles = new GridBagConstraints();
		gbc_lblDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_lblDetalles.gridx = 3;
		gbc_lblDetalles.gridy = 0;
		Lsanciones.add(lblDetalles, gbc_lblDetalles);
		
		listsancion = new JList<Integer>();
		listsancion.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listsancion = new GridBagConstraints();
		gbc_listsancion.gridwidth = 2;
		gbc_listsancion.insets = new Insets(0, 0, 5, 5);
		gbc_listsancion.fill = GridBagConstraints.BOTH;
		gbc_listsancion.gridx = 0;
		gbc_listsancion.gridy = 1;
		Lsanciones.add(listsancion, gbc_listsancion);
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		s= gestor.devolver_sanciones(agente);
		DefaultListModel<Integer> modelo2 = new DefaultListModel<Integer>();
		
		//pasar matriculas a la lista matriculas
		for(int i=0;i<s.size();i++){
			
			modelo2.addElement(s.get(i));
			
		}
		
		listsancion.setModel(modelo2);
		
		textAsancion = new JTextArea();
		textAsancion.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_textAsancion = new GridBagConstraints();
		gbc_textAsancion.insets = new Insets(0, 0, 5, 5);
		gbc_textAsancion.fill = GridBagConstraints.BOTH;
		gbc_textAsancion.gridx = 3;
		gbc_textAsancion.gridy = 1;
		Lsanciones.add(textAsancion, gbc_textAsancion);
		
		lblComprobarPagoDe = new JLabel("Comprobar pago de Sancion:");
		lblComprobarPagoDe.setVisible(false);
		GridBagConstraints gbc_lblComprobarPagoDe = new GridBagConstraints();
		gbc_lblComprobarPagoDe.insets = new Insets(0, 0, 5, 5);
		gbc_lblComprobarPagoDe.gridx = 3;
		gbc_lblComprobarPagoDe.gridy = 2;
		Lsanciones.add(lblComprobarPagoDe, gbc_lblComprobarPagoDe);
		
		JButton btnDetallesS = new JButton("Ver Detalles");
		GridBagConstraints gbc_btnDetallesS = new GridBagConstraints();
		gbc_btnDetallesS.insets = new Insets(0, 0, 5, 5);
		gbc_btnDetallesS.gridx = 1;
		gbc_btnDetallesS.gridy = 3;
		Lsanciones.add(btnDetallesS, gbc_btnDetallesS);
		
		btnComprobar = new JButton("Comprobar");
		
		btnComprobar.setVisible(false);
		btnComprobar.setEnabled(false);
		GridBagConstraints gbc_btnComprobar = new GridBagConstraints();
		gbc_btnComprobar.insets = new Insets(0, 0, 5, 5);
		gbc_btnComprobar.gridx = 3;
		gbc_btnComprobar.gridy = 3;
		Lsanciones.add(btnComprobar, gbc_btnComprobar);
		
		
		//Insertamos en la BBDD los datos que nos llegan de radar
		
		btnDetallesP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				try{
					Propietario p;
					
					p=gestor.devolver_propietario(agente,listMatriculas.getSelectedValue());
					
					textPro.setText("DNI= "+p.getDNI()+"\n\nNombre= "+p.getNombre()+"\n\nApellidos= "+p.getApellidos()+"\n\nPuntos= "+p.getPuntos());
					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Debe seleccionar una matricula ", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
				
			}
				
		});
		
		//boton detalles sancion
		btnDetallesS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Sancion s;
					
					s=gestor.devolverSancion(agente,listsancion.getSelectedValue());
					
					textAsancion.setText("Id de la sancion= "+s.getId_sancion()+"\n\nMatricula= "+s.getMatricula()+"\n\nPuntos de la Sanción= "+s.getPuntos()+"\n\nPrecio de la sancion= "+s.getPrecio_sancion());
					lblComprobarPagoDe.setVisible(true);
					btnComprobar.setVisible(true);
					btnComprobar.setEnabled(true);
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Debe seleccionar una Sacion ", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
			}
		});
		
		//Boton comprobar sancion
		
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (gestor.Verificar_psancion(agente,listsancion.getSelectedValue())){
					JOptionPane.showMessageDialog(contentPane, "Sanción pagada", "Información de pago",JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(contentPane, "Sanción no pagada", "Información de pago",JOptionPane.INFORMATION_MESSAGE);
				}
				btnComprobar.setEnabled(false);
			}
		});
		
		
		
	}

}
