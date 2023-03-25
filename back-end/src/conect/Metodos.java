package conect;

import contract.MethodRout;
import controller.*;

public class Metodos {
  private String rout;
  private Object body;

    public Object allMetodos( String requestMethod, String rout,Object body) {
         this.rout = rout;
         this.body = body; 
         MethodRout methodRout = new MethodRout(); 
         if(requestMethod.equals(methodRout.getGET())) return GetRequest();
         
         if(requestMethod.equals(methodRout.getPOST())) return PostRequest();

         if(requestMethod.equals(methodRout.getPUT())) return PutRequest();

         if(requestMethod.equals(methodRout.getDELETE())) return DeleteRequest();

         return new Object();
     }

     private Object GetRequest(){
      return new getController().get(this.body , this.rout);
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
