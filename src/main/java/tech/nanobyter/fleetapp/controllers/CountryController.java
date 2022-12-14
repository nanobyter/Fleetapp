package tech.nanobyter.fleetapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tech.nanobyter.fleetapp.models.Country;
import tech.nanobyter.fleetapp.services.CountryService;

/**
 * @author nanobyter Created: 2022-09-07
 *
 */

@Controller
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/countries")
	public String getCountries(Model model) {
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);
		return "country";
	}

	@PostMapping("/countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}

	@RequestMapping(value = "/countries/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}

}
