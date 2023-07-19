package Sistemacopia;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCliente extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField nome;
	private JTextField check;
	private JTextField data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCliente frame = new ViewCliente();
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
	public ViewCliente() {
		setIconifiable(true);
		setClosable(true);
		setMaximizable(true);
		setTitle("Gerenciamento de clientes");
		setBounds(100, 100, 450, 450);
		getContentPane().setLayout(null);
		
		JLabel lblCadastroCliente = new JLabel("Cadastro Cliente");
		lblCadastroCliente.setBounds(12, 31, 146, 15);
		getContentPane().add(lblCadastroCliente);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 68, 416, 111);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "checkin/checkout", "Data"
			}
		));
		scrollPane.setViewportView(table);
		
		nome = new JTextField();
		nome.setBounds(143, 199, 285, 19);
		getContentPane().add(nome);
		nome.setColumns(10);
		
		JLabel lblCheckincheckout = new JLabel("checkin/checkout");
		lblCheckincheckout.setBounds(12, 254, 130, 15);
		getContentPane().add(lblCheckincheckout);
		
		check = new JTextField();
		check.setBounds(143, 252, 285, 19);
		getContentPane().add(check);
		check.setColumns(10);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(12, 308, 70, 15);
		getContentPane().add(lblData);
		
		data = new JTextField();
		data.setBounds(143, 306, 285, 19);
		getContentPane().add(data);
		data.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 201, 70, 15);
		getContentPane().add(lblNome);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeid = nome.getText();
				String checkid = check.getText();
				String dataid = data.getText();
				
				//adicionar os dados ao cadastro
				DefaultTableModel tabela = (DefaultTableModel)table.getModel();
				tabela.addRow(new String[]{nomeid,checkid,dataid});
				
				//limpar campo
				nome.setText(" ");
				check.setText(" ");
				data.setText(" ");
				
				nome.requestFocus();
			}
		});
		btnCadastrar.setBounds(100, 356, 117, 25);
		getContentPane().add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
			}
		});
		btnExcluir.setBounds(245, 356, 117, 25);
		getContentPane().add(btnExcluir);

	}
}
