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

public class Servicos extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField nome;
	private JTextField servico;
	private JTextField quarto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Servicos frame = new Servicos();
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
	public Servicos() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Gerenciamento de Serviços");
		setBounds(100, 100, 450, 450);
		getContentPane().setLayout(null);
		
		JLabel lblServios = new JLabel("Serviços");
		lblServios.setBounds(12, 31, 70, 15);
		getContentPane().add(lblServios);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 58, 416, 108);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome Cliente", "Tipos de Serviço", "Quarto"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 202, 70, 15);
		getContentPane().add(lblNome);
		
		nome = new JTextField();
		nome.setBounds(107, 200, 321, 19);
		getContentPane().add(nome);
		nome.setColumns(10);
		
		JLabel lblTipoDeServio = new JLabel("Tipo de Serviço");
		lblTipoDeServio.setBounds(12, 248, 100, 15);
		getContentPane().add(lblTipoDeServio);
		
		servico = new JTextField();
		servico.setBounds(107, 246, 321, 19);
		getContentPane().add(servico);
		servico.setColumns(10);
		
		JLabel lblQuarto = new JLabel("Quarto");
		lblQuarto.setBounds(12, 298, 70, 15);
		getContentPane().add(lblQuarto);
		
		quarto = new JTextField();
		quarto.setBounds(107, 296, 321, 19);
		getContentPane().add(quarto);
		quarto.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeid = nome.getText();
				String servicoid = servico.getText();
				String quartoid = quarto.getText();
				
				//adicionar os dados ao cadastro
				DefaultTableModel tabela = (DefaultTableModel)table.getModel();
				tabela.addRow(new String[]{nomeid,servicoid,quartoid});
				
				//limpar campo
				nome.setText(" ");
				servico.setText(" ");
				quarto.setText(" ");
				
				nome.requestFocus();
			}
		});
		btnCadastrar.setBounds(76, 359, 117, 25);
		getContentPane().add(btnCadastrar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
			}
		});
		btnExcluir.setBounds(247, 359, 117, 25);
		getContentPane().add(btnExcluir);

	}

}
