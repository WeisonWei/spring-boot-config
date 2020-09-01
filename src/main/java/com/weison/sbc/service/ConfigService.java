package com.weison.sbc.service;

import com.weison.sbc.config.AliPayConfigEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigService {

    @Autowired
    AliPayConfigEx aliPayConfigEx;

    public AliPayConfigEx getAliPayConfigEx() {
        return aliPayConfigEx;
    }
}
