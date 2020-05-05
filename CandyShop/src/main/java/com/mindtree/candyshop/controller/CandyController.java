package com.mindtree.candyshop.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.mindtree.candyshop.exception.CandyShopException;
import com.mindtree.candyshop.service.ICandyService;

@Controller
public class CandyController {
	@Autowired
	private ICandyService candyservice;
	@GetMapping("/candy")
	public String getCandyWithStockLessThanFive(Model model) throws CandyShopException
	{
		model.addAttribute("candyList",candyservice.getCandyWithStockLessThanFive());
		return "index";
	}
	
}
