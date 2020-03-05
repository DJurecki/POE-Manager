package com.jurecki.poemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PoeManagerApplication {

    //private static final Logger log = LoggerFactory.getLogger(PoeManagerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PoeManagerApplication.class, args);
    }

   /* @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception{
        return args -> {
            League quote = restTemplate.getForObject("http://api.pathofexile.com/leagues/Standard", League.class);
            System.out.println(quote.toString());
        };
    }*/

}
