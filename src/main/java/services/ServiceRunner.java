/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.xml.ws.Endpoint;

public class ServiceRunner {
    
	public static void main(String[] args) {
            String url = "http://localhost:1234/SOAPService";
            Endpoint.publish(url, new SOAPService());
            System.out.println("Service started @ " + url);
	}
}
    