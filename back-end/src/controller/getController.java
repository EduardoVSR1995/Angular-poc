package controller;

import java.sql.Connection;
import bankConnection.bankConection;

import contract.MethodRout;

public class getController {
    public Object get(Object object, String rout){
      MethodRout methodRout = new MethodRout();
      if(rout.equals(methodRout.getHOTEL())) return gethotels(object);
      return new Object();
    }    

    private Object gethotels(Object object){
        Connection co =  connection  ;
        return object;
    }
}
