package Sistemacopia;

import javax.swing.JInternalFrame;
import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;


/**
 * 
 * Classe para objetos do tipo ViewFuncionario1, onde serão contidos, valores e métodos para o mesmo.
 * Por herança herda de JInternalFrame
 * @version 1.0
 */
public class ViewFuncionario1 extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	private JTextField nome;
	private JTextField salario;
	private JTextField setor;
	private Map<String, String> func;

	/** Método principal onde inicializa o cadastro de Funcionários
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFuncionario1 frame = new ViewFuncionario1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
     * Método construtor ViewFuncionario1
     */
	public ViewFuncionario1() {
		func = new HashMap<>();
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setTitle("Gerenciamento de Funcionários");
		setBounds(100, 100, 450, 450);
		getContentPane().setLayout(null);
		
		JLabel lblCadastroDeFuncionrio = new JLabel("Cadastro de Funcionário");
		lblCadastroDeFuncionrio.setBounds(12, 24, 185, 15);
		getContentPane().add(lblCadastroDeFuncionrio);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(12, 71, 70, 15);
		getContentPane().add(lblNome);
		
		nome = new JTextField();
		nome.setBounds(112, 69, 316, 19);
		getContentPane().add(nome);
		nome.setColumns(10);
		
		JLabel lblSalrio = new JLabel("Salário");
		lblSalrio.setBounds(12, 129, 70, 15);
		getContentPane().add(lblSalrio);
		
		salario = new JTextField();
		salario.setBounds(112, 127, 316, 19);
		getContentPane().add(salario);
		salario.setColumns(10);
		
		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setBounds(12, 186, 70, 15);
		getContentPane().add(lblSetor);
		
		setor = new JTextField();
		setor.setBounds(112, 184, 316, 19);
		getContentPane().add(setor);
		setor.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
	
		btnCadastrar.addActionListener(new ActionListener() {
			
			/** Método usado para cadastrar um Funcionário
		     * 
		     * @param e um objeto do tipo ActionEvent
		     *
		     */
			public void actionPerformed(ActionEvent e) {
				String nomeid = nome.getText();
				String salid = salario.getText();
				String setorid = setor.getText();
				
				//adicionar os dados ao cadastro
				
				
				if (nomeid.isEmpty() | salid.isEmpty() | setorid.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Erro! Cadastro não realizado");
				}else {
					func.put(nomeid, setorid);
					JOptionPane.showMessageDialog(null, "Funcionário Cadastrado!");
				
					//limpar campo
					
					nome.setText("");
					salario.setText("");
					setor.setText("");
				
					nome.requestFocus();
					
				}
			}
		});
		btnCadastrar.setBounds(80, 258, 117, 25);
		getContentPane().add(btnCadastrar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarFuncionario();
			}
		});
		btnListar.setBounds(244, 258, 117, 25);
		getContentPane().add(btnListar);

	}
	
	/** Método usado para listar Funcionários Cadastrados
     * 
     * @param e um objeto do tipo ActionEvent
     *
     */
	private void listarFuncionario() {
		
		//objeto onde a lista será exibida
        JFrame frame = new JFrame("Lista de Funcionários");
        frame.setBounds(350, 350, 350, 350);
        
        //permite fechar a janela e o sistema continua em execução
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        //usado para organizar  os componentes exibidos dentro da janela.
        JPanel p = new JPanel();
        frame.getContentPane().add(p);
        
        //permite que os componentes sejam posicionados por meio de coordenadas.
        p.setLayout(null);

        JLabel lblTitle = new JLabel("Lista de Funcionários");
        lblTitle.setBounds(120, 10, 180, 20);
        p.add(lblTitle);

        int linha = 1;
        for (Map.Entry<String, String> dado : func.entrySet()) {
        	//permite obter o dado chave, ou seja, o nome do funcionário e o dado valor, ou seja, o setor do funcionário
            String nome = dado.getKey();
            String setor = dado.getValue();
            
            JLabel lblNome = new JLabel("Nome: " + nome);
            lblNome.setBounds(20, 30 * linha, 150, 20);
            p.add(lblNome);

            JLabel lblSetor = new JLabel("Setor: " + setor);
            lblSetor.setBounds(20, 30 * linha + 15, 150, 20);
            p.add(lblSetor);
            //a cada iteração permite separa os dados verticalmente
            linha++;
        }
        //torna visível os dados na janela
        frame.setVisible(true);
    }

}
