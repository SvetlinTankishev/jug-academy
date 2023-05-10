package bg.jug.academy.assembly.services;

import bg.jug.academy.assembly.AssemblyService;
import bg.jug.academy.assembly.model.AssemblyUnit;

public class VehicleAssemblyService<U extends AssemblyUnit>
	implements AssemblyService<U> {

	@Override
	public U assemble(U unit) {
		unit.assembleUnit();
		return unit;
	}

}
