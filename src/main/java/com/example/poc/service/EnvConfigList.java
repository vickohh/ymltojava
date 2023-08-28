package com.example.poc.service;

import com.example.poc.model.EnvConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@ConfigurationProperties(prefix = "environment")
@Configuration
public class EnvConfigList {
    private  List<EnvConfig> envConfigList;

    public  List<EnvConfig> getEnvConfigList() {
        return envConfigList;
    }
    public void setEnvConfigList(List<EnvConfig> envConfigList) {
        this.envConfigList = envConfigList;
    }
    public EnvConfigList() {
        this.envConfigList = envConfigList;
    }
}
