package com.example.poc.model;


public class EnvConfig {

    private String dev;
    private String user;
    private String pass;
    private String url;
    private String client;
    private String secret;

    public EnvConfig() {
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }


    public EnvConfig(String env, String dev, String user, String pass, String url, String client, String secret) {
        this.dev = dev;
        this.user = user;
        this.pass = pass;
        this.url = url;
        this.client = client;
        this.secret = secret;
    }
}
