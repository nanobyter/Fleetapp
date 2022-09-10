package tech.nanobyter.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.nanobyter.fleetapp.models.Country;
import tech.nanobyter.fleetapp.repositories.CountryRepository;

/**
 * @author nanobyter Created: 2022-09-07
 *
 */

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;

	// Return list of countries
	public List<Country> getCountries() {
		return countryRepository.findAll();
	}

	// Save new country
	public void save(Country country) {
		countryRepository.save(country);
	}
}
