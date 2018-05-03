package GUIService;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JComboBox;

public class GuiAddNews extends JDialog
{

	private final JPanel contentPanel = new JPanel();
	public GuiAddNews()
	{
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblTematNowegoNewsa = new JLabel("Temat nowego newsa");
			lblTematNowegoNewsa.setBounds(78, 11, 141, 16);
			lblTematNowegoNewsa.setFont(new Font("Tahoma", Font.BOLD, 13));
			contentPanel.add(lblTematNowegoNewsa);
		}
		{
			JComboBox cBToDelete = new JComboBox();
			cBToDelete.setBounds(229, 10, 151, 20);
			contentPanel.add(cBToDelete);
		}
		{
			JTextPane textPane = new JTextPane();
			textPane.setBounds(32, 35, 352, 182);
			contentPanel.add(textPane);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) 
					{
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) 
					{
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
