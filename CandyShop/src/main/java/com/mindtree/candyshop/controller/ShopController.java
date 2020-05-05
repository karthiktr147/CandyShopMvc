package com.mindtree.candyshop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.exception.CandyShopException;
import com.mindtree.candyshop.service.ICandyService;
import com.mindtree.candyshop.service.IShopService;

@Controller
public class ShopController {
	@Autowired
	private IShopService shopservice;
	@Autowired
	private ICandyService candyService;
static int quantity1;
static int candy;
	@GetMapping(path = "/purchasecandy")
	public String purchaseCandy(Model model,@RequestParam int candyId, @RequestParam int quantity)
			throws CandyShopException {
		quantity1=quantity;
		candy=candyId;
		model.addAttribute("price",shopservice.purchaseCandy(candy, quantity1));
		return "DisplayPrice";
	}
	@GetMapping(path = "/candylist")
	public String getAllCandies(Model model)
			throws CandyShopException {
		
		model.addAttribute("candies",candyService.getAllCandies());
		return "index";
	}
	@GetMapping("/shoplist")
	public String shoplist(Model model) throws CandyShopException {

		model.addAttribute("shoplist",shopservice.getAllShop());
	return "index";
		
	}
	@GetMapping("/getcandybyshopid")
	public String getCandyByShop(Model model,@RequestParam int shopId) throws CandyShopException {
		List<Candy> candyList=shopservice.getCandyByShop(shopId);
		if(candyList.size()!=0)
		{
		model.addAttribute("candies",candyList);
	return "GetCandyByShop";
		}
		return "NoCandiesInShop";
		
	}
}
