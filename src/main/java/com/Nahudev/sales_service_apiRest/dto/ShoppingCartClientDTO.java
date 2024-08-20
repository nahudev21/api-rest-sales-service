package com.Nahudev.sales_service_apiRest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartClientDTO {

    private Long id;

    private String nameCompleteUser;

    private Long userId;

    private String nameProduct;

    private int amount;

    private Double price;

}
