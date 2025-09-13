package com.example.getip.controller;

import org.springframework.web.bind.annotation.*;
//开发分支


//测试
@RestController
@RequestMapping("/api")
public class IpController {

    @PostMapping("/ipv6")
    public String receiveIpv6(@RequestBody IpRequest ipRequest) {
        String ipv6 = ipRequest.getIp();
        System.out.println("从客户端接收到的IPv6地址: " + ipv6);
        return "IPv6地址已接收: " + ipv6;
    }

    // 静态内部类用于接收JSON数据
    static class IpRequest {
        private String ip;

        // Getter和Setter
        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
    }
}