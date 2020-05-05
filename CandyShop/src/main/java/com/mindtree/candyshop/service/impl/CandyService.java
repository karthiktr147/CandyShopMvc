package com.mindtree.candyshop.service.impl;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.exception.service.CandyShopServiceException;
import com.mindtree.candyshop.repository.ICandyRepository;
import com.mindtree.candyshop.service.ICandyService;

@Service
public class CandyService implements ICandyService {
	@Autowired
	private ICandyRepository candyRepository;

	@Override
	public List<Candy> getCandyWithStockLessThanFive() throws CandyShopServiceException {

		List<Candy> list = candyRepository.findAll();
		List<Candy> list1 = list.stream().filter(candy -> candy.getStock() <= 5).collect(Collectors.toList());
		return list1;

	}

	@Override
	public List<Candy> getAllCandies() throws CandyShopServiceException {
		return candyRepository.findAll();
	}

	

}
