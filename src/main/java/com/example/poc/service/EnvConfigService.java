package com.example.poc.service;

import com.example.poc.model.EnvConfig;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvConfigService {
    private final EnvConfigList envConfigList;

    public EnvConfigService(EnvConfigList envConfigList) {
        this.envConfigList = envConfigList;
    }

    public List<EnvConfig> getEnvConfigList() {
        return envConfigList.getEnvConfigList();
    }
}

