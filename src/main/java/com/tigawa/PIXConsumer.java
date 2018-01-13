package com.tigawa;

import ihe.iti.pixv3._2007.PIXManagerPortType;
import ihe.iti.pixv3._2007.PIXManagerService;

import javax.xml.ws.BindingProvider;

import org.hl7.v3.ObjectFactory;

public class PIXConsumer {
    public static void main(String[] args) {
    	ObjectFactory ob = new ObjectFactory();
    	PIXManagerService service = new PIXManagerService();
    	
        PIXManagerPortType pixManagerPortSoap12 = service.getPIXManagerPortSoap12();
        BindingProvider bp = (BindingProvider)pixManagerPortSoap12;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://www.aviramsegal.com/ws/sample");
        pixManagerPortSoap12.pixManagerPRPAIN201301UV02(ob.createPRPAIN201301UV02());
    }
}
