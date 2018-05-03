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
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.regex.Pattern;

import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class GuiClient extends JFrame
{

	private JPanel contentPane;
	JComboBox<String> comboBoxChoseIntresting;
	JComboBox comboBoxToDelete;
	JLabel lblChoseIntresting;
	JLabel lblToDelete;
	JTextPane textPane;
	JButton btnDelete;
	JButton btnAdd;
	private String serverHost = "localhost";
	private int serverPort = 6154;
	private static Pattern pattern = Pattern.compile("_");
	private static final int BSIZE = 1024;
	public GuiClient()
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        comboBoxChoseIntresting = new JComboBox();
		comboBoxChoseIntresting.setBounds(208, 11, 117, 31);
		contentPane.add(comboBoxChoseIntresting);
		
		comboBoxToDelete = new JComboBox(new Object[]{});
		comboBoxToDelete.setBounds(180, 216, 117, 31);
		contentPane.add(comboBoxToDelete);
		
		lblChoseIntresting = new JLabel("Wybierz interesujace tematy");
		lblChoseIntresting.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblChoseIntresting.setBounds(10, 14, 196, 23);
		contentPane.add(lblChoseIntresting);
		
		lblToDelete = new JLabel("Usuń tematy");
		lblToDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblToDelete.setBounds(80, 219, 102, 23);
		contentPane.add(lblToDelete);
		
		textPane = new JTextPane();
		textPane.setBounds(48, 48, 331, 158);
		contentPane.add(textPane);
		
		btnAdd = new JButton("Dodaj");
		btnAdd.setBounds(335, 11, 89, 31);
		contentPane.add(btnAdd);
		
		btnDelete = new JButton("Usun");
		btnDelete.setBounds(335, 216, 89, 31);
		contentPane.add(btnDelete);
		
		
		try
		{
			InetSocketAddress hostAddress = new InetSocketAddress("localhost", 6154);
			SocketChannel client = SocketChannel.open(hostAddress);
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			buffer.put("askingForData_topics".getBytes());
			buffer.flip();
			client.write(buffer);
			String resString = readData(client);
			String[] resStringTab = pattern.split(resString);
			comboBoxChoseIntresting.setModel(new DefaultComboBoxModel<String>(resStringTab));
		} catch (IOException e)
		{
			System.out.println("Problem with sending");
			e.printStackTrace();
		}
	}
	
	private String readData(SocketChannel sc)
	{
		int numRead = -1;
		try
		{
			ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
			numRead = sc.read(buffer);
			byte[] data = new byte[numRead];
			System.arraycopy(buffer.array(), 0, data, 0, numRead);
			return new String(data);
		} catch (IOException e)
		{
			return null;
		}
	}
}
