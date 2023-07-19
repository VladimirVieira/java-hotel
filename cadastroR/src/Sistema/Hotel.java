package Sistemacopia;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;

public class Hotel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hotel frame = new Hotel();
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
	public Hotel() {
		setBackground(Color.LIGHT_GRAY);
		setTitle("Sistema Hotel IMD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		JMenu mnCliente = new JMenu("Cliente");
		mnCliente.setIcon(new ImageIcon(Hotel.class.getResource("/Sistemacopia/cliente1.jpg")));
		menuBar.add(mnCliente);
		
		JMenuItem mntmCadastrarC = new JMenuItem("Cadastrar C...");
		mntmCadastrarC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewCliente c = new ViewCliente();
				Dimension desktopsize = contentPane.getSize();
				Dimension FrameSize = c.getSize();
				c.setLocation((desktopsize.width-FrameSize.width)/2,(desktopsize.height-FrameSize.height)/2);
				contentPane.add(c);
				c.setVisible(true);
			}
		});
		mnCliente.add(mntmCadastrarC);
		
		JMenu mnFuncionrio = new JMenu("Funcionário");
		mnFuncionrio.setIcon(new ImageIcon(Hotel.class.getResource("/Sistemacopia/funcionario1.png")));
		menuBar.add(mnFuncionrio);
		
		JMenuItem mntmCadastrarF = new JMenuItem("Cadastrar F...");
		mntmCadastrarF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewFuncionario1 f = new ViewFuncionario1();
				Dimension desktopsize = contentPane.getSize();
				Dimension FrameSize = f.getSize();
				f.setLocation((desktopsize.width-FrameSize.width)/2,(desktopsize.height-FrameSize.height)/2);
				contentPane.add(f);
				f.setVisible(true);
				
			}
		});
		mnFuncionrio.add(mntmCadastrarF);
		
		JMenu mnServios = new JMenu("Serviços");
		mnServios.setIcon(new ImageIcon(Hotel.class.getResource("/Sistemacopia/servicos1.png")));
		menuBar.add(mnServios);
		
		JMenuItem mntmDemandarSer = new JMenuItem("Demandar Ser...");
		mntmDemandarSer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Servicos s = new Servicos();
				Dimension desktopsize = contentPane.getSize();
				Dimension FrameSize = s.getSize();
				s.setLocation((desktopsize.width-FrameSize.width)/2,(desktopsize.height-FrameSize.height)/2);
				contentPane.add(s);
				s.setVisible(true);
			}
		});
		mnServios.add(mntmDemandarSer);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setIcon(new ImageIcon(Hotel.class.getResource("/Sistemacopia/sair1.png")));
		menuBar.add(mnSair);
		
		JMenuItem mntmConfirmar = new JMenuItem("Confirmar");
		mntmConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnSair.add(mntmConfirmar);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(107, 153, 205, -87);
		contentPane.add(desktopPane);
	}
}
