import conect.*;

public class App {
    public static void main(String[] args) throws Exception {   
        new Conect().Conection(5000);
        new Conect().putMethod("GET", "/");
    }
}
