package apresentacao;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import negocio.Cliente;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import pesistencia.ControlaCliente;
import pesistencia.ControlaCliente;

public class DlgMostraCliente extends JDialog {
	ControlaCliente cc;
	private JTable table;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		try {
			DlgMostraCliente dialog = new DlgMostraCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgMostraCliente() {
		setBounds(100, 100, 556, 394);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 322, 556, 35);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnSair = new JButton("Sair");
				btnSair.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(btnSair);
			}
		}
		
		table = new JTable();
		table.setBounds(350, 227, -204, -183);
		getContentPane().add(table);
		
	}
	
}
