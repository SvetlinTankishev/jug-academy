package bg.jug.academy.assembly.model;

import java.io.Serializable;

public abstract class AssemblyUnit implements Serializable, Cloneable {

	private String serialNumber;

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	protected abstract void assembleWheels();
	
	protected abstract void assembleWindows();

	protected abstract void assembleDoors();

	public void assembleUnit() {
		assembleWheels();
		assembleWindows();
		assembleDoors();
	}

}
