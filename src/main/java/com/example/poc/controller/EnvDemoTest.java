package com.example.poc.controller;


import com.example.poc.model.EnvConfig;
import com.example.poc.model.TestConfig;
import com.example.poc.service.EnvConfigService;
import com.example.poc.service3.ListOfMapProperties;
import com.example.poc.service3.ListOfObjectProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnvDemoTest {

  //
   // EnvConfigService envConfigObject;
    //@Autowired
    //TestConfig testConfig;

    @Autowired
    ListOfObjectProperties listOfObjectProperties;

    @Autowired
    ListOfMapProperties listOfMapProperties;
    @GetMapping("/test")
    public String postMessage(){

        System.out.println(listOfMapProperties.toString());


        for (ListOfObjectProperties.Service listToIterate : listOfObjectProperties.getServices()) {
            System.out.println(listToIterate.toString());

            if (listToIterate.getName().contains("data-service")){
                System.out.println("YA CHINGAMOS");
            }
        }

        //System.out.println(testConfig.getParametroValor());

        //System.out.println(envConfigObject.toString());
       // System.out.println(envConfigObject.toString());
//
//        List<EnvConfig> envConfigList = envConfigService.getEnvConfigList();
//        for (EnvConfig envConfig : envConfigList) {
//            System.out.println("Environment: " + envConfig.getUrl());
//            System.out.println("Development: " + envConfig.getDev());
//        }

        return "Hola Paco";
    }

//      for (EnvConfig env: envConfigList){
//          System.out.println(env.getUser());
//      }
//            return "ok ok ok ok";
//        }
}
