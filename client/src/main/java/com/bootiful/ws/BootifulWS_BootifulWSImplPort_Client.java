
package com.bootiful.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2016-10-20T16:30:43.762+03:00
 * Generated source version: 3.1.7
 * 
 */
public final class BootifulWS_BootifulWSImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://ws.bootiful.com/", "BootifulWSImplService");

    private BootifulWS_BootifulWSImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BootifulWSImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        BootifulWSImplService ss = new BootifulWSImplService(wsdlURL, SERVICE_NAME);
        BootifulWS port = ss.getBootifulWSImplPort();  
        
        {
        System.out.println("Invoking users...");
        java.util.List<com.bootiful.ws.User> _users__return = port.users();
        System.out.println("users.result=" + _users__return);


        }

        System.exit(0);
    }

}
