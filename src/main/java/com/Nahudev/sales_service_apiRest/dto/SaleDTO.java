package com.Nahudev.sales_service_apiRest.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {

    private Long id;

    private String nameSaleFromUser;

    private String userEmail;

    private String userDni;

    private Long userId;

    private String sellerName;

    private String iva;

    private String issueDate;

    private Double totalPrice;

    private List<String> products;

}
