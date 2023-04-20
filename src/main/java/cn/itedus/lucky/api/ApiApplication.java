package cn.itedus.lucky.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description: API Application
 * @author: Lucky
 * @date: 2021/12/18
 * @github: Lucky
 * @Copyright: Lucky
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
