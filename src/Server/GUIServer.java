package Server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class GUIServer extends JFrame
{

	private JPanel contentPane;
	private JTextField textField;
	public GUIServer()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Dodaj nową wiadomość");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AddNews addNews = new AddNews();
				addNews.setVisible(true);
			}
		});
		btnNewButton.setBounds(119, 11, 204, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblDodajNowyTemat = new JLabel("Dodaj nowy temat");
		lblDodajNowyTemat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDodajNowyTemat.setBounds(10, 56, 126, 14);
		contentPane.add(lblDodajNowyTemat);
		
		textField = new JTextField();
		textField.setBounds(145, 54, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Dodaj");
		btnNewButton_1.setBounds(335, 53, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblUsuTemat = new JLabel("Usuń temat");
		lblUsuTemat.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuTemat.setBounds(10, 106, 110, 14);
		contentPane.add(lblUsuTemat);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(145, 104, 164, 20);
		contentPane.add(comboBox);
		
		JButton btnUsu = new JButton("Usuń");
		btnUsu.setBounds(335, 103, 89, 23);
		contentPane.add(btnUsu);
	}
}
