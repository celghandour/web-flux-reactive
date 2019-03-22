package org.ceg;

import org.ceg.dao.SocieteRepository;
import org.ceg.dao.TransactionRepository;
import org.ceg.entities.Societe;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class WebFluxReactiveApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebFluxReactiveApplication.class, args);
    }

    @Bean
    CommandLineRunner  start (SocieteRepository societeRepository
            , TransactionRepository transactionRepository){
        return args -> {

            Stream.of("SG","HSBC","Total").forEach(s -> {
                societeRepository.save(new Societe(s, s, 100 + Math.random() * 900))
                .subscribe(soc-> {
                    System.out.println(soc.toString());
                });
            });
        };

    }
}
