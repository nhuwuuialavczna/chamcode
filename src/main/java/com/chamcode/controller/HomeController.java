package com.chamcode.controller;

import com.chamcode.model.Monhoc;
import com.chamcode.service.MonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {

    @Autowired
    MonHocService monHocService;

    @RequestMapping(value = "/")
    public String Index() {
        Monhoc monhoc = new Monhoc();
        monhoc.setMamonhoc("vz");
        monhoc.setTenmonhoc("hau");

        System.out.println(monHocService.getAll());
        System.out.println(monHocService.add(monhoc));
        System.out.println(monHocService.getMonhoc("vz"));
        return "Index";
    }
}
