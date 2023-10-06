package com.example.SpringBootExemple.service;

import com.example.SpringBootExemple.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {

    List<Laptop> laptops = new ArrayList<>();

    {
        Laptop l1 = new Laptop("Lenovo",2359.99);
        Laptop l2 = new Laptop("HP", 2349.00);

        laptops.add(l1);
        laptops.add(l2);
    }

    public List<Laptop> getLaptops(){
        return laptops;
    }

    public Optional<Laptop> getLaptopByName(String name){
        return  laptops.stream().filter(l->l.getNume().equals(name)).findFirst();
    }

    public boolean addNewLaptop(Laptop laptop){
        return laptops.add(laptop);
    }
}
