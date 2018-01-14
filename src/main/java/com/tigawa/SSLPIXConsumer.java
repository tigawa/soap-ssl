package com.tigawa;

import static com.tigawa.PIXManager.ENDPOINT_URL;
import static com.tigawa.PIXManager.ENDPOINT_URL_SSL;
import static javax.xml.ws.BindingProvider.ENDPOINT_ADDRESS_PROPERTY;
import ihe.iti.pixv3._2007.PIXManagerPortType;
import ihe.iti.pixv3._2007.PIXManagerService;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.ws.BindingProvider;

import org.hl7.v3.MCCIIN000002UV01;
import org.hl7.v3.ObjectFactory;

public class SSLPIXConsumer {

	public static void main(String[] args) throws KeyManagementException,
			NoSuchAlgorithmException {
		// ★SSL通信用の処理★
		initSSL();

		ObjectFactory ob = new ObjectFactory();
		PIXManagerService service = new PIXManagerService();

		PIXManagerPortType pixManager = service.getPIXManagerPortSoap12();
		BindingProvider bp = (BindingProvider) pixManager;
		// bp.getRequestContext().put(ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL);
		bp.getRequestContext().put(ENDPOINT_ADDRESS_PROPERTY, ENDPOINT_URL_SSL);

		System.out.println("client start");
		MCCIIN000002UV01 prpain201301uv02 = pixManager
				.pixManagerPRPAIN201301UV02(ob.createPRPAIN201301UV02());
		String root = prpain201301uv02.getId().getRoot();
		System.out.println("client end =[" + root + "]");
	}

	public static void initSSL() throws NoSuchAlgorithmException,
			KeyManagementException {
		// Create a trust manager that does not validate certificate chains
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {
				System.out.println("getAcceptedIssuers");
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs,
					String authType) {
				System.out.println("checkClientTrusted " + authType);
			}

			public void checkServerTrusted(X509Certificate[] certs,
					String authType) {
				System.out.println("checkServerTrusted " + authType);
			}
		} };

		SSLContext sslContext = SSLContext.getInstance("TLS");
		HostnameVerifier hostnameVerifier = new HostnameVerifier() {
			public boolean verify(String arg0, SSLSession arg1) {
				System.out.println("verify " + arg0);
				return true;
			}
		};

		sslContext.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sslContext
				.getSocketFactory());
		HttpsURLConnection.setDefaultHostnameVerifier(hostnameVerifier);
	}
}
