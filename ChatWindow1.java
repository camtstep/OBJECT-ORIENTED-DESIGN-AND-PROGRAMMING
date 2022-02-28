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
import javax.swing.JScrollBar;
import java.awt.SystemColor;

public class ChatWindow1 extends JFrame {

	static String username1;
	private JPanel contentPane;
	
	private javax.swing.JLabel chatter1;
	private static javax.swing.JTextArea display1;
	private javax.swing.JButton send1; 
	public static javax.swing.JTextArea text1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatWindow1 frame = new ChatWindow1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChatWindow1() {
		setBackground(SystemColor.menu);
		setTitle("Chatty");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		send1 = new JButton("Send");
		send1.setFont(new Font("Courier New", Font.PLAIN, 14));
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text1.getText();
				if(s.equals("")) {
					return;
				}
				display1.append(username1 + ": " + s + "\n");
				ChatWindow2.sendMessage();
				text1.setText("");
			}
		});
		send1.setBounds(297, 488, 77, 50);
		contentPane.add(send1);
		
		chatter1 = new JLabel("Chat window for: " + username1);
		chatter1.setFont(new Font("Courier New", Font.PLAIN, 14));
		chatter1.setBounds(12, 13, 261, 27);
		contentPane.add(chatter1);
		
		display1 = new JTextArea();
		display1.setFont(new Font("Courier New", Font.PLAIN, 14));
		display1.setBounds(12, 46, 362, 429);
		contentPane.add(display1);
		display1.setLineWrap(true);
		
		text1 = new JTextArea();
		text1.setFont(new Font("Courier New", Font.PLAIN, 14));
		text1.setBounds(12, 488, 273, 62);
		contentPane.add(text1);
		text1.setLineWrap(true);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		btnNewButton.setFont(new Font("Courier New", Font.PLAIN, 14));
		btnNewButton.setBounds(281, 13, 93, 27);
		contentPane.add(btnNewButton);
	}

	public static void sendMessage() {
		String s = ChatWindow2.text2.getText();
		if(s.equals("")) {
			return;
		}
		display1.append(ChatWindow2.username2 + ": " + s + "\n");
	}
}
