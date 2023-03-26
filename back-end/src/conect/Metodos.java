package conect;

import java.util.ArrayList;
import java.util.HashMap;

import contract.MethodRout;
import controller.*;

public class Metodos {
  private String rout;
  private Object body;
  private MethodRout methodRout = new MethodRout(); 
    public Object allMetodos( String requestMethod, String rout,Object body) {
          this.rout = rout;
          this.body = body;

          if(requestMethod.equals(methodRout.getGET()))
            if(rout.equals(methodRout.getHOUSE())) return GetRequest();
        
          if(requestMethod.equals(methodRout.getPOST())) return PostRequest();
 
          if(requestMethod.equals(methodRout.getPUT())) return PutRequest();
 
          if(requestMethod.equals(methodRout.getDELETE())) return DeleteRequest();
 
          return new Object();
    }

    private ArrayList<HashMap> GetRequest(){
      return new getController().getHouses();
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
