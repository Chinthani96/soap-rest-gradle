package com.soapservice.soaprestgradle.service;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.math.BigDecimal;

public class NumberClient extends WebServiceGatewaySupport {

    public com.dataaccess.webservicesserver.NumberToDollarsResponse getDollars(int num) {
        com.dataaccess.webservicesserver.NumberToDollars numberToDollars = new com.dataaccess.webservicesserver.NumberToDollars();
        numberToDollars.setDNum(BigDecimal.valueOf(num));

        return (com.dataaccess.webservicesserver.NumberToDollarsResponse) getWebServiceTemplate().marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/NumberConversion.wso", numberToDollars);
    }
}
