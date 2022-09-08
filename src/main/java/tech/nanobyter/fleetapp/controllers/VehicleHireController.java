package tech.nanobyter.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nanobyter Created: 2022-09-07
 *
 */

@Controller
public class VehicleHireController {

	@GetMapping("/vehiclehires")
	public String getVehicleHires() {
		return "vehiclehire";
	}

}
