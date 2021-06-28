package com.example.backend.service;

import com.example.backend.entity.Sale;
import com.example.backend.model.dto.SaleDTO;
import com.example.backend.model.mapper.SaleMapper;
import com.example.backend.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;


    // find all
    public List<SaleDTO> findAll(){
        List<Sale> sales = saleRepository.findAll();
        List<SaleDTO> saleDTOS = new ArrayList<>();

        for (Sale item : sales) {
            saleDTOS.add(SaleMapper.saleDTO(item));
        }
        return saleDTOS;
    }

    // seeding hard code
    public String seeding() {
        List<Sale> sales = new ArrayList<>();
        sales.add(new Sale(1,1, "a", "01/01/2021", 1));
        sales.add(new Sale(2,2, "b", "02/01/2021", 2));
        sales.add(new Sale(3,3, "c", "03/01/2021", 3));
        sales.add(new Sale(4,4, "d", "04/01/2021", 4));
        sales.add(new Sale(5,5, "e", "05/01/2021", 5));
        sales.add(new Sale(6,6, "f", "06/01/2021", 6));
        sales.add(new Sale(7,7, "g", "07/01/2021", 7));
        sales.add(new Sale(8,8, "h", "08/01/2021", 8));
        sales.add(new Sale(9,9, "i", "09/01/2021", 9));
        sales.add(new Sale(10,10, "k", "10/01/2021", 10));


        saleRepository.saveAll(sales);

        return "OK";
    }

}
