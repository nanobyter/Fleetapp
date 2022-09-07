/**
 * 
 */
package tech.nanobyter.fleetapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
* @author nanobyter 
* Created: Sep 7, 2022
*
*/

@Controller
public class ApplicationController {

	@GetMapping("/index")
	public String goHome() {
		return "index";
	}

}
