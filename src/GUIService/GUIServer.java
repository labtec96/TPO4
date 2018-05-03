package GUIService;

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
	private JTextField tFAddNewTopic;
	JButton buttonNewMessage;
	JLabel lblAddNewTopic;
	JButton buttonAddNewTopic;
	JLabel lblDelete;
	JComboBox cBToDelete;
	JButton buttonToDelete;
	public GUIServer()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttonNewMessage = new JButton("Dodaj nową wiadomość");
		buttonNewMessage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				GuiAddNews addNews = new GuiAddNews();
				addNews.setVisible(true);
			}
		});
		buttonNewMessage.setBounds(119, 11, 204, 23);
		contentPane.add(buttonNewMessage);
		
		lblAddNewTopic = new JLabel("Dodaj nowy temat");
		lblAddNewTopic.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAddNewTopic.setBounds(10, 56, 126, 14);
		contentPane.add(lblAddNewTopic);
		
		tFAddNewTopic = new JTextField();
		tFAddNewTopic.setBounds(145, 54, 164, 20);
		contentPane.add(tFAddNewTopic);
		tFAddNewTopic.setColumns(10);
		
		buttonAddNewTopic = new JButton("Dodaj");
		buttonAddNewTopic.setBounds(335, 53, 89, 23);
		contentPane.add(buttonAddNewTopic);
		
		lblDelete = new JLabel("Usuń temat");
		lblDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDelete.setBounds(10, 106, 110, 14);
		contentPane.add(lblDelete);
		
		cBToDelete = new JComboBox();
		cBToDelete.setBounds(145, 104, 164, 20);
		contentPane.add(cBToDelete);
		
		buttonToDelete = new JButton("Usuń");
		buttonToDelete.setBounds(335, 103, 89, 23);
		contentPane.add(buttonToDelete);
	}
}
