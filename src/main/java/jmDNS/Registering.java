package jmDNS;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import Models.*;


public class Registering {
	public static JmDNS jmdns;
	
	// TODO Auto-generated method stub
	public static void main(String[] args) throws UnknownHostException, IOException  {
      	

    }
	
	public void jmndsRegister(int heatingPort, int projectorPort, int lightPort, int camPort) throws InterruptedException {

    	Heating myHeating = new Heating();
    	Speakers mySpeaker = new Speakers();
    	Light myLight = new Light();

		try {
			// Create a JmDNS instance
			// JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			jmdns = JmDNS.create(InetAddress.getLocalHost());
			// Registering all services
			System.out.println("Registering");
			ServiceInfo serviceHeating = ServiceInfo.create("_http._tcp.local.", myHeating.getDevice(), heatingPort,
					"path=index.html");
			ServiceInfo serviceProjector = ServiceInfo.create("_http._tcp.local.", mySpeaker.getDevice(), projectorPort,
					"path=index.html");
			ServiceInfo serviceLight = ServiceInfo.create("_http._tcp.local.", myLight.getDevice(), lightPort,
					"path=index.html");

			jmdns.registerService(serviceHeating);
			jmdns.registerService(serviceProjector);
			jmdns.registerService(serviceLight);

			// Wait a bit
			// Thread.sleep(25000);

			// Unregister all services
			// jmdns.unregisterAllServices();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public void unRegister() {
		System.out.println("Un-registering");

		jmdns.unregisterAllServices();

	}

}