package com.weison.sbc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "master")
public class MasterByDefaultProperties {
    private String name;
    private String sex;
    private String subject;
    private Integer phone;
    private String address;

}