package com.controller;

import com.contract.MethodRout;

public class deletController {
    public Object delete(Object object, String rout){
      MethodRout methodRout = new MethodRout();
      
      if(rout.equals(methodRout.getDELETEHOUSE())) return deleteHouse(object);

      return new Object();
  }    

  private Object deleteHouse(Object object){
      return object;
  }
}
