package bg.jug.academy.assembly.services;

import bg.jug.academy.assembly.model.AssemblyUnit;
import bg.jug.academy.assembly.model.Part;
import bg.jug.academy.assembly.model.units.Truck;

public class TruckAssemblyService extends VehicleAssemblyService {

	@Override
	public AssemblyUnit assemble(Part[] parts) {
		return new Truck();
	}

	@Override
	public void assembleWheels() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assembleWindows() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assembleDoors() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AssemblyUnit assembleUnit() {
		return new Truck();
	}

}
