package com.example.getip.controller;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;

@RestController
public class IpController {

    @PostMapping("/report-ipv6")
    public String receiveIpv6(@RequestBody IpRequest ipRequest) {
        // 模拟保存：打印到控制台（也可存 DB、写文件）
        System.out.println("收到 IPv6：" + ipRequest.getIpv6() + " 时间：" + LocalDateTime.now());
        return "已接收 IPv6 地址：" + ipRequest.getIpv6();
    }

    public static class IpRequest {
        private String ipv6;

        public String getIpv6() {
            return ipv6;
        }

        public void setIpv6(String ipv6) {
            this.ipv6 = ipv6;
        }
    }
}
