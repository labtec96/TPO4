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
	JComboBox<String> comboBox;
	public GuiClient()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        String[] bloodGroups = { "A", "B", "AB", "O" };
        comboBox = new JComboBox(bloodGroups);
		comboBox.setBounds(262, 11, 117, 31);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(new Object[]{});
		comboBox_1.setBounds(262, 216, 117, 31);
		contentPane.add(comboBox_1);
		
		JLabel lblWybierzInteresujaceTematy = new JLabel("Wybierz interesujace tematy");
		lblWybierzInteresujaceTematy.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWybierzInteresujaceTematy.setBounds(38, 14, 196, 23);
		contentPane.add(lblWybierzInteresujaceTematy);
		
		JLabel lblUsuTematy = new JLabel("Usuń tematy");
		lblUsuTematy.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuTematy.setBounds(150, 219, 102, 23);
		contentPane.add(lblUsuTematy);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(48, 48, 65, 158);
		contentPane.add(textPane);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(165, 60, 21, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("");
		radioButton.setBounds(188, 60, 21, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(211, 60, 21, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("");
		radioButton_2.setBounds(234, 60, 21, 23);
		contentPane.add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("");
		radioButton_3.setBounds(234, 78, 21, 23);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("");
		radioButton_4.setBounds(211, 78, 21, 23);
		contentPane.add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("");
		radioButton_5.setBounds(188, 78, 21, 23);
		contentPane.add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("");
		radioButton_6.setBounds(165, 78, 21, 23);
		contentPane.add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("");
		radioButton_7.setBounds(234, 97, 21, 23);
		contentPane.add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("");
		radioButton_8.setBounds(211, 97, 21, 23);
		contentPane.add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("");
		radioButton_9.setBounds(188, 97, 21, 23);
		contentPane.add(radioButton_9);
		
		JRadioButton radioButton_10 = new JRadioButton("");
		radioButton_10.setBounds(165, 97, 21, 23);
		contentPane.add(radioButton_10);
		
		JRadioButton radioButton_11 = new JRadioButton("");
		radioButton_11.setBounds(234, 116, 21, 23);
		contentPane.add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("");
		radioButton_12.setBounds(211, 116, 21, 23);
		contentPane.add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("");
		radioButton_13.setBounds(188, 116, 21, 23);
		contentPane.add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("");
		radioButton_14.setBounds(165, 116, 21, 23);
		contentPane.add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("");
		radioButton_15.setBounds(234, 153, 21, 23);
		contentPane.add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("");
		radioButton_16.setBounds(211, 153, 21, 23);
		contentPane.add(radioButton_16);
		
		JRadioButton radioButton_17 = new JRadioButton("");
		radioButton_17.setBounds(188, 135, 21, 23);
		contentPane.add(radioButton_17);
		
		JRadioButton radioButton_18 = new JRadioButton("");
		radioButton_18.setBounds(165, 153, 21, 23);
		contentPane.add(radioButton_18);
		
		JRadioButton radioButton_19 = new JRadioButton("");
		radioButton_19.setBounds(188, 153, 21, 23);
		contentPane.add(radioButton_19);
		
		JRadioButton radioButton_20 = new JRadioButton("");
		radioButton_20.setBounds(165, 135, 21, 23);
		contentPane.add(radioButton_20);
		
		JRadioButton radioButton_21 = new JRadioButton("");
		radioButton_21.setBounds(211, 135, 21, 23);
		contentPane.add(radioButton_21);
		
		JRadioButton radioButton_22 = new JRadioButton("");
		radioButton_22.setBounds(234, 135, 21, 23);
		contentPane.add(radioButton_22);
	}
}
