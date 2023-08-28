package com.example.poc.service3;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "configobject")
public class ListOfObjectProperties {

    private List<Service> services;

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public ListOfObjectProperties(List<Service> services) {
        this.services = services;
    }

    public static class Service {
        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Service(String name, String url) {
            this.name = name;
            this.url = url;
        }

        @Override
        public String toString() {
            return "Service{" +
                    "name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }
}