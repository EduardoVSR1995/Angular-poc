package controller;

import contract.MethodRout;

public class postController {
    public Object post(Object object, String rout){
      MethodRout methodRout = new MethodRout();  
      Object empty = new Object();
      if( rout.equals(methodRout.getLOGUIN()) ) return postLoguin(object);
      if( rout.equals(methodRout.getSIGNIN()) ) return postSignin(object);
      return empty;
    }   
    
    private Object postLoguin(Object object){
        return object;
    }
    private Object postSignin(Object object){
        return object;
    }   
}
