package co.edu.escuelaing.sparkd.microspring;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

import co.edu.escuelaing.sparkd.httpserver.URIProcessor;

import java.util.HashMap;

public class MicroSpring implements URIProcessor{
	
	Map<String, Method> webservices = new HashMap<>();
	
	public void mapService(String componentName) throws Exception {
	      int nMethods = 0;
	      for (Method m : Class.forName(componentName).getMethods()) {
	    	 System.out.printf("Revisando método: "+ m.getName()+"\n");
	         if (m.isAnnotationPresent(RequestMapping.class)) {
	        	 System.out.printf("Tiene anotación @requestMapping");
	        	 RequestMapping rm = m.getAnnotation(RequestMapping.class);
	        	 webservices.put(rm.value() , m);
	        	 nMethods ++;
	         }
	      }
	      System.out.printf("Numero de servicios: " + nMethods);
	   }
	
	public String excecuteService(String theuri) {
		try {
			return webservices.get(theuri).invoke(null).toString();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return "Error";
	}
	
}
