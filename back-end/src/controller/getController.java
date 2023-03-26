package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import bankConnection.bankConection;

public class getController {

  public ArrayList<HashMap> getHouses(){
      try {
        Connection connection = bankConection.connection();
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM house;") ;
        ArrayList<HashMap> houses = new ArrayList<>();
        
        while (result.next()) {
          
          HashMap<String, Object> house = new HashMap<>() ; 
          house.put("id", result.getInt("id")) ;
          house.put("name", result.getString("name"));
          house.put("state", result.getString("state"));
          house.put("price", result.getInt("price"));
          house.put("location", result.getBoolean("location"));
          houses.add(house);
        }        
        return houses;
        
      } catch (Exception e) {
        System.out.println(e.toString());
        throw new Error("Get all houses error."+e.toString());
      }
    }
}
