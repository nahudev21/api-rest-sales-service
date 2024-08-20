package com.Nahudev.sales_service_apiRest.repository;

import com.Nahudev.sales_service_apiRest.model.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISaleRepository extends JpaRepository<SaleEntity, Long> {
}
