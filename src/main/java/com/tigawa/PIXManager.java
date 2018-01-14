package com.tigawa;

import ihe.iti.pixv3._2007.PIXManagerPortType;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.soap.SOAPBinding;
import javax.xml.ws.BindingType;
import javax.xml.ws.Endpoint;

import org.hl7.v3.II;
import org.hl7.v3.MCCIIN000002UV01;
import org.hl7.v3.ObjectFactory;
import org.hl7.v3.PRPAIN201301UV02;
import org.hl7.v3.PRPAIN201302UV02;
import org.hl7.v3.PRPAIN201304UV02;
import org.hl7.v3.PRPAIN201309UV02;
import org.hl7.v3.PRPAIN201310UV02;

@WebService(
        portName = "pixManagerPortSoap12",
        serviceName = "PIXManager",
        targetNamespace = "http://localhost:9999/PIXManager",
        endpointInterface = "ihe.iti.pixv3._2007.PIXManagerPortType") // (1)
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
@XmlSeeAlso({ ObjectFactory.class })
public class PIXManager implements PIXManagerPortType {

	public static final String ENDPOINT_URL = "http://localhost:9999/PIXManager";
	public static final String ENDPOINT_URL_SSL = "https://localhost:9999/PIXManager";
	private static ObjectFactory of = new ObjectFactory();
	
	public static void main(String[] args) {
		System.out.println("server - start!!");
		Endpoint.publish(ENDPOINT_URL, new PIXManager());
	}

	@WebMethod(operationName = "PIXManager_PRPA_IN201301UV02", action = "urn:hl7-org:v3:PRPA_IN201301UV02")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	public MCCIIN000002UV01 pixManagerPRPAIN201301UV02(
			@WebParam(name = "PRPA_IN201301UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body") PRPAIN201301UV02 body) {
		System.out.println("通ったよ！");
		
		MCCIIN000002UV01 mcciin000002uv01 = of.createMCCIIN000002UV01();
		II ii = of.createII();
		ii.setRoot("Yatta!");
		mcciin000002uv01.setId(ii);
		return mcciin000002uv01;
	}

	@WebMethod(operationName = "PIXManager_PRPA_IN201302UV02", action = "urn:hl7-org:v3:PRPA_IN201302UV02")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	public MCCIIN000002UV01 pixManagerPRPAIN201302UV02(
			@WebParam(name = "PRPA_IN201302UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body") PRPAIN201302UV02 body) {
		System.out.println("通ったよ！！");
		return of.createMCCIIN000002UV01();
	}

	@WebMethod(operationName = "PIXManager_PRPA_IN201304UV02", action = "urn:hl7-org:v3:PRPA_IN201304UV02")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	public MCCIIN000002UV01 pixManagerPRPAIN201304UV02(
			@WebParam(name = "PRPA_IN201304UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body") PRPAIN201304UV02 body) {
		System.out.println("通ったよ！！！");
		return of.createMCCIIN000002UV01();
	}

	@WebMethod(operationName = "PIXManager_PRPA_IN201309UV02", action = "urn:hl7-org:v3:PRPA_IN201309UV02")
	@WebResult(name = "PRPA_IN201310UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	public PRPAIN201310UV02 pixManagerPRPAIN201309UV02(
			@WebParam(name = "PRPA_IN201309UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body") PRPAIN201309UV02 body) {
		System.out.println("通ったよ！！！！");
		return of.createPRPAIN201310UV02();
	}
}
