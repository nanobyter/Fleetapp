/**
 * 
 */
package tech.nanobyter.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nanobyter
 *
 *	2022-09-07
 */

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String goHome() {
		return "index";
	}
	
}
