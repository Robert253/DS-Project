package GRPC;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Logger;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceListener;

import org.DS.robertproject.SmartBuildingGRPC.Empty;
import org.DS.robertproject.SmartBuildingGRPC.SpeakerServiceGrpc.SpeakerServiceImplBase;
import org.DS.robertproject.SmartBuildingGRPC.boolRequest;
import org.DS.robertproject.SmartBuildingGRPC.boolResponse;
import org.DS.robertproject.SmartBuildingGRPC.speakerResp;
import org.DS.robertproject.SmartBuildingGRPC.stringRequest;
import org.DS.robertproject.SmartBuildingGRPC.stringResponse;
import org.DS.robertproject.SmartBuildingGRPC.valRequest;
import org.DS.robertproject.SmartBuildingGRPC.valResponse;

import com.google.protobuf.Int32ValueOrBuilder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
//import jmDNS.Discovering;
//import jmDNS.Discovering.SampleListener;
import Models.Speakers;

public class SpeakersServer extends SpeakerServiceImplBase {
	
	 private static class SampleListener implements ServiceListener {
		 
	        public void serviceAdded(ServiceEvent event) {
	            System.out.println("Service added: " + event.getInfo());

	        }

	        
	        public void serviceRemoved(ServiceEvent event) {
	            System.out.println("Service removed: " + event.getInfo());
	        }

	        
	        public void serviceResolved(ServiceEvent event) {
	            System.out.println("Service resolved: " + event.getInfo());
	            System.out.println("Get Name: " + event.getName()+" PORT: "+event.getInfo().getPort());
	            
	            //Start GRPC server with discovered device
	            if(event.getName().equals("Speaker")) {
	            	System.out.println("Found Speaker port: " + event.getInfo().getPort());
	       		 try {
	       			System.out.println("STARTING SPEAKER GRPC SERVER");
					startGRPC(event.getInfo().getPort());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	            }
	          

	        }
	    }
	
	private static final Logger logger = Logger.getLogger(SpeakersServer.class.getName());
	public Speakers mySpeaker = new Speakers();
 
	public static void main(String[] args) throws IOException, InterruptedException {
		startDiscovery();
	    }
	 public static void startDiscovery() throws IOException, InterruptedException {
		 try {
	            // Create a JmDNS instance
	            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	           

	            // Add a service listener
	            jmdns.addServiceListener("_http._tcp.local.", new SampleListener());
	            System.out.println("Listening");
	            // Wait a bit
	            Thread.sleep(30000);
	        } catch (UnknownHostException e) {
	            System.out.println(e.getMessage());
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	 } 
	 
	 public static void startGRPC(int portNumber) throws IOException, InterruptedException {
		 SpeakersServer speakerServer = new SpeakersServer();
		    Server server = ServerBuilder.forPort(portNumber)
		        .addService(speakerServer)
		        .build()
		        .start();
		    
		    logger.info("Speaker Server started, listening on " + portNumber);
		    		    
		    server.awaitTermination();
	 }
	 
	 //IF boolean is true -> On if false->Off
	 @Override
	 public void onOff(boolRequest request, StreamObserver<boolResponse> responseObserver) {
		 System.out.println("receiving onOFF for Speaker ");
		 Boolean onOff = request.getMsg();
		 mySpeaker.setOn(onOff);
		 
			
		 boolResponse response = boolResponse.newBuilder().setMsg(onOff).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}
	 
	 public void initialDevice(Empty request, StreamObserver<speakerResp> responseObserver) {
		 System.out.println("receiving initialDevice request for Speaker ");
		 String status;

		 if(mySpeaker.isOn()) {
			  status ="On";
		 }else {
			  status ="Off";

		 }
		 String aName=mySpeaker.getDeviceName();
		 String aStatus = status;
		 Boolean aMute = mySpeaker.isMute();
		 Integer aVolume=mySpeaker.getVolume();

			
		 speakerResp response = speakerResp.newBuilder()
				 .setAname(aName).setStatus(aStatus).setVolume(aVolume).setMuted(aMute)
				 .build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();

	}

	 public void mute(boolRequest request, StreamObserver<valResponse> responseObserver) {
		 System.out.println("receiving mute for Speaker");
		 Boolean mute = request.getMsg();
		 if(mute) {
			 mySpeaker.setVolume(0);
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();

		 }else {
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				
		 }

	}
	 @Override
	 public void changeVolume(valRequest request, StreamObserver<valResponse> responseObserver) {
			int currentVolume= mySpeaker.getVolume();
		 int volume = request.getLength();
		 int newVolume = currentVolume +volume;
		 System.out.println("receiving volume for Speaker"+ volume);
		 if(newVolume<=100 && newVolume>=0){
			 mySpeaker.setVolume(newVolume);
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
			 
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				//handle mute
		 }else if(mySpeaker.isMute()) {
			 mySpeaker.setVolume(0);
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
			 
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }
		 
		 else {
			 valResponse response = valResponse.newBuilder().setLength(mySpeaker.getVolume()).build();
			 
				responseObserver.onNext(response);
				responseObserver.onCompleted();
		 }


	}
	 @Override
	 public void changeDeviceName(stringRequest request, StreamObserver<stringResponse> responseObserver) {
		 String name = request.getText();
		 System.out.println("Changing speaker name to "+name);

			 mySpeaker.setDeviceName(name);
		 
			 stringResponse response = stringResponse.newBuilder().setText(name).build();
		 System.out.println("Response "+response.getText());
		 responseObserver.onNext(response);
		responseObserver.onCompleted();
	 }
	 

	 
}