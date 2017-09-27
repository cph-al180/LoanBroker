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
    
    public int GetCreditScore(String SSN){
        return 0;
    }
    
}
