package com.weison.sbc.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@PropertySource(value = "classpath:application-dev.properties")
public class MasterByDevProperties {

    @Value("${master.name}")
    private String name;
    @Value("${master.sex}")
    private String sex;
    @Value("${master.subject}")
    private String subject;
    @Value("${master.phone}")
    private Integer phone;
    @Value("${master.address}")
    private String address;
}
