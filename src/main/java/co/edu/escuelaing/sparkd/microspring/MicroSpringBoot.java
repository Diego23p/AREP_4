package co.edu.escuelaing.sparkd.microspring;

import co.edu.escuelaing.sparkd.httpserver.HttpServer;
import co.edu.escuelaing.sparkd.httpserver.URIProcessor;

public class MicroSpringBoot {
	
	public static void main (String[] args) {
		
		try {
			URIProcessor mspring = new MicroSpring();
			mspring.mapService(args[0]);
			HttpServer server = new HttpServer(mspring);
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
