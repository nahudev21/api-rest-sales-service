package com.Nahudev.sales_service_apiRest.repository;

import com.Nahudev.sales_service_apiRest.dto.ShoppingCartFromUserClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "shoppingCartClient", url = "http://localhost:8082/shoppingCart")
public interface IShoppingCartClientRepository {

    @GetMapping("/user")
    public ShoppingCartFromUserClientDTO getAllProductsFromShoppingCart(@RequestParam(value = "userId") Long userId);

}
