package com.Nahudev.sales_service_apiRest.service;

import com.Nahudev.sales_service_apiRest.dto.SaleDTO;
import com.Nahudev.sales_service_apiRest.dto.ShoppingCartClientDTO;
import com.Nahudev.sales_service_apiRest.dto.ShoppingCartFromUserClientDTO;
import com.Nahudev.sales_service_apiRest.dto.UserClientDTO;
import com.Nahudev.sales_service_apiRest.exceptions.ResourceNotFoundException;
import com.Nahudev.sales_service_apiRest.model.SaleEntity;
import com.Nahudev.sales_service_apiRest.repository.ISaleRepository;
import com.Nahudev.sales_service_apiRest.repository.IShoppingCartClientRepository;
import com.Nahudev.sales_service_apiRest.repository.IUserClientRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SaleServiceImpl implements ISaleService{

    @Autowired
    private ISaleRepository saleRepository;

    @Autowired
    private IUserClientRepository userClient;

    @Autowired
    private IShoppingCartClientRepository shoppingCartClient;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public SaleDTO createSale(Long userId, SaleDTO saleDTO) {

        UserClientDTO userFound = userClient.getUserById(userId);

        ShoppingCartFromUserClientDTO listProductsFound = shoppingCartClient.getAllProductsFromShoppingCart(userId);
        List<ShoppingCartClientDTO> products = listProductsFound.getAddedProducts();
        List<String> nameProducts = new ArrayList<String>();
        double totalPrice = 0;

        for (ShoppingCartClientDTO shoppingCartClientDTO : products) {
            nameProducts.add(shoppingCartClientDTO.getNameProduct());

            double additionPrice;
            additionPrice = totalPrice + shoppingCartClientDTO.getPrice();
            totalPrice = additionPrice;
        }

        Date todayDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String currentDate = sdf.format(todayDate);

        SaleEntity saleEntity = new SaleEntity();
        saleEntity.setNameSaleFromUser(userFound.getName() + " " + userFound.getLastName());
        saleEntity.setUserEmail(userFound.getEmail());
        saleEntity.setUserDni(userFound.getDni());
        saleEntity.setUserId(userFound.getId());
        saleEntity.setSellerName(saleDTO.getSellerName());
        saleEntity.setIva(saleDTO.getIva());
        saleEntity.setIssueDate(currentDate);
        saleEntity.setTotalPrice(totalPrice);
        saleEntity.setProducts(nameProducts);
        saleRepository.save(saleEntity);

        return mapOutSaleDTO(saleEntity);
    }

    @Override
    public SaleDTO editSale(Long userId, SaleDTO saleDTO) {
        return null;
    }

    @Override
    public void deleteSale(Long id) {

    }

    @Override
    public SaleDTO getSaleByUser(Long id) {
        SaleEntity saleFound = saleRepository.findById(id).orElseThrow(() -> new
                ResourceNotFoundException("Venta", "id", id));

        return mapOutSaleDTO(saleFound);
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
