package com.soapservice.soaprestgradle.service;


import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import wsdl.NumberToDollars;
import wsdl.NumberToDollarsResponse;

import java.math.BigDecimal;

public class NumberClient extends WebServiceGatewaySupport {

    public NumberToDollarsResponse getDollars(int num) {
        NumberToDollars numberToDollars = new NumberToDollars();
        numberToDollars.setDNum(BigDecimal.valueOf(num));

        return (NumberToDollarsResponse) getWebServiceTemplate().marshalSendAndReceive("https://www.dataaccess.com/webservicesserver/NumberConversion.wso", numberToDollars);
    }
}
