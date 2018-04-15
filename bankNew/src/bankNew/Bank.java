package bankNew;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	String name;
	List<Client> clientList = new ArrayList<Client>();

	public static void main(String[] args) {
		Bank bank1 = new Bank("Stadtbank");
		Bank bank2 = new Bank("Landbank");
		
		Client c1 = new Client("Andy", "Harlaching");		
		Client c2 = new Client("Isa", "Munich");
		
		Client c3 = new Client("Alex", "Erlangen");
		Client c4 = new Client("Flo", "Deisenhofen");
		
		
		bank1.addClient(c1);
		bank1.addClient(c2);
		
		bank2.addClient(c3);
		bank2.addClient(c4);
		
		bank1.printClientList();
		bank2.printClientList();
	}
	
	
	public Bank(String name) {
		this.name = name;
	}
	
	public void addClient(Client c) {
		clientList.add(c);
	}
	
	public void printClientList() {	
		System.out.println(name);
		System.out.println("==========");
		for (Client c : clientList) {
			System.out.println(c.getName() + "   " + c.getAddress());
			System.out.println("----------------------------------");
		}
	}

}
