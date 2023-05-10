package bg.jug.academy.assembly;

import bg.jug.academy.assembly.model.AssemblyUnit;

public interface AssemblyService<U extends AssemblyUnit> {

	public U assemble(U unit);
	
}
