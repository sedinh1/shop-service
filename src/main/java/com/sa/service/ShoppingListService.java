package com.sa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sa.model.ShoppingList;
import com.sa.repository.ShoppingListRepository;

@Service
public class ShoppingListService implements IShoppingListService {

    @Autowired
    private ShoppingListRepository repo;

    @Override
    public List<ShoppingList> findAll() {

        List<ShoppingList> shoppinglist = (List<ShoppingList>) repo.findAll();
        
        return shoppinglist;
    }
}