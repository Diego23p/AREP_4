package co.edu.escuelaing.sparkd.microspring.componenttests;

import co.edu.escuelaing.sparkd.microspring.RequestMapping;

public class HelloController {

    @RequestMapping("/hello")
    public static String greetings() {
        return "Greetings from Spring Boot!";
    }
        
        @RequestMapping("/pi")
    public static String theValueOfPi() {
        	
        	String outputLine = 
                    "<!DOCTYPE html>\n"
                  + "<html>\n"
                  + "<head>\n"
                  + "<meta charset=\"UTF-8\">\n"
                  + "<title>Title of the document</title>\n"
                  + "</head>\n"
                  + "<body>\n"
                  + "<h1>Valor de PI</h1>\n"
                  + "<p>" + Math.PI + "</p>"      
                  + "</body>\n"
                  + "</html>\n";
                  return outputLine;
      }
        
        @RequestMapping("/webapp")
    public static String pagina() {
        String outputLine = 
                  "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Valor de EULER</h1>\n"
                + "<p>" + Math.E + "</p>"      
                + "</body>\n"
                + "</html>\n";
                return outputLine;
    }
}