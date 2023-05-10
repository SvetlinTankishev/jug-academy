package bg.jug.academy.assembly;

import bg.jug.academy.assembly.model.AssemblyUnit;
import bg.jug.academy.assembly.model.Part;

public interface AssemblyService {

	public AssemblyUnit assemble(Part[] parts);
	
}
