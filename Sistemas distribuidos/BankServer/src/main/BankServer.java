package main;

import classes.Server;

public class BankServer {
	
	public static void main(String[] args) {
		Server server = new Server(1802);
		server.run();
	}

}
