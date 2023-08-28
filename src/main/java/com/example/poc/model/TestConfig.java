package com.example.poc.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class TestConfig {

    private String test = "TEST";
    private static final String variable = "DEV";

//    @Value("${environment."+variable+".url}")
//    private String parametroValor;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

//    public String getParametroValor() {
//        return parametroValor;
//    }
//
//    public void setParametroValor(String parametroValor) {
//        this.parametroValor = parametroValor;
//    }
}
