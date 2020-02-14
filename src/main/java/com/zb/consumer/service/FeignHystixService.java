package com.zb.consumer.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FeignHystixService implements FeignService {
    @Override
    public String shopping() {
        return "Sorry,the remote service is not available";
    }

    @Override
    public List<Map> search(Map map) {
        return null;
    }
}
