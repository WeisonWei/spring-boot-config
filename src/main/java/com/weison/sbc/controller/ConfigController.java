package com.weison.sbc.controller;

import com.weison.sbc.config.AliPayConfigEx;
import com.weison.sbc.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    ConfigService configService;

    @GetMapping("/configs")
    public AliPayConfigEx getConfig() {
        return configService.getAliPayConfigEx();
    }
}
