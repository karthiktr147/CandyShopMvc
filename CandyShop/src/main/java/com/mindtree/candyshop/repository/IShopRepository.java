package com.mindtree.candyshop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.candyshop.entity.Shop;

@Repository
public interface IShopRepository extends JpaRepository<Shop, Integer> {
	Optional<Shop> findByshopName(String shopName);
}
