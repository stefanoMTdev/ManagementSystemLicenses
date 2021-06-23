package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class MantenimientoPropuestas extends JInternalFrame {

	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable tablePropuestas;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoPropuestas frame = new MantenimientoPropuestas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void quitarBarraTitulo() {
		Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
		DimensionBarra = Barra.getPreferredSize();
		Barra.setSize(0,0);
		Barra.setPreferredSize(new Dimension (0,0));
		repaint();
	}
	/**
	 * Create the frame.
	 */
	public MantenimientoPropuestas() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mantenimiento de Propuestas");
		lblNewLabel.setBounds(306, 22, 352, 27);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Propuesta");
		lblNewLabel_1.setBounds(57, 77, 166, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre de Propuesta");
		lblNewLabel_2.setBounds(57, 128, 166, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("C\u00F3digo del Participante");
		lblNewLabel_3.setBounds(57, 184, 166, 14);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(57, 97, 144, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(57, 153, 144, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(57, 200, 144, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRegistrar = new JButton("    Registrar");
		btnRegistrar.setBounds(735, 77, 153, 39);
		btnRegistrar.setForeground(new Color(253, 245, 230));
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/open-book.png")));
		btnRegistrar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnRegistrar);
		
		JButton btnEliminar = new JButton("    Eliminar");
		btnEliminar.setBounds(735, 180, 153, 39);
		btnEliminar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/delete (2).png")));
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setForeground(new Color(253, 245, 230));
		btnEliminar.setBorderPainted(false);
		btnEliminar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnEliminar);
		
		JButton btnModificar = new JButton("    Modificar");
		btnModificar.setBounds(735, 128, 153, 39);
		btnModificar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/edit (1).png")));
		btnModificar.setForeground(new Color(253, 245, 230));
		btnModificar.setBorderPainted(false);
		btnModificar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnModificar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 244, 910, 329);
		getContentPane().add(scrollPane);
		
		tablePropuestas = new JTable();
		tablePropuestas.setFillsViewportHeight(true);
		scrollPane.setColumnHeaderView(tablePropuestas);
		tablePropuestas.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tablePropuestas.setBackground(new Color(245, 245, 220));
		
		JLabel lblNewLabel_2_2 = new JLabel("Fecha de Inicio");
		lblNewLabel_2_2.setBounds(265, 77, 123, 14);
		getContentPane().add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(265, 97, 144, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha Final");
		lblNewLabel_3_1.setBounds(265, 128, 166, 14);
		getContentPane().add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(265, 153, 144, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_2_1 = new JLabel("Presupuesto");
		lblNewLabel_2_1.setBounds(265, 184, 123, 14);
		getContentPane().add(lblNewLabel_2_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(265, 200, 144, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_2_3 = new JLabel("Puntaje Propuesta T\u00E9cnica");
		lblNewLabel_2_3.setBounds(487, 77, 194, 14);
		getContentPane().add(lblNewLabel_2_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(487, 102, 144, 20);
		getContentPane().add(textField_6);
		
		JLabel lblNewLabel_3_2 = new JLabel("Puntaje Propuesta Econ\u00F3mica");
		lblNewLabel_3_2.setBounds(487, 133, 194, 14);
		getContentPane().add(lblNewLabel_3_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(487, 149, 144, 20);
		getContentPane().add(textField_7);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Puntaje Final");
		lblNewLabel_3_2_1.setBounds(487, 184, 166, 14);
		getContentPane().add(lblNewLabel_3_2_1);
		
		textField_8 = new JTextField();
		textField_8.setEnabled(false);
		textField_8.setColumns(10);
		textField_8.setBounds(487, 200, 144, 20);
		getContentPane().add(textField_8);

	}
		
}


