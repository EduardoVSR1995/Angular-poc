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
        String[] newList = listMethods.get(method);

        String[] list = Arrays.copyOf(newList, newList.length+1);

        list[newList.length-1]=rout;

        listMethods.put(method, list);
    }

    static class MyHandler implements HttpHandler {
        private static Boolean veryfiMethodAndRout(String method, String rout) {        
            String[] verifi = listMethods.get(method);
            if( verifi.length != 0 ){
                boolean value = Arrays.asList(verifi).contains(rout);
                if(value) return true;
            } 
            return false;
        }
    
        @Override
		public void handle(HttpExchange exchange) throws IOException {
		    String requestMethod = exchange.getRequestMethod();
            String rout = exchange.getRequestURI().toString();
            boolean validation = veryfiMethodAndRout(requestMethod, rout);

            if( !validation ) throw new IllegalArgumentException("Undefined rout or method");
		    
            InputStream requestBody = exchange.getRequestBody();
		    BufferedReader reader = new BufferedReader(new InputStreamReader(requestBody));
		    StringBuilder requestBuilder = new StringBuilder();
		    String line;
		    
            while ((line = reader.readLine()) != null) {
                requestBuilder.append(line);
		    }		    
           
            String request = requestBuilder.toString();
            
            Object object = request.format(request);
        
            Object objectRequest = new Metodos().allMetodos(requestMethod, object);
                
            String response = objectRequest.toString();
    
		    exchange.getResponseHeaders().set("Content-Type", "application/json");
		    exchange.sendResponseHeaders( 200 , response.getBytes().length);
		    OutputStream responseBody = exchange.getResponseBody();
		    responseBody.write(response.getBytes());
		    responseBody.close();
		}
    }
}

