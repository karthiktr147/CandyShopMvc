package com.mindtree.candyshop.service;

import java.util.List;

import com.mindtree.candyshop.entity.Candy;
import com.mindtree.candyshop.entity.Shop;
import com.mindtree.candyshop.exception.service.CandyShopServiceException;

public interface IShopService {
public float purchaseCandy(int candyId,int quantity) throws CandyShopServiceException;
public List<Candy> getCandyByShop(int shopId)throws CandyShopServiceException;
public List<Shop> getAllShop()throws CandyShopServiceException;
}
