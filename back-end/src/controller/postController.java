package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import bankConnection.bankConection;
import contract.Cadaster;
import contract.Login;
import contract.MethodRout;

public class postController extends bankConection{
    private Object object;
    private Connection connect = this.connectionBack;

    public Object post(Object object, String rout) throws Exception {
      MethodRout methodRout = new MethodRout();  
      this.object =object;  
      if( rout.equals(methodRout.getLOGUIN()) ) return postLoguin();
      if( rout.equals(methodRout.getSIGNIN()) ) postSignin();
      return new Error();
    }   
    
    private HashMap postLoguin() throws Error{
        try {
            PreparedStatement result = connect
                .prepareStatement("SELECT * FROM user WHERE email=(?);");
            
            Login use = (Login) this.object;

            result.setString(1, use.getEmail()); 
            
            ResultSet resulQuery = result.executeQuery();
                        
            HashMap<String, Object> objectUser = new HashMap<>(); 
            if (resulQuery.next()) { 
                objectUser.put("name", resulQuery.getString("name")) ;
                objectUser.put("email", resulQuery.getString("email"));
                objectUser.put("cep", resulQuery.getInt("cep"));
           }        
            boolean valid = use.getPassword().equals(resulQuery.getString("password").toString());
            
            if( !valid ) throw new Error("Invalid password"); 
            
            return objectUser;
        } catch (Exception e) {
            throw new Error(e.toString());
        }
    }
    private void postSignin() {
        try {
            PreparedStatement result = connect
              .prepareStatement("INSERT INTO user (name, email, cep, password) VALUES (?, ?, ?, ?);");
              Cadaster use = (Cadaster) this.object;


              result.setString(1, use.getName());
              result.setString(2, use.getEmail());
              result.setInt(3, use.getCep());
              result.setString(4, use.getPassword());
              
              result.executeUpdate();
              
              return;
            } catch (SQLException e) {
                throw new Error(e.toString());
        }
  }   
}
