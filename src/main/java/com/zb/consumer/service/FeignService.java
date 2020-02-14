package com.zb.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(value = "SERVICE-PROVIDER",fallback = FeignHystixService.class)//Feign组件的客户端
public interface FeignService {
    @RequestMapping("/buy")
    public String shopping();
    @RequestMapping("/search")
    public List<Map> search(@RequestParam() Map map);
}
