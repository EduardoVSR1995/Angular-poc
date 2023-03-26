package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import java.sql.Connection;
import java.sql.PreparedStatement;

import bankConnection.bankConection;

public class getController extends bankConection {
  private Connection connect = this.connectionBack;

  public ArrayList<HashMap> getAllHouses() {
    try {
        ResultSet result = connect
          .createStatement()
          .executeQuery("SELECT * FROM house;");

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
        HashMap<String, Object> err = new HashMap<>(); 
        ArrayList<HashMap> erro = new ArrayList<>(); 
        err.put("Get images error.", e.toString());
        erro.add(err);
        return erro;
      }
    }
    public ArrayList<HashMap> getHouseAllImages(int id) {
      ArrayList<HashMap> images = new ArrayList<>(); 

      try {
        PreparedStatement statement = connect
          .prepareStatement("SELECT * FROM images WHERE houseId = (?);");
  
        statement.setInt(1, id); 
        
        ResultSet result = statement.executeQuery();
    
        while (result.next()) {
            
          HashMap<String, Object> image = new HashMap<>(); 
          image.put("id", result.getInt("id")) ;
          image.put("url", result.getString("url"));
          image.put("houseId", result.getInt("houseId"));
          images.add(image);
          System.out.println(image.toString());
        }        
        
        return images;
  
       } catch (Exception e) {
        HashMap<String, Object> err = new HashMap<>(); 
        ArrayList<HashMap> erro = new ArrayList<>(); 
        err.put("Get images error.", e.toString());
        erro.add(err);
        return erro;
       }

    }  
}
