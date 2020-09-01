package com.weison.sbc.config;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ToString
@Data
@Configuration
@ConfigurationProperties(prefix = "alipay")
public class AliPayConfig {

    private String payUrl;

    private String returnUrl;

    private String notifyUrl;

    private String appId;

    private String appPrivateKey;

    private String alipayPublicKey;

}
