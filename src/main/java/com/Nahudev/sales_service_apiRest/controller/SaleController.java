package com.Nahudev.sales_service_apiRest.controller;

import com.Nahudev.sales_service_apiRest.dto.SaleDTO;
import com.Nahudev.sales_service_apiRest.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private ISaleService saleService;

    @PostMapping("/create/{userId}")
    public ResponseEntity<SaleDTO> createSale(@PathVariable(name = "userId") Long userId,
                                              @RequestBody SaleDTO saleDTO) {

        return new ResponseEntity<>(saleService.createSale(userId, saleDTO), HttpStatus.CREATED);

    }

    @GetMapping("/getSaleByUser/{id}")
    @ResponseBody
    public ResponseEntity<SaleDTO> getSaleByUser(@PathVariable(name = "id") Long id) {
        return new ResponseEntity<>(saleService.getSaleByUser(id), HttpStatus.OK);
    }

}
