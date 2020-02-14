package com.zb.consumer.controller;

import com.zb.consumer.service.ClientService;
import com.zb.consumer.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;
    @Autowired
    FeignService feignService;
    @RequestMapping("/shopping")
    @ResponseBody
    public String shopping(){
        return feignService.shopping();
    }
    @RequestMapping("/search")
    public String  search(Model model, @RequestParam() Map map){
        model.addAttribute("user",feignService.search(map));
        return "list";
    }
}
