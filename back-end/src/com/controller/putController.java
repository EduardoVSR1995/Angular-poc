package com.controller;

import com.contract.MethodRout;

public class putController {
    public Object put(Object object, String rout){
        MethodRout methodRout = new MethodRout();

        if(rout.equals(methodRout.getHOUSE())) return putHouses(object);
  
        return new Object();
      }    
  
      private Object putHouses(Object object){
          return object;
      }
}
