package com.sa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sa.model.ShoppingList;

@Repository
public interface ShoppingListRepository extends CrudRepository<ShoppingList, Long> {

}
