package org.motaouia.demo.controllers;

import java.util.List;

import org.motaouia.demo.models.Product;
import org.motaouia.demo.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	private IProductService productService;

	@GetMapping(value = "/index")
	public String viewHomePage(Model model) {
		List<Product> listAllProducts = productService.listAll();
		model.addAttribute("listProds", listAllProducts);
		return "index";
	}

	@GetMapping(value = "/new")
	public String showNewProductPage(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "newProduct";
	}

	@PostMapping(value = "/save")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.save(product);
		return "redirect:/index";
	}

	@GetMapping(value = "/edit/{id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("edit_product");
		Product product = productService.get(id);
		mav.addObject("produit", product);
		return mav;
	}

	@GetMapping(value = "/delete/{id}")
	public String deleteProduct(@PathVariable(name = "id") int id) {
		productService.delete(id);
		return "redirect:/index";
	}
}