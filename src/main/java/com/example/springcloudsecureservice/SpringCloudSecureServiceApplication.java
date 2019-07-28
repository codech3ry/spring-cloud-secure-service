package com.example.springcloudsecureservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
@EnableResourceServer
public class SpringCloudSecureServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSecureServiceApplication.class, args);
    }

    @GetMapping("/tolldata")
    public List<TollUsage> getTollData() {
        TollUsage instance1 = new TollUsage("100", "station150", "B65GT1W", "2019-06-24T07:38:52Z");
        TollUsage instance2 = new TollUsage("101", "station119", "AHY87DW", "2019-05-08T21:02:01Z");
        TollUsage instance3 = new TollUsage("102", "station152", "BHD258J", "2019-04-16T16:41:35Z");

        return Arrays.asList(instance1, instance2, instance3);
    }

    public class TollUsage {

        public String id;
        public String stationId;
        public String licensePlate;
        public String timestamp;

        public TollUsage() {
        }

        public TollUsage(String id, String stationId, String licensePlate, String timestamp) {
            this.id = id;
            this.stationId = stationId;
            this.licensePlate = licensePlate;
            this.timestamp = timestamp;
        }
    }

}
