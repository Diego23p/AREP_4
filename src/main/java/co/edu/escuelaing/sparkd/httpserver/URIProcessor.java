package co.edu.escuelaing.sparkd.httpserver;

public interface URIProcessor {
	
	public void mapService(String commands) throws Exception;
	
	public String excecuteService(String theuri);

}
