package notaPonderada;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frame;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;
	private JTextField textPesoNota1;
	private JTextField textPesoNota2;
	private JTextField textPesoNota3;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Nota 1:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nota 3:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 0;
		frame.getContentPane().add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textNota1 = new JTextField();
		GridBagConstraints gbc_textNota1 = new GridBagConstraints();
		gbc_textNota1.insets = new Insets(0, 0, 5, 5);
		gbc_textNota1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNota1.gridx = 0;
		gbc_textNota1.gridy = 1;
		frame.getContentPane().add(textNota1, gbc_textNota1);
		textNota1.setColumns(2);
		
		textNota2 = new JTextField();
		GridBagConstraints gbc_textNota2 = new GridBagConstraints();
		gbc_textNota2.insets = new Insets(0, 0, 5, 5);
		gbc_textNota2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNota2.gridx = 2;
		gbc_textNota2.gridy = 1;
		frame.getContentPane().add(textNota2, gbc_textNota2);
		textNota2.setColumns(2);
		
		textNota3 = new JTextField();
		GridBagConstraints gbc_textNota3 = new GridBagConstraints();
		gbc_textNota3.insets = new Insets(0, 0, 5, 0);
		gbc_textNota3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNota3.gridx = 4;
		gbc_textNota3.gridy = 1;
		frame.getContentPane().add(textNota3, gbc_textNota3);
		textNota3.setColumns(2);
		
		JLabel lblNewLabel_3 = new JLabel("Peso nota 1:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		frame.getContentPane().add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Peso nota 2:");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 3;
		frame.getContentPane().add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso nota 3:");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 4;
		gbc_lblNewLabel_5.gridy = 3;
		frame.getContentPane().add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textPesoNota1 = new JTextField();
		GridBagConstraints gbc_textPesoNota1 = new GridBagConstraints();
		gbc_textPesoNota1.insets = new Insets(0, 0, 5, 5);
		gbc_textPesoNota1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPesoNota1.gridx = 0;
		gbc_textPesoNota1.gridy = 4;
		frame.getContentPane().add(textPesoNota1, gbc_textPesoNota1);
		textPesoNota1.setColumns(10);
		
		textPesoNota2 = new JTextField();
		GridBagConstraints gbc_textPesoNota2 = new GridBagConstraints();
		gbc_textPesoNota2.insets = new Insets(0, 0, 5, 5);
		gbc_textPesoNota2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPesoNota2.gridx = 2;
		gbc_textPesoNota2.gridy = 4;
		frame.getContentPane().add(textPesoNota2, gbc_textPesoNota2);
		textPesoNota2.setColumns(10);
		
		textPesoNota3 = new JTextField();
		GridBagConstraints gbc_textPesoNota3 = new GridBagConstraints();
		gbc_textPesoNota3.insets = new Insets(0, 0, 5, 0);
		gbc_textPesoNota3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPesoNota3.gridx = 4;
		gbc_textPesoNota3.gridy = 4;
		frame.getContentPane().add(textPesoNota3, gbc_textPesoNota3);
		textPesoNota3.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular Media");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float nota1;
				float nota2;
				float nota3;
				
				float peso1;
				float peso2;
				float peso3;
				
				float media;
				
				nota1 = Float.parseFloat(textNota1.getText());
				nota2 = Float.parseFloat(textNota2.getText());
				nota3 = Float.parseFloat(textNota3.getText());
				peso1 = Float.parseFloat(textPesoNota1.getText());
				peso2 = Float.parseFloat(textPesoNota2.getText());
				peso3 = Float.parseFloat(textPesoNota3.getText());
				
				peso1 /= 100;
				peso2 /= 100;
				peso3 /= 100;
				
				media = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3) / (peso1+peso2+peso3));
				
				lblResultado.setText(String.valueOf(media));

			}
		});
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.insets = new Insets(0, 0, 0, 5);
		gbc_btnCalcular.gridx = 0;
		gbc_btnCalcular.gridy = 5;
		frame.getContentPane().add(btnCalcular, gbc_btnCalcular);
		
		lblResultado = new JLabel("-");
		GridBagConstraints gbc_lblResultado = new GridBagConstraints();
		gbc_lblResultado.insets = new Insets(0, 0, 0, 5);
		gbc_lblResultado.gridx = 2;
		gbc_lblResultado.gridy = 5;
		frame.getContentPane().add(lblResultado, gbc_lblResultado);
	}

}
