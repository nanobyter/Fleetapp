package tech.nanobyter.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nanobyter Created: 2022-09-07
 *
 */

@Controller
public class InvoiceController {

	@GetMapping("/invoices")
	public String getInvoices() {
		return "invoice";
	}

}
