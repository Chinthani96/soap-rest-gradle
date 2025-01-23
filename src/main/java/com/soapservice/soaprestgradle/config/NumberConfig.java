package com.soapservice.soaprestgradle.config;

import com.soapservice.soaprestgradle.service.NumberClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class NumberConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller();
        jaxb2Marshaller.setContextPath("wsdl");
        return jaxb2Marshaller;
    }

    @Bean
    public NumberClient config(Jaxb2Marshaller marshaller) {
        NumberClient numberClient = new NumberClient();
        numberClient.setMarshaller(marshaller);
        numberClient.setUnmarshaller(marshaller);
        return numberClient;
    }
}
