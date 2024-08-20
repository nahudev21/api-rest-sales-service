package com.Nahudev.sales_service_apiRest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartFromUserClientDTO {

    private List<ShoppingCartClientDTO> addedProducts;

}
