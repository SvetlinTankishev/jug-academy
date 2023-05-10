package bg.jug.academy.assembly.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import bg.jug.academy.assembly.model.parts.Description;

public abstract class Part<T, D extends Description> {

	private String serialNumber;

	private double cost;

	private List<PartConnection<D>> links;

	public Part() {
		links = new ArrayList<PartConnection<D>>();
	}

	private int linksCount = 0;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getCost() {

		List<String> items = new LinkedList<>();
		@SuppressWarnings("rawtypes")
		List rawItems = items;

		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<PartConnection<D>> getLinks() {
		return links;
	}

	public void addLink(PartConnection<D> link) {
		links.add(link);
	}

	public static <A extends AssemblyUnit> 
		void modifySerialNumber(A unit, String serialNumber) {
		unit.setSerialNumber(serialNumber);
	}
}
