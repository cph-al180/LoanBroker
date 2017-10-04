/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Consumer;

/**
 *
 * @author Andreas
 */
public class CreditBureauServiceController {

    private String CreditScoreUrl = "http://138.68.85.24:8080/CreditScoreService/CreditScoreService?wsdl";

    public int GetCreditScore(String SSN) {
        int result =0;
        try { // Call Web Service Operation
            org.bank.credit.web.service.CreditScoreService_Service service = new org.bank.credit.web.service.CreditScoreService_Service();
            org.bank.credit.web.service.CreditScoreService port = service.getCreditScoreServicePort();
            // TODO initialize WS operation arguments here
            java.lang.String ssn = "";
            // TODO process result here
            result = port.creditScore(ssn);
            System.out.println("Result = " + result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        return result;
    }

}
