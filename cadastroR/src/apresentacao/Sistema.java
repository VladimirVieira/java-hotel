package apresentacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Sistema.Servicos;
import Sistema.ViewCliente;
import Sistema.ViewFuncionario;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Sistema extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema frame = new Sistema();
					frame.setExtendedState(MAXIMIZED_BOTH);
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
	public Sistema() {
		setTitle("Sistema Hotel IMD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setIcon(new ImageIcon(Sistema.class.getResource("/apresentacao/cliente1.jpg")));
		menuBar.add(mnCliente);
		
		JMenuItem mntmCadastro = new JMenuItem("Cadastro");
		mntmCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCliente p = new ViewCliente();
				p.setVisible(true);
			}
		});
		mnCliente.add(mntmCadastro);
		
		JMenu mnFuncionrio = new JMenu("Funcionário");
		mnFuncionrio.setIcon(new ImageIcon(Sistema.class.getResource("/apresentacao/funcionario1.png")));
		menuBar.add(mnFuncionrio);
		
		JMenuItem mntmCadastroFuncio = new JMenuItem("Cadastro Funcio");
		mntmCadastroFuncio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFuncionario f = new ViewFuncionario();
				f.setVisible(true);
			}
		});
		mnFuncionrio.add(mntmCadastroFuncio);
		
		JMenu mnServicos = new JMenu("Servicos");
		mnServicos.setIcon(new ImageIcon(Sistema.class.getResource("/apresentacao/servicos1.png")));
		menuBar.add(mnServicos);
		
		JMenuItem mntmDemandar = new JMenuItem("Demandar");
		mntmDemandar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Servicos s = new Servicos();
				s.setVisible(true);
			}
		});
		mnServicos.add(mntmDemandar);
		
		JMenu mnSair = new JMenu("Sair");
		menuBar.add(mnSair);
		
		JMenuItem mntmConfirma = new JMenuItem("Confirma");
		mntmConfirma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnSair.add(mntmConfirma);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
