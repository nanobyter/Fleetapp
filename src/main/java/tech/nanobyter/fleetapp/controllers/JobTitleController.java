package tech.nanobyter.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nanobyter	
 * Created: 2022-09-07
 *
 */

@Controller
public class JobTitleController {

	@GetMapping("/jobtitles")
	public String getJobTitles() {
		return "jobtitle";
	}
	
}
