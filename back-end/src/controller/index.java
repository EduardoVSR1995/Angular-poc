package controller;

import java.io.IOException;
import contract.MethodRout;
import conect.Conect;
public class index{
    
    public static void Start()throws IOException {
        MethodRout methodRout = new MethodRout();

        new Conect().putMethod(methodRout.getGET() ,methodRout.getHOTEL());
        new Conect().putMethod(methodRout.getPUT() ,methodRout.getHOTEL());
        new Conect().putMethod(methodRout.getPOST() ,methodRout.getLOGUIN());
        new Conect().putMethod(methodRout.getPOST() ,methodRout.getSIGNIN());
        new Conect().putMethod(methodRout.getDELETE(), methodRout.getDELETEHOTEL());

        new deletController();
        new getController();
        new postController();
        new putController();
    }
}
