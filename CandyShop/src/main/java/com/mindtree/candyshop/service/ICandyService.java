package com.mindtree.candyshop.service;


import java.util.List;

import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.exception.service.CandyShopServiceException;

public interface ICandyService {
public List<Candy> getCandyWithStockLessThanFive() throws CandyShopServiceException;
public List<Candy> getAllCandies() throws CandyShopServiceException;
}
