import bankConnection.seed;
import conect.*;
import controller.index;

public class App {
    public static void main(String[] args) throws Exception {   
        new seed().cretebanck();
        new Conect().Conection(5000);
        new index().Start();
        
    }
}