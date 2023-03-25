package controller;

import contract.MethodRout;

public class putController {
    public Object put(Object object, String rout){
        MethodRout methodRout = new MethodRout();

        if(rout.equals(methodRout.getHOTEL())) return puthotels(object);
  
        return new Object();
      }    
  
      private Object puthotels(Object object){
          return object;
      }
}
