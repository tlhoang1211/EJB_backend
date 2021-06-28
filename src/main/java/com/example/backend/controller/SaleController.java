package com.example.backend.controller;

import com.example.backend.model.dto.SaleDTO;
import com.example.backend.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/sales")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping("/find-all")
    public List<SaleDTO> findAll (){
        return saleService.findAll();
    }


    @GetMapping("/seeding")
    public String seeding (){
        return saleService.seeding();
    }
}
