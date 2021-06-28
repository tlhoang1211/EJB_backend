package com.example.backend.model.mapper;

import com.example.backend.entity.Sale;
import com.example.backend.model.dto.SaleDTO;

public class SaleMapper {
    public static SaleDTO saleDTO (Sale sale) {
        SaleDTO tmp = new SaleDTO();
        tmp.setSalesManName(sale.getSalesManName());
        tmp.setSalesManID(sale.getSalesManID());
        tmp.setDOS(sale.getDOS());
        tmp.setProdID(sale.getProdID());
        return tmp;
    }
}
