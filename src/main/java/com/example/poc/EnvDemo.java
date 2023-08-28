package com.example.poc;

import com.example.poc.model.EnvConfig;
import com.example.poc.service.EnvConfigList;
import com.example.poc.service.EnvConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EnvDemo {


	private static EnvConfigList envConfigList;

	public static void main(String[] args) {
		SpringApplication.run(EnvDemo.class, args);

//		EnvConfigList envConfigList = new EnvConfigList();
//		List<EnvConfig> listadeyml= envConfigList.getEnvConfigList();

//		for (EnvConfig env:listadeyml ){
//			System.out.println(env.getUser().toString());
//		}

	}

}
