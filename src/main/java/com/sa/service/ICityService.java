package com.sa.service;

import java.util.List;

import com.sa.model.City;

public interface ICityService {

    public List<City> findAll();
    public City findById(Long id);
}
