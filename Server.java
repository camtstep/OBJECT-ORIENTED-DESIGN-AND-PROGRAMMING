import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;
	private JLabel lblNewLabel_2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Server() {
		setTitle("Chatty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 475);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name1 = new JTextField();
		name1.setFont(new Font("Courier New", Font.PLAIN, 18));
		name1.setBounds(92, 157, 326, 41);
		contentPane.add(name1);
		name1.setColumns(10);
		
		name2 = new JTextField();
		name2.setFont(new Font("Courier New", Font.PLAIN, 18));
		name2.setBounds(92, 265, 326, 41);
		contentPane.add(name2);
		name2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username 1");
		lblNewLabel.setFont(new Font("Courier New", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(151, 116, 194, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username 2");
		lblNewLabel_1.setFont(new Font("Courier New", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(151, 224, 194, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start Chatting");
		btnNewButton.setFont(new Font("Courier New", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createChatRoom();
			}
		});
		btnNewButton.setBounds(158, 349, 194, 55);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Welcome to Chatty");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Courier New", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(92, 39, 332, 41);
		contentPane.add(lblNewLabel_2);
	}
	
		private void createChatRoom() {
			String p1 = name1.getText();
			String p2 = name2.getText();
		
			ChatWindow1.username1 = name1.getText();
			ChatWindow2.username2 = name2.getText();
			ChatRoom.createRoom();
		}
	}
