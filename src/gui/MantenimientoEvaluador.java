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

public class MantenimientoEvaluador extends JInternalFrame {
	private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI)getUI()).getNorthPane();
	private Dimension DimensionBarra = null;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable tableEvaluadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MantenimientoEvaluador frame = new MantenimientoEvaluador();
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
	public MantenimientoEvaluador() {
		this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
		quitarBarraTitulo();
		getContentPane().setBackground(Color.WHITE);
		setBounds(233, 37, 957, 627);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mantenimiento de Evaluadores");
		lblNewLabel.setBounds(306, 22, 352, 27);
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Montserrat", Font.BOLD, 20));
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("C\u00F3digo de Evaluador");
		lblNewLabel_1.setBounds(57, 77, 109, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Puesto de Evaluador");
		lblNewLabel_2.setBounds(57, 128, 123, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("C�digo de la propuesta asignada");
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
		
		JButton btnNewButton = new JButton("    Registrar");
		btnNewButton.setBounds(57, 274, 144, 39);
		btnNewButton.setForeground(new Color(253, 245, 230));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/open-book.png")));
		btnNewButton.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnNewButton);
		
		JButton btnEliminar = new JButton("    Eliminar");
		btnEliminar.setBounds(373, 274, 131, 39);
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
		btnModificar.setBounds(220, 274, 131, 39);
		btnModificar.setIcon(new ImageIcon(MantenimientoEvaluador.class.getResource("/img/edit (1).png")));
		btnModificar.setForeground(new Color(253, 245, 230));
		btnModificar.setBorderPainted(false);
		btnModificar.setBackground(new Color(220, 20, 60));
		getContentPane().add(btnModificar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 355, 826, 219);
		getContentPane().add(scrollPane);
		
		tableEvaluadores = new JTable();
		tableEvaluadores.setFillsViewportHeight(true);
		scrollPane.setColumnHeaderView(tableEvaluadores);
		tableEvaluadores.setBorder(new LineBorder(new Color(227, 227, 227), 2, true));
		tableEvaluadores.setBackground(new Color(245, 245, 220));

	}

	}


