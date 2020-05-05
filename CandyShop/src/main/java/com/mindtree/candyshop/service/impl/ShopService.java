package com.mindtree.candyshop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.entity.Shop;
import com.mindtree.candyshop.exception.service.CandyShopServiceException;
import com.mindtree.candyshop.exception.service.LessQuantityException;
import com.mindtree.candyshop.exception.service.NoSuchCandyException;
import com.mindtree.candyshop.exception.service.NoSuchShopException;
import com.mindtree.candyshop.repository.ICandyRepository;
import com.mindtree.candyshop.repository.IShopRepository;
import com.mindtree.candyshop.service.IShopService;

@Service
public class ShopService implements IShopService {

	@Autowired
	private ICandyRepository candyRepository;
	@Autowired
	private IShopRepository shopRepository;
	

	@Override
	public float purchaseCandy(int candyId, int quantity) throws CandyShopServiceException {
		Candy candy = candyRepository.findById(candyId)
				.orElseThrow(() -> new NoSuchCandyException("No Such candy is present"));
		float price = 0;
		if (quantity <= candy.getStock()) {
			int newStock = candy.getStock() - quantity;
			candy.setStock(newStock);
			candyRepository.save(candy);
			price = quantity * candy.getPrice();
			price = (float) price + (float) price * (14 / 100);
		} else
			throw new LessQuantityException("the stock is less than the given quantity");
		return price;
	}

	@Override
	public List<Candy> getCandyByShop(int shopId) throws NoSuchShopException {
		List<Candy> list = new ArrayList<Candy>();
		list = candyRepository.findAll();
		List<Candy> list1 = list.stream().filter(c -> c.getShop().getShopId() == shopId).collect(Collectors.toList());
		return list1;
	}

	@Override
	public List<Shop> getAllShop() throws CandyShopServiceException {
		
		return shopRepository.findAll();
	}

}
