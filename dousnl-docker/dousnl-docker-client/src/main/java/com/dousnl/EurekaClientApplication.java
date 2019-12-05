package com.dousnl;

import com.dousnl.fegin.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.dousnl.*"})
@EnableFeignClients
@RestController
public class EurekaClientApplication {

	@Value("${server.port}")
	private String port;

	@Autowired
	private UserClient userClient;
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
	@RequestMapping("/hi")
	public String home(@RequestParam String name){
		return "hi "+name+",i am from port:" +port;
	}

	@RequestMapping("/user")
	public String user(){
		return userClient.getUser();
	}
}
