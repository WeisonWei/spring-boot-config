package com.weison.sbc.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@ToString
@Data
@Configuration
@ConfigurationProperties(prefix = "alipay")
public class AliPayConfigEx {

    @Autowired
    private AliPayConfig ai;

    private AliPayConfig write;

    private AliPayConfig college;

}
