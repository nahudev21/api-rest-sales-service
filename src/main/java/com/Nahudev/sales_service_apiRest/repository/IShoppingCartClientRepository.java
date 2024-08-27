package com.Nahudev.sales_service_apiRest.repository;

import com.Nahudev.sales_service_apiRest.dto.ShoppingCartFromUserClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "shoppingCart-service-apiRest")
public interface IShoppingCartClientRepository {

    public String URL = "/shoppingCart";

    @GetMapping(URL + "/user")
    public ShoppingCartFromUserClientDTO getAllProductsFromShoppingCart(@RequestParam(value = "userId") Long userId);

    @DeleteMapping(URL + "/deleteShoppingCart/{userId}")
    public String deleteShoppingCart(@PathVariable(name = "userId") Long userId);
}
