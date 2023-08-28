package com.example.poc.service3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "config")
public class ListOfMapProperties {

    private List<Map<String, Object>> miscellaneous;

    public List<Map<String, Object>> getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(List<Map<String, Object>> miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public ListOfMapProperties(List<Map<String, Object>> miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    @Override
    public String toString() {
        return "ListOfMapProperties{" +
                "miscellaneous=" + miscellaneous +
                '}';
    }
}
