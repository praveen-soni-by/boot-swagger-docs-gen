package com.blueyonder.plat.dp.bydm.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @PostMapping(path = {"/udpate"})
    public ContactType delete(@RequestBody ContactType contactType) {
        return null;
    }

}