package conect;

public class Metodos {
    public Object allMetodos( String requestMethod, Object Body) {

         switch (requestMethod) {
             case "GET":
                 return GetRequest(Body);

             case "POST":
                return PostRequest(Body);

             case "PUT":
                return PutRequest(Body);

             case "DELETE":
                return DeleteRequest(Body);

             default:
                return InvalidRequest(Body);
         }
     }

     private Object GetRequest(Object exchange){
        //Código para lidar com requisições GET
        return exchange;
     }

     private Object PostRequest(Object exchange){
        //Código para lidar com requisições POST
        return exchange;
    }

     private Object PutRequest(Object exchange){
        //Código para lidar com requisições PUT
        return exchange;
    }

     private Object DeleteRequest(Object exchange){
        //Código para lidar com requisições DELETE
        return exchange;
    }

     private Object InvalidRequest(Object exchange){
        //Código para lidar com requisições inválidas
        return exchange;
    }    
}
