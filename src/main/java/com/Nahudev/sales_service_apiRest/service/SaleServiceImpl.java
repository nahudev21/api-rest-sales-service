package com.Nahudev.sales_service_apiRest.service;

import com.Nahudev.sales_service_apiRest.dto.SaleDTO;
import com.Nahudev.sales_service_apiRest.dto.ShoppingCartFromUserClientDTO;
import com.Nahudev.sales_service_apiRest.model.SaleEntity;
import com.Nahudev.sales_service_apiRest.repository.ISaleRepository;
import com.Nahudev.sales_service_apiRest.repository.IShoppingCartClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaleServiceImpl implements ISaleService{

    @Autowired
    private ISaleRepository saleRepository;

    @Autowired
    private IShoppingCartClientRepository shoppingCartClient;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public SaleDTO createSale(Long userId, SaleDTO saleDTO) {

        ShoppingCartFromUserClientDTO shoppingCartFromUserClientDTO =
                shoppingCartClient.getAllProductsFromShoppingCart(userId);

        return null;
    }

    @Override
    public SaleDTO editSale(Long userId, SaleDTO saleDTO) {
        return null;
    }

    @Override
    public void deleteSale(Long id) {

    }

    @Override
    public SaleDTO getSaleByUserId(Long user_id) {
        return null;
    }

    @Override
    public List<SaleDTO> listSaleFromUser(Long user_id) {
        return null;
    }

    public SaleDTO mapOutSaleDTO(SaleEntity saleEntity) {
        return modelMapper.map(saleEntity, SaleDTO.class);
    }

    public SaleEntity mapOutSaleEntity(SaleDTO saleDTO) {
        return modelMapper.map(saleDTO, SaleEntity.class);
    }

}
