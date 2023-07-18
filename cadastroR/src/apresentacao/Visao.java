package apresentacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import pesistencia.ControlaCliente;
import negocio.Cliente;
public class Visao extends JFrame {
	ControlaCliente cc = new ControlaCliente();
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnVerTodos;
	private JButton btnSalvar;
	private JButton btnSair;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visao frame = new Visao();
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
	public Visao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(12, 12, 70, 15);
		contentPane.add(lblNome);
		
		JLabel lblCheckin = new JLabel("checkin:");
		lblCheckin.setBounds(12, 39, 70, 15);
		contentPane.add(lblCheckin);
		
		textField = new JTextField();
		textField.setBounds(79, 10, 317, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 37, 180, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnVerTodos = new JButton("Ver todos");
		btnVerTodos.setBounds(12, 132, 117, 25);
		contentPane.add(btnVerTodos);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente cliente = new Cliente();
				
				cliente.setNome(textField.getText());
				cliente.setCheckin(textField_1.getText());
				
				//tenta salvar
				
				if(cc.salvar(cliente)) {
					JOptionPane.showMessageDialog(null, "Cliente realizou checkin!");
					textField.setText(" ");
					textField_1.setText(" ");
					textField.requestFocus();
				}else {
					JOptionPane.showMessageDialog(null, "Cliente não cadastrado.Erro!");
				}
			}
		});
		btnSalvar.setBounds(12, 169, 117, 25);
		contentPane.add(btnSalvar);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(12, 206, 117, 25);
		contentPane.add(btnSair);
	}
}
