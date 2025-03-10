package design.prac.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
	String ip;
	String importantData;
	List<String> domains = new ArrayList<String>();
	
	public List<String> getDomains() {
		return domains;
	}

	public void setDomains(List<String> domains) {
		this.domains = domains;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getImportantData() {
		return importantData;
	}

	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public void loadVeryImportantData() throws InterruptedException {
		// Suppose this would take 5 minutes to execute
		Thread.sleep(5000);
		this.importantData = "Very very important data";
		
		this.domains.add("www.google.com");
		this.domains.add("www.twitter.com");
		this.domains.add("www.youtube.com");
	}

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + ", domains=" + domains + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		// Shallow cloning
		// return super.clone();
		
		// Deep cloning
		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp(this.getIp());
		networkConnection.setImportantData(this.importantData);
		for(String d : this.getDomains()) {
			networkConnection.getDomains().add(d);
		}
		
		return networkConnection;
	}
	
	
}
