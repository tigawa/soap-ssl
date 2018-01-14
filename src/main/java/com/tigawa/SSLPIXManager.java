package com.tigawa;

import ihe.iti.pixv3._2007.PIXManagerPortType;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.BindingType;
import javax.xml.ws.Endpoint;
import javax.xml.ws.soap.SOAPBinding;

import org.hl7.v3.II;
import org.hl7.v3.MCCIIN000002UV01;
import org.hl7.v3.ObjectFactory;
import org.hl7.v3.PRPAIN201301UV02;
import org.hl7.v3.PRPAIN201302UV02;
import org.hl7.v3.PRPAIN201304UV02;
import org.hl7.v3.PRPAIN201309UV02;
import org.hl7.v3.PRPAIN201310UV02;

import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsServer;

@WebService(
        portName = "pixManagerPortSoap12",
        serviceName = "PIXManager",
        targetNamespace = "https://localhost:9999/PIXManager",
        endpointInterface = "ihe.iti.pixv3._2007.PIXManagerPortType") // (1)
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
@XmlSeeAlso({ ObjectFactory.class })
public class SSLPIXManager implements PIXManagerPortType {

	private static final int port = 9999;
	private static final String keyPass = "administrator";

	private static ObjectFactory of = new ObjectFactory();
	
	public static void main(String[] args) throws NoSuchAlgorithmException,
			KeyStoreException, CertificateException, FileNotFoundException,
			IOException, UnrecoverableKeyException, KeyManagementException {
		
		// SSL設定
		HttpsConfigurator configurator = initSSLServer();

		Endpoint endpoint = Endpoint.create(new SSLPIXManager());
		HttpsServer httpsServer = HttpsServer.create(new InetSocketAddress("localhost", port), port);
		httpsServer.setHttpsConfigurator(configurator);
		HttpContext httpContext = httpsServer.createContext("/PIXManager");

		// サーバ起動
		System.out.println("server - ssl - start!!");
		httpsServer.start();
		endpoint.publish(httpContext);
	}
	
	static HttpsConfigurator initSSLServer() throws NoSuchAlgorithmException, KeyStoreException, CertificateException, FileNotFoundException, IOException, UnrecoverableKeyException, KeyManagementException{
		SSLContext ssl = SSLContext.getInstance("TLS");
		KeyManagerFactory keyFactory = KeyManagerFactory
				.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		KeyStore store = KeyStore.getInstance("JKS");
		ClassLoader classLoader = PIXManager.class.getClassLoader();
		File file = new File(classLoader.getResource("demo.keystore").getFile());
		store.load(new FileInputStream(file), keyPass.toCharArray());
		keyFactory.init(store, keyPass.toCharArray());
		TrustManagerFactory trustFactory = TrustManagerFactory
				.getInstance(TrustManagerFactory.getDefaultAlgorithm());
		trustFactory.init(store);
		ssl.init(keyFactory.getKeyManagers(), trustFactory.getTrustManagers(),
				new SecureRandom());
		return new HttpsConfigurator(ssl);
	}


	@WebMethod(operationName = "PIXManager_PRPA_IN201301UV02", action = "urn:hl7-org:v3:PRPA_IN201301UV02")
	@WebResult(name = "MCCI_IN000002UV01", targetNamespace = "urn:hl7-org:v3", partName = "Body")
	public MCCIIN000002UV01 pixManagerPRPAIN201301UV02(
			@WebParam(name = "PRPA_IN201301UV02", targetNamespace = "urn:hl7-org:v3", partName = "Body") PRPAIN201301UV02 body) {
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
