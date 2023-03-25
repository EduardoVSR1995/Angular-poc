package conect;

import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.HashMap;

import com.sun.net.httpserver.*;

public class Conect {
	private static HttpServer server; 
    private static HashMap<String, String[]> listMethods;

	public static void Conection(int PORT)throws IOException {
        if(server == null ) {
            if(listMethods == null) listMethods = new HashMap<>();
            server = HttpServer.create(new InetSocketAddress(PORT), 0);
            server.createContext("/", new MyHandler());
            server.setExecutor(null);
            server.start();
        }
        System.out.println("Servidor iniciado na porta "+PORT+".");	
	}

    public void putMethod(String method, String rout){
        boolean validation = listMethods.containsKey(method);
        if(!validation){
            listMethods.put(method, new String[]{ rout });
            return;
        }
        String[] list = listMethods.get(method);

        String[] newlist = Arrays.copyOf(list, list.length+1);
        
        newlist[list.length] = rout;
        
        listMethods.put(method ,newlist);
    }

    static class MyHandler implements HttpHandler {

        private static String veryfiMethodAndRout(String method, String rout) {        
            String[] verifi = listMethods.get(method);
            if( verifi.length != 0 ){
                for (int i = 0; i < verifi.length; i++) {
                    if(verifi[i].equals(rout)) return verifi[i].toString();   
                }
            } 
            return "";
        }
    
        @Override
		public void handle(HttpExchange exchange) throws IOException {
		    String requestMethod = exchange.getRequestMethod();
            String rout = exchange.getRequestURI().toString();
            String endRout = veryfiMethodAndRout(requestMethod, rout);

            if( endRout.equals("") ) throw new IllegalArgumentException("Undefined rout or method");
		    
            InputStream requestBody = exchange.getRequestBody();
		    BufferedReader reader = new BufferedReader(new InputStreamReader(requestBody));
		    StringBuilder requestBuilder = new StringBuilder();
		    String line;
		    
            while ((line = reader.readLine()) != null) {
                requestBuilder.append(line);
		    }		    
           
            String request = requestBuilder.toString();
            
            Object object = request.format(request);
            Object objectRequest = new Metodos().allMetodos(requestMethod, endRout, object);
                
            String response = objectRequest.toString();
    
		    exchange.getResponseHeaders().set("Content-Type", "application/json");
		    exchange.sendResponseHeaders(200 , response.getBytes().length);
		    OutputStream responseBody = exchange.getResponseBody();
		    responseBody.write(response.getBytes());
		    responseBody.close();
		}
    }
}

