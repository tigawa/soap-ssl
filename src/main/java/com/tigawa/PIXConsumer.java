package com.tigawa;

import static com.tigawa.PIXManager.ENDPOINT_URL_SSL;
import static javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY;
import ihe.iti.pixv3._2007.PIXManagerPortType;
import ihe.iti.pixv3._2007.PIXManagerService;

import javax.xml.ws.BindingProvider;

import org.hl7.v3.MCCIIN000002UV01;
import org.hl7.v3.ObjectFactory;

public class PIXConsumer {
	
	public static void main(String[] args) {
		ObjectFactory ob = new ObjectFactory();
		PIXManagerService service = new PIXManagerService();

		PIXManagerPortType pixManager = service.getPIXManagerPortSoap12();
		BindingProvider bp = (BindingProvider) pixManager;
//		bp.getRequestContext().put(ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);
		bp.getRequestContext().put(ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL_SSL);
		
		System.out.println("client start");
		MCCIIN000002UV01 prpain201301uv02 = pixManager
				.pixManagerPRPAIN201301UV02(ob.createPRPAIN201301UV02());
		String root = prpain201301uv02.getId().getRoot();
		System.out.println("client end =[" + root + "]");
	}
}
