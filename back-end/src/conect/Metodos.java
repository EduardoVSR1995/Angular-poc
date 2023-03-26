package conect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import contract.IdName;
import contract.MethodRout;
import controller.*;

public class Metodos {
  private String rout;
  private Object body;
  private MethodRout methodRout = new MethodRout(); 
    public Object allMetodos( String requestMethod, String rout,String body ) {
          this.rout = rout;
          this.body = body;
          Gson gson = new Gson();

          if(requestMethod.equals(methodRout.getGET()))
            if(rout.equals(methodRout.getHOUSE())) return getAllHouses();
          
          if(requestMethod.equals(methodRout.getPOST()))
            if(rout.equals(methodRout.getHOUSE())){
              try {
                IdName requestBody = gson.fromJson(body, IdName.class);
                int id = requestBody.getId(); 
                return getHouseAllImages(id);
              } catch (JsonSyntaxException e) {return e.toString();}
            }

          if(requestMethod.equals(methodRout.getPUT())) return PutRequest();
 
          if(requestMethod.equals(methodRout.getDELETE())) return DeleteRequest();
 
          return new Object();
    }

    private ArrayList<HashMap> getAllHouses(){
      return new getController().getAllHouses();
    }
    private ArrayList<HashMap> getHouseAllImages(int id){
      return new getController().getHouseAllImages(id);
    }

     private Object PostRequest(){
      return new postController().post(this.body, this.rout);
      
    }

     private Object PutRequest(){
      return new putController().put(this.body, this.rout);
      
    }

     private Object DeleteRequest(){
      return new deletController().delete(this.body, this.rout);
    }    
}
