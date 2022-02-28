import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;

public class ChatWindow2 extends JFrame {

	static String username2;
	private JPanel contentPane;
	
	private javax.swing.JLabel chatter2;
	private static javax.swing.JTextArea display2;
	private javax.swing.JButton send2;
	public static javax.swing.JTextArea text2;
	private JButton btnNewButton;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindow2 frame = new ChatWindow2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChatWindow2() {
		setTitle("Chatty");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		send2 = new JButton("Send");
		send2.setFont(new Font("Courier New", Font.PLAIN, 14));
		send2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text2.getText();
				if(s.equals("")) {
					return;
				}
				display2.append(username2 + ": " + s + "\n");
				ChatWindow1.sendMessage();
				text2.setText("");
			}
		});
		send2.setBounds(297, 488, 77, 50);
		contentPane.add(send2);
		
		chatter2 = new JLabel("Chat window for: " + username2);
		chatter2.setFont(new Font("Courier New", Font.PLAIN, 14));
		chatter2.setBounds(12, 13, 261, 27);
		contentPane.add(chatter2);
		
		display2 = new JTextArea();
		display2.setFont(new Font("Courier New", Font.PLAIN, 14));
		display2.setBounds(12, 46, 362, 429);
		contentPane.add(display2);
		display2.setLineWrap(true);
		
		text2 = new JTextArea();
		text2.setFont(new Font("Courier New", Font.PLAIN, 14));
		text2.setBounds(12, 488, 273, 62);
		contentPane.add(text2);
		text2.setColumns(10);
		text2.setLineWrap(true);
		
		btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display2.setText("");
			}
		});
		btnNewButton.setFont(new Font("Courier New", Font.PLAIN, 14));
		btnNewButton.setBounds(281, 13, 93, 27);
		contentPane.add(btnNewButton);
	}
	
	public static void sendMessage() {
		String s = ChatWindow1.text1.getText();
		if(s.equals("")) {
			return;
		}
		display2.append(ChatWindow1.username1 + ": " + s + "\n");
	}
}
