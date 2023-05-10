package bg.jug.academy.assembly;

import bg.jug.academy.assembly.model.units.Car;
import bg.jug.academy.assembly.services.VehicleAssemblyService;

public class Main {

	public static void main(String[] args) {
		
		VehicleAssemblyService<Car> carAssemblyService 
			= new VehicleAssemblyService<>();
		Car car = carAssemblyService.assemble(new Car());
	}
	
}
