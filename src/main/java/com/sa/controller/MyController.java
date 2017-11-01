package com.sa.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sa.model.City;
import com.sa.model.ShoppingList;
import com.sa.service.ICityService;
import com.sa.service.IShoppingListService;

@RestController
public class MyController {
    
    @Autowired
    ICityService cityService;
    @Autowired
    IShoppingListService shoppingListService;

    @RequestMapping("/cities")
    public List<City> findCities() {
        
        List<City> cities = (List<City>) cityService.findAll();
        return cities;
    }
    @RequestMapping("/shoppinglist")
    public List<ShoppingList> getShoppingList() {
        
        List<ShoppingList> shoppinglist = (List<ShoppingList>) shoppingListService.findAll();
        return shoppinglist ;
    }

    @RequestMapping("/cities/{userId}")
    public City findCity(@PathVariable Long userId) {
        
        City city = cityService.findById(userId);
        return city;
    }
}
