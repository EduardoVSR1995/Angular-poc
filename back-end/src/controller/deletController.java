package controller;

import contract.MethodRout;

public class deletController {
    public Object delete(Object object, String rout){
      MethodRout methodRout = new MethodRout();
      
      if(rout.equals(methodRout.getDELETEHOTEL())) return deletehotels(object);

      return new Object();
  }    

  private Object deletehotels(Object object){
      return object;
  }
}
