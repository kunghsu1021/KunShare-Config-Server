package cn.com.kun.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class KunShareConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KunShareConfigServerApplication.class, args);
	}

}
