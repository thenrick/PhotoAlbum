package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class Application2 {

    private static final Logger log = LoggerFactory.getLogger(Application2.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Photo[] photo = restTemplate.getForObject("https://jsonplaceholder.typicode.com/photos?albumId=" + args[0], Photo[].class);
        for (Photo pht : photo){
//        	log.info(pht.toString());
        	System.out.println("[" + pht.getId() + "]" + pht.getTitle());
          }

    }
}