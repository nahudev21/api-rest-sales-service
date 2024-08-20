package com.Nahudev.sales_service_apiRest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ventas")
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_usuario")
    private String nameSaleFromUser;

    @Column(name = "usuario_email")
    private String userEmail;

    @Column(name = "usuario_dni")
    private String userDni;

    @Column(name = "usuario_id")
    private Long userId;

    @Column(name = "nombre_vendedor")
    private String sellerName;

    @Column(name = "iva")
    private String iva;

    @Column(name = "fecha_emision")
    private Date issueDate;

    @Column(name = "precio_total")
    private Double totalPrice;

    @Column(name = "productos")
    private List<String> products;

}
