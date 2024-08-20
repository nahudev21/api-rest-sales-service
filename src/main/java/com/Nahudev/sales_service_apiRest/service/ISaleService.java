package com.Nahudev.sales_service_apiRest.service;

import com.Nahudev.sales_service_apiRest.dto.SaleDTO;

import java.util.List;

public interface ISaleService {

    public SaleDTO createSale(Long userId, SaleDTO saleDTO);

    public SaleDTO editSale(Long userId, SaleDTO saleDTO);

    public void deleteSale(Long id);

    public SaleDTO getSaleByUser(Long id);

    public List<SaleDTO> listSaleFromUser(Long user_id);

}
