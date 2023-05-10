package bg.jug.academy.assembly.model;

import bg.jug.academy.assembly.model.parts.Description;

public class PartConnection<D extends Description> {

	private Part part;

	private D description;

	public Part getPart() {
		return part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	public D getDescription() {
		return description;
	}
	
	public void setDescription(D description) {
		this.description = description;
	}

}
