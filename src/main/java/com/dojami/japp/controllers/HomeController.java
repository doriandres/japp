package com.dojami.japp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dojami.japp.data.Product;
import com.dojami.japp.repositories.ProductRepository;

@Controller  
public class HomeController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")  
    public String Index(Model model){

        Iterable<Product> productList = productRepository.findAll();
        model.addAttribute("productList", productList);

        return "index";
    }
}