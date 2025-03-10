package design.prac.PrototypePattern;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Start of the program");
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("192.1.23.489");
		
		networkConnection.loadVeryImportantData();
		
		
		try {
			NetworkConnection networkConnection2 = (NetworkConnection)networkConnection.clone();
			NetworkConnection networkConnection3 = (NetworkConnection)networkConnection.clone();
			networkConnection.getDomains().remove(0);
			
			// In case of shallow copy in clone, it will affect in other objs also, so the value from list will remove from all objs
			System.out.println(networkConnection);
			System.out.println(networkConnection2);
			System.out.println(networkConnection3);
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
