package conect;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.google.gson.Gson;

import contract.*;
import controller.*;

public class Metodos {
  private String rout;
  private Object body;
  private MethodRout methodRout = new MethodRout(); 
    public Object allMetodos( String requestMethod, String rout,String body ) throws IOException {
          this.rout = rout;
          this.body = body;
          Gson gson = new Gson();
          try {
            if(requestMethod.equals(methodRout.getGET())){
              if(rout.equals(methodRout.getHOUSE())) return getAllHouses();
            }

            if(requestMethod.equals(methodRout.getPOST())){
              if(rout.equals(methodRout.getHOUSE())){
                  IdName requestBody = gson.fromJson(body, IdName.class);
                  int id = requestBody.getId();
                  if( id == 0 ) throw new Error("Object invalid");
                  return getHouseAllImages(id);
              }

              if(rout.equals(methodRout.getSIGNIN())){        
                   Cadaster cadaster = gson.fromJson(body, Cadaster.class);

                   if( !cadaster.getValidate() ) throw new Error("Object invalid");
  
                   PostRequest(cadaster);
              }

              if(rout.equals(methodRout.getLOGUIN())){        
                Login login = gson.fromJson(body, Login.class);
                
                if( !login.getValidateLogin() ) throw new Error("Object invalid");
                return PostRequest(login);
              }      
            }
            if(requestMethod.equals(methodRout.getPUT())) return PutRequest();
            
            if(requestMethod.equals(methodRout.getDELETE())) return DeleteRequest();
 
            return new Object();
          } catch (Exception e) {
            throw new Error(e.fillInStackTrace().toString());
          }
    }

    private ArrayList<HashMap> getAllHouses(){
      return new getController().getAllHouses();
    }
    private ArrayList<HashMap> getHouseAllImages(int id){
      return new getController().getHouseAllImages(id);
    }
    
     private Object PostRequest(Cadaster cadaster) throws Exception {
      return new postController().post(cadaster, this.rout);
         
    }

     private Object PutRequest(){
      return new putController().put(this.body, this.rout);
      
    }

     private Object DeleteRequest(){
      return new deletController().delete(this.body, this.rout);
    }    
}
