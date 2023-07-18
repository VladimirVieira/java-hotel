package apresentacao;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;

public class Menu extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setTitle("Sistema de cadastro Hotel IMD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnFuncionario = new JMenu("Funcionario");
		mnFuncionario.setIcon(new ImageIcon(Menu.class.getResource("/apresentacao/excluir1.png")));
		menuBar.add(mnFuncionario);
		
		JMenuItem mntmNovofuncionario = new JMenuItem("NovoFuncionario");
		mntmNovofuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltaCliente clie = new AltaCliente();
				Dimension desktopSize=contentPane.getSize();
				Dimension FrameSize=clie.getSize();
				clie.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
				contentPane.add(clie);
				clie.setVisible(true);
				
			}
		});
		mntmNovofuncionario.setHorizontalAlignment(SwingConstants.TRAILING);
		mntmNovofuncionario.setIcon(null);
		mnFuncionario.add(mntmNovofuncionario);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setIcon(new ImageIcon("/home/vladimir/Área de Trabalho/salvar.png"));
		menuBar.add(mnCliente);
		
		JMenuItem mntmCheckin = new JMenuItem("Checkin");
		mntmCheckin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Visao p = new Visao();
				p.setVisible(true);
			}
		});
		mnCliente.add(mntmCheckin);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menuBar.add(mnSair);
		
		JMenuItem mntmTeste = new JMenuItem("Teste");
		mntmTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnSair.add(mntmTeste);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JDesktopPane escritorio = new JDesktopPane();
		escritorio.setBackground(Color.YELLOW);
		contentPane.add(escritorio, "name_289890640133226");
	}
}
