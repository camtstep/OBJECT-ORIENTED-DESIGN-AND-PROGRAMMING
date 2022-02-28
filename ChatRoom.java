public class ChatRoom {
	static ChatWindow1 window1;
	static ChatWindow2 window2;
	static Server server;
	
	public ChatRoom() {
		server = new Server();
		server.setLocationRelativeTo(null);
		server.setVisible(true);
	}
	
	public static void createRoom() {
		window1 = new ChatWindow1();
		window2 = new ChatWindow2();
		window1.setLocation(500,200);
		window2.setLocation(900,200);
		window1.setVisible(true);
		window2.setVisible(true);
		server.setVisible(false);
	}
	
	public static void main(String[] args) {
		ChatRoom chatty = new ChatRoom();
	}
}
