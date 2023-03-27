import bankConnection.*;
import conect.*;
import controller.*;

public class App {
    public static void main(String[] args) throws Exception {   
        new seed().cretebanck();
        new Conect().Conection(5000);
        new index().Start();
    }
}