package bg.jug.academy.assembly.services;

import bg.jug.academy.assembly.AssemblyService;
import bg.jug.academy.assembly.model.AssemblyUnit;
import bg.jug.academy.assembly.model.Part;

public abstract class VehicleAssemblyService 
	implements AssemblyService {

	private Part[] parts;
	
	@Override
	public AssemblyUnit assemble(Part[] parts) {
		this.parts = parts;
		assembleWheels();
		assembleWindows();
		assembleDoors();
		return assembleUnit();
	}

	public abstract void assembleWheels();
	
	public abstract void assembleWindows();
	
	public abstract void assembleDoors();
	
	public abstract AssemblyUnit assembleUnit();
}
