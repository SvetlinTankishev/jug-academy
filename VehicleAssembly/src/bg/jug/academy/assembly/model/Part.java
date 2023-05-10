package bg.jug.academy.assembly.model;

import java.util.Arrays;

public abstract class Part {

	private String serialNumber;
	
	private double cost;
	
	private PartConnection[] links;

	private int linksCount = 0;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public PartConnection[] getLinks() {
		return links;
	}
	
	public void addLink(PartConnection link) {
		if(links.length >= linksCount) {
			links = Arrays.copyOf(links, links.length * 2);
		}
		links[linksCount++] = link;
	} 
}
