package com.Nahudev.sales_service_apiRest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserClientDTO {

    private Long id;

    private String name;

    private String lastName;

    private String email;

    private String dni;

    private Date birthdate;

}
