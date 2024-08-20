package com.Nahudev.sales_service_apiRest.repository;

import com.Nahudev.sales_service_apiRest.dto.UserClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userClient", url = "http://localhost:8083/users")
public interface IUserClientRepository {

    @GetMapping("/getUser/{userId}")
    public UserClientDTO getUserById(@PathVariable(name = "userId") Long userId);

}
