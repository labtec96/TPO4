package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JRadioButton;

public class GuiClient extends JFrame
{

	private JPanel contentPane;
	JComboBox<String> comboBoxChoseIntresting;
	
	public GuiClient()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        comboBoxChoseIntresting = new JComboBox();
		comboBoxChoseIntresting.setBounds(262, 11, 117, 31);
		contentPane.add(comboBoxChoseIntresting);
		
		JComboBox comboBoxToDelete = new JComboBox(new Object[]{});
		comboBoxToDelete.setBounds(262, 216, 117, 31);
		contentPane.add(comboBoxToDelete);
		
		JLabel lblWybierzInteresujaceTematy = new JLabel("Wybierz interesujace tematy");
		lblWybierzInteresujaceTematy.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWybierzInteresujaceTematy.setBounds(38, 14, 196, 23);
		contentPane.add(lblWybierzInteresujaceTematy);
		
		JLabel lblUsuTematy = new JLabel("Usuń tematy");
		lblUsuTematy.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuTematy.setBounds(150, 219, 102, 23);
		contentPane.add(lblUsuTematy);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(48, 48, 331, 158);
		contentPane.add(textPane);
	}
}
