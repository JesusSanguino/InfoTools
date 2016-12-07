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
import javax.swing.JTextField;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private JTextField textnumero;
	private JTextField textNombre;
	private JTextField textApellidos;
	private JTextField textPuntos;
	private JList<Integer> listM;
	private JList<String> listP;
	private JComboBox cmbDNI;
	private JTextField txtMatricula;
	DefaultListModel<String> modelo3 = new DefaultListModel<String>();
	DefaultListModel<Integer> modelo2 = new DefaultListModel<Integer>();
	DefaultListModel<Integer> modelo = new DefaultListModel<Integer>();
	private JTextField textletra;
	private JButton btnBorrar;
	private JButton btnBorrar_1;
	

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
		
		//f.crear_Expediente(agente);
		

		
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
		contentPane.add(Menu, BorderLayout.WEST);
		
		JPanel Lmatriculas = new JPanel();
		Menu.addTab("Vehiculos", null, Lmatriculas, null);
		GridBagLayout gbl_Lmatriculas = new GridBagLayout();
		gbl_Lmatriculas.columnWidths = new int[]{20, 222, 25, 0, 0, 0, 20, 0};
		gbl_Lmatriculas.rowHeights = new int[]{20, 23, 29, 35, 0, 20, 20, 0, 0, 0, 25, 0, 0};
		gbl_Lmatriculas.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_Lmatriculas.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		Lmatriculas.setLayout(gbl_Lmatriculas);
		
		JLabel lblListaMatriculas = new JLabel("Lista Matriculas");
		GridBagConstraints gbc_lblListaMatriculas = new GridBagConstraints();
		gbc_lblListaMatriculas.anchor = GridBagConstraints.WEST;
		gbc_lblListaMatriculas.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaMatriculas.gridx = 1;
		gbc_lblListaMatriculas.gridy = 1;
		Lmatriculas.add(lblListaMatriculas, gbc_lblListaMatriculas);
		
		listM = new JList();
	
		listM.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listM = new GridBagConstraints();
		gbc_listM.gridheight = 8;
		gbc_listM.insets = new Insets(0, 0, 5, 5);
		gbc_listM.fill = GridBagConstraints.BOTH;
		gbc_listM.gridx = 1;
		gbc_listM.gridy = 2;
		Lmatriculas.add(listM, gbc_listM);
		
		JLabel lblMatricula = new JLabel("Matricula: ");
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.anchor = GridBagConstraints.WEST;
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.gridx = 3;
		gbc_lblMatricula.gridy = 2;
		Lmatriculas.add(lblMatricula, gbc_lblMatricula);
	
		GridBagConstraints gbc_textletra = new GridBagConstraints();
		gbc_textletra.insets = new Insets(0, 0, 5, 5);
		gbc_textletra.fill = GridBagConstraints.HORIZONTAL;
		gbc_textletra.gridx = 6;
		gbc_textletra.gridy = 2;
		
		txtMatricula = new JTextField();
		GridBagConstraints gbc_txtMatricula = new GridBagConstraints();
		gbc_txtMatricula.gridwidth = 2;
		gbc_txtMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_txtMatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMatricula.gridx = 4;
		gbc_txtMatricula.gridy = 2;
		Lmatriculas.add(txtMatricula, gbc_txtMatricula);
		txtMatricula.setColumns(10);
		
		JLabel lblDniPropietario = new JLabel("DNI Propietario");
		GridBagConstraints gbc_lblDniPropietario = new GridBagConstraints();
		gbc_lblDniPropietario.anchor = GridBagConstraints.EAST;
		gbc_lblDniPropietario.insets = new Insets(0, 0, 5, 5);
		gbc_lblDniPropietario.gridx = 3;
		gbc_lblDniPropietario.gridy = 4;
		Lmatriculas.add(lblDniPropietario, gbc_lblDniPropietario);
		
		cmbDNI = new JComboBox();
		GridBagConstraints gbc_cmbDNI = new GridBagConstraints();
		gbc_cmbDNI.gridwidth = 2;
		gbc_cmbDNI.insets = new Insets(0, 0, 5, 5);
		gbc_cmbDNI.fill = GridBagConstraints.HORIZONTAL;
		gbc_cmbDNI.gridx = 4;
		gbc_cmbDNI.gridy = 4;
		Lmatriculas.add(cmbDNI, gbc_cmbDNI);
		
		btnBorrar = new JButton("Borrar");
		
			GridBagConstraints gbc_btnBorrar = new GridBagConstraints();
			gbc_btnBorrar.insets = new Insets(0, 0, 5, 5);
			gbc_btnBorrar.gridx = 3;
			gbc_btnBorrar.gridy = 7;
			Lmatriculas.add(btnBorrar, gbc_btnBorrar);
			
			
			
		
		
		JButton btnModificarV = new JButton("Modificar");
		
		GridBagConstraints gbc_btnModificarV = new GridBagConstraints();
		gbc_btnModificarV.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarV.gridx = 4;
		gbc_btnModificarV.gridy = 7;
		Lmatriculas.add(btnModificarV, gbc_btnModificarV);
		
		JButton btnGuardar = new JButton("Guardar");
	
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 5;
		gbc_btnGuardar.gridy = 7;
		Lmatriculas.add(btnGuardar, gbc_btnGuardar);
		
		JPanel Lpropietario = new JPanel();
		Menu.addTab("Propietarios", null, Lpropietario, null);
		GridBagLayout gbl_Lpropietario = new GridBagLayout();
		gbl_Lpropietario.columnWidths = new int[]{20, 222, 25, 0, 111, 5, 32, 0, 0};
		gbl_Lpropietario.rowHeights = new int[]{20, 0, 0, 20, 0, 20, 0, 20, 0, 20, 0, 0, 25, 0, 0};
		gbl_Lpropietario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Lpropietario.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		Lpropietario.setLayout(gbl_Lpropietario);
		
		JLabel lblListaPropietarios = new JLabel("Lista Propietarios");
		GridBagConstraints gbc_lblListaPropietarios = new GridBagConstraints();
		gbc_lblListaPropietarios.anchor = GridBagConstraints.WEST;
		gbc_lblListaPropietarios.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaPropietarios.gridx = 1;
		gbc_lblListaPropietarios.gridy = 1;
		Lpropietario.add(lblListaPropietarios, gbc_lblListaPropietarios);
		
		listP = new JList();
		listP.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listP = new GridBagConstraints();
		gbc_listP.gridheight = 10;
		gbc_listP.insets = new Insets(0, 0, 5, 5);
		gbc_listP.fill = GridBagConstraints.BOTH;
		gbc_listP.gridx = 1;
		gbc_listP.gridy = 2;
		Lpropietario.add(listP, gbc_listP);
		
		JLabel lblDni = new JLabel("DNI: ");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.WEST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 3;
		gbc_lblDni.gridy = 2;
		Lpropietario.add(lblDni, gbc_lblDni);
		
		textnumero = new JTextField();
		GridBagConstraints gbc_textnumero = new GridBagConstraints();
		gbc_textnumero.insets = new Insets(0, 0, 5, 5);
		gbc_textnumero.fill = GridBagConstraints.HORIZONTAL;
		gbc_textnumero.gridx = 4;
		gbc_textnumero.gridy = 2;
		Lpropietario.add(textnumero, gbc_textnumero);
		textnumero.setColumns(10);
		
		textletra = new JTextField();
		
		gbc_textletra.anchor = GridBagConstraints.EAST;
		gbc_textletra.insets = new Insets(0, 0, 5, 5);
		gbc_textletra.gridx = 6;
		gbc_textletra.gridy = 2;
		Lpropietario.add(textletra, gbc_textletra);
		textletra.setColumns(3);
		
		JLabel lblNombre = new JLabel("Nombre: ");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 4;
		Lpropietario.add(lblNombre, gbc_lblNombre);
		
		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 3;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 4;
		gbc_textNombre.gridy = 4;
		Lpropietario.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellidos: ");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.WEST;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 3;
		gbc_lblApellido.gridy = 6;
		Lpropietario.add(lblApellido, gbc_lblApellido);
		
		textApellidos = new JTextField();
		GridBagConstraints gbc_textApellidos = new GridBagConstraints();
		gbc_textApellidos.gridwidth = 3;
		gbc_textApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_textApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textApellidos.gridx = 4;
		gbc_textApellidos.gridy = 6;
		Lpropietario.add(textApellidos, gbc_textApellidos);
		textApellidos.setColumns(10);
		
		JLabel lblPuntos = new JLabel("Puntos: ");
		GridBagConstraints gbc_lblPuntos = new GridBagConstraints();
		gbc_lblPuntos.anchor = GridBagConstraints.WEST;
		gbc_lblPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_lblPuntos.gridx = 3;
		gbc_lblPuntos.gridy = 8;
		Lpropietario.add(lblPuntos, gbc_lblPuntos);
		
		textPuntos = new JTextField();
		GridBagConstraints gbc_textPuntos = new GridBagConstraints();
		gbc_textPuntos.gridwidth = 3;
		gbc_textPuntos.insets = new Insets(0, 0, 5, 5);
		gbc_textPuntos.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPuntos.gridx = 4;
		gbc_textPuntos.gridy = 8;
		Lpropietario.add(textPuntos, gbc_textPuntos);
		textPuntos.setColumns(10);
		
		JPanel Expedientes = new JPanel();
		Menu.addTab("Expedientes", null, Expedientes, null);
		GridBagLayout gbl_Expedientes = new GridBagLayout();
		gbl_Expedientes.columnWidths = new int[]{20, 0, 221, 40, 218, 20, 0};
		gbl_Expedientes.rowHeights = new int[]{19, 0, 0, 0, 0, 0, 20, 0, 20, 0};
		gbl_Expedientes.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Expedientes.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Expedientes.setLayout(gbl_Expedientes);
		
		JLabel lblListasDeExpediente = new JLabel("Lista de Expediente");
		GridBagConstraints gbc_lblListasDeExpediente = new GridBagConstraints();
		gbc_lblListasDeExpediente.anchor = GridBagConstraints.WEST;
		gbc_lblListasDeExpediente.gridwidth = 2;
		gbc_lblListasDeExpediente.insets = new Insets(0, 0, 5, 5);
		gbc_lblListasDeExpediente.gridx = 1;
		gbc_lblListasDeExpediente.gridy = 0;
		Expedientes.add(lblListasDeExpediente, gbc_lblListasDeExpediente);
		
		JLabel lblEspecificaciones = new JLabel("Especificaciones:");
		GridBagConstraints gbc_lblEspecificaciones = new GridBagConstraints();
		gbc_lblEspecificaciones.anchor = GridBagConstraints.WEST;
		gbc_lblEspecificaciones.insets = new Insets(0, 0, 5, 0);
		gbc_lblEspecificaciones.gridx = 4;
		gbc_lblEspecificaciones.gridy = 0;
		Expedientes.add(lblEspecificaciones, gbc_lblEspecificaciones);
		
		JList listExpediente = new JList();
		listExpediente.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listExpediente = new GridBagConstraints();
		gbc_listExpediente.gridwidth = 2;
		gbc_listExpediente.gridheight = 5;
		gbc_listExpediente.insets = new Insets(0, 0, 5, 5);
		gbc_listExpediente.fill = GridBagConstraints.BOTH;
		gbc_listExpediente.gridx = 1;
		gbc_listExpediente.gridy = 1;
		Expedientes.add(listExpediente, gbc_listExpediente);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 5;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 4;
		gbc_textArea.gridy = 1;
		Expedientes.add(textArea, gbc_textArea);
		
		JButton btnDetalles = new JButton("Ver Detalles");
		GridBagConstraints gbc_btnDetalles = new GridBagConstraints();
		gbc_btnDetalles.gridwidth = 2;
		gbc_btnDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_btnDetalles.gridx = 1;
		gbc_btnDetalles.gridy = 7;
		Expedientes.add(btnDetalles, gbc_btnDetalles);
		
		JPanel BPropietario = new JPanel();
		Menu.addTab("Buscar Propietario", null, BPropietario, null);
		GridBagLayout gbl_BPropietario = new GridBagLayout();
		gbl_BPropietario.columnWidths = new int[]{20, 221, 40, 64, 154, 20, 0};
		gbl_BPropietario.rowHeights = new int[]{0, 0, 0, 0, 20, 0, 20, 0};
		gbl_BPropietario.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_BPropietario.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		BPropietario.setLayout(gbl_BPropietario);
		
		JLabel lblListaDeMatriculas = new JLabel("Lista de matriculas");
		GridBagConstraints gbc_lblListaDeMatriculas = new GridBagConstraints();
		gbc_lblListaDeMatriculas.anchor = GridBagConstraints.WEST;
		gbc_lblListaDeMatriculas.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaDeMatriculas.gridx = 1;
		gbc_lblListaDeMatriculas.gridy = 0;
		BPropietario.add(lblListaDeMatriculas, gbc_lblListaDeMatriculas);
		
		JLabel lblEspecificacionesPropietario = new JLabel("Especificaciones Propietario");
		GridBagConstraints gbc_lblEspecificacionesPropietario = new GridBagConstraints();
		gbc_lblEspecificacionesPropietario.anchor = GridBagConstraints.WEST;
		gbc_lblEspecificacionesPropietario.gridwidth = 2;
		gbc_lblEspecificacionesPropietario.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecificacionesPropietario.gridx = 3;
		gbc_lblEspecificacionesPropietario.gridy = 0;
		BPropietario.add(lblEspecificacionesPropietario, gbc_lblEspecificacionesPropietario);
		
		listMatriculas = new JList<Integer>();
		listMatriculas.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listMatriculas = new GridBagConstraints();
		gbc_listMatriculas.gridheight = 3;
		gbc_listMatriculas.insets = new Insets(0, 0, 5, 5);
		gbc_listMatriculas.fill = GridBagConstraints.BOTH;
		gbc_listMatriculas.gridx = 1;
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
		
		
		JPanel Lsanciones = new JPanel();
		Menu.addTab("Sanciones", null, Lsanciones, null);
		GridBagLayout gbl_Lsanciones = new GridBagLayout();
		gbl_Lsanciones.columnWidths = new int[]{20, 221, 40, 218, 20, 0};
		gbl_Lsanciones.rowHeights = new int[]{0, 0, 20, 0, 20, 0};
		gbl_Lsanciones.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_Lsanciones.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		Lsanciones.setLayout(gbl_Lsanciones);
		
		JLabel lblSanciones = new JLabel("Lista Sanciones");
		GridBagConstraints gbc_lblSanciones = new GridBagConstraints();
		gbc_lblSanciones.anchor = GridBagConstraints.WEST;
		gbc_lblSanciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblSanciones.gridx = 1;
		gbc_lblSanciones.gridy = 0;
		Lsanciones.add(lblSanciones, gbc_lblSanciones);
		
		JLabel lblDetalles = new JLabel("Detalles");
		GridBagConstraints gbc_lblDetalles = new GridBagConstraints();
		gbc_lblDetalles.anchor = GridBagConstraints.WEST;
		gbc_lblDetalles.insets = new Insets(0, 0, 5, 5);
		gbc_lblDetalles.gridx = 3;
		gbc_lblDetalles.gridy = 0;
		Lsanciones.add(lblDetalles, gbc_lblDetalles);
		
		listsancion = new JList<Integer>();
		listsancion.setBorder(new LineBorder(new Color(0, 0, 0)));
		GridBagConstraints gbc_listsancion = new GridBagConstraints();
		gbc_listsancion.insets = new Insets(0, 0, 5, 5);
		gbc_listsancion.fill = GridBagConstraints.BOTH;
		gbc_listsancion.gridx = 1;
		gbc_listsancion.gridy = 1;
		Lsanciones.add(listsancion, gbc_listsancion);
		
		
		
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
		
		//Inicializaciones
		ArrayList<Integer> v=new ArrayList<Integer>();
		v= gestor.devolver_matricula(agente);
		
		
		
		
		for(int i=0;i<v.size();i++){
			
			modelo.addElement(v.get(i));
			
		}
		
		listMatriculas.setModel(modelo);
		listM.setModel(modelo);
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		s= gestor.devolver_sanciones(agente);
		
		
		//pasar matriculas a la lista matriculas
		for(int i=0;i<s.size();i++){
			
			modelo2.addElement(s.get(i));
			
		}
	
		listsancion.setModel(modelo2);
		
		ArrayList<String> dnis=new ArrayList<String>();
		dnis =gestor.devolver_DNIs(agente);
		
		for(int i=0;i<dnis.size();i++){
			
			modelo3.addElement(dnis.get(i));
			cmbDNI.addItem(dnis.get(i));
			
		}
		listP.setModel(modelo3);
		
		btnBorrar_1 = new JButton("Borrar");
		
		GridBagConstraints gbc_btnBorrar_1 = new GridBagConstraints();
		gbc_btnBorrar_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrar_1.gridx = 3;
		gbc_btnBorrar_1.gridy = 10;
		Lpropietario.add(btnBorrar_1, gbc_btnBorrar_1);
		
		
		JButton btnModificarP = new JButton("Modificar");
		
		GridBagConstraints gbc_btnModificarP = new GridBagConstraints();
		gbc_btnModificarP.insets = new Insets(0, 0, 5, 5);
		gbc_btnModificarP.gridx = 4;
		gbc_btnModificarP.gridy = 10;
		Lpropietario.add(btnModificarP, gbc_btnModificarP);
		
		JButton btnGuardarP = new JButton("Guardar");
		GridBagConstraints gbc_btnGuardarP = new GridBagConstraints();
		gbc_btnGuardarP.gridwidth = 2;
		gbc_btnGuardarP.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarP.gridx = 5;
		gbc_btnGuardarP.gridy = 10;
		Lpropietario.add(btnGuardarP, gbc_btnGuardarP);
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
		//botones guardar
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					
					int m=Integer.parseInt(txtMatricula.getText());
					String DNI =cmbDNI.getSelectedItem().toString();
					
					gestor.InsertarVehiculo(m, DNI, agente);
					
					modelo.addElement(m);
					
					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Debes poner un numero en matricula", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
			}
		});
		btnGuardarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Propietario p;
				try{
					
					
					
					if(textletra.getText().length()==1 && textnumero.getText().length()==8){
					
						String letra = textletra.getText();
						int numero=Integer.parseInt(textnumero.getText());
						String Nombre=textNombre.getText();
						String Apellidos=textApellidos.getText();
						int puntos=Integer.parseInt(textPuntos.getText());
						if(puntos>0&&puntos<16){
						
						p= new Propietario(numero+"-"+letra.toUpperCase(),Nombre,Apellidos,puntos);
						gestor.InsertarPropietario(p, agente);
						System.out.println(p.getDNI());
						modelo3.addElement(numero+"-"+letra.toUpperCase());
						cmbDNI.addItem(numero+"-"+letra.toUpperCase());
						}else{
							JOptionPane.showMessageDialog(contentPane, "Los puntos deben ser entre 1 y 15", "Información",JOptionPane.INFORMATION_MESSAGE);
						}
						
					}else{
						
						JOptionPane.showMessageDialog(contentPane, "Mal introducido el DNI", "Información",JOptionPane.INFORMATION_MESSAGE);
						
						
					}
					

					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Mal introducido los valores", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
				
			}
		});
		
		//borrar Vehiculo
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					gestor.borrarVehiculo(agente, listM.getSelectedValue());
					int index = listM.getSelectedIndex();
					modelo.removeElementAt(index); 
					txtMatricula.enable(true);
					txtMatricula.setText("");
					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Debe seleccionar una Matricula ", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
				
				
				
			}
		});
		//Borrar Propietario
		btnBorrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					
					gestor.borrarPropietario(agente, listP.getSelectedValue());
					int n= cmbDNI.getItemCount();
					
					for (int i =0;i<n;i++){
						
						if (cmbDNI.getItemAt(i)==listP.getSelectedValue()){
							cmbDNI.removeItemAt(i);
						}
						
					}
					int index = listP.getSelectedIndex();
					modelo3.removeElementAt(index);; 
					
					limpiar_camposPropietario();
					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Debe seleccionar una Propietario ", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
				
				
				
			}
		});
		//selecion elemto matricula
		listM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try{
					
					txtMatricula.setText(String.valueOf(listM.getSelectedValue()));
					txtMatricula.enable(false);
					
					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Mal Selecionado", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
				
				
				
			}
		});
		//selecion elemento propietario
		listP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Propietario p;
				try{
					p=gestor.PmedianteDNI(listP.getSelectedValue(), agente);
					
					String matricula = p.getDNI();
					String [] temp=matricula.split("-");
					String numero = temp[0];
					String letra = temp[1];
					textletra.setText(letra);
					textnumero.setText(numero);
					textletra.enable(false);
					textnumero.enable(false);
					textNombre.setText(p.getNombre());
					textApellidos.setText(p.getApellidos());
					textPuntos.setText(String.valueOf(p.getPuntos()));
					
					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Mal Selecionado", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
				
			}
		});
		
		//Boton modificar Vehiculo
		btnModificarV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					int m=Integer.parseInt(txtMatricula.getText());
					String dni=cmbDNI.getSelectedItem().toString();
				
					gestor.ModificarV(m, dni, agente);
					txtMatricula.enable(true);
					txtMatricula.setText("");
					
				}catch(Exception o){
					
					JOptionPane.showMessageDialog(contentPane, "Mal modificacion", "Información",JOptionPane.INFORMATION_MESSAGE);
					//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
					
				}
				
				
			}
		});
		
		btnModificarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Propietario p;
				try{
					String Nombre=textNombre.getText();
					String Apellidos=textApellidos.getText();
					int puntos=Integer.parseInt(textPuntos.getText());
					if(puntos>0&&puntos<16){
					
					p= new Propietario(listP.getSelectedValue(),Nombre,Apellidos,puntos);
					gestor.ModificarP(p, agente);
					limpiar_camposPropietario();
					
					
					}else{
						JOptionPane.showMessageDialog(contentPane, "Los puntos deben ser entre 1 y 15", "Información",JOptionPane.INFORMATION_MESSAGE);
					}
					
				

				
			}catch(Exception o){
				
				JOptionPane.showMessageDialog(contentPane, "Mal introducido los valores", "Información",JOptionPane.INFORMATION_MESSAGE);
				//JOptionPane.showInternalOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue)
				
			}
				
				
		}
		});
		
		
		
	}
	public void limpiar_camposPropietario(){
		
		textletra.enable(true);
		textnumero.enable(true);
		textNombre.setText("");
		textApellidos.setText("");
		textPuntos.setText("");
		textletra.setText("");
		textnumero.setText("");
		
	}

}
