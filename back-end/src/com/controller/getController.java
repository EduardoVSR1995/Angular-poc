package com.controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import com.bank.bankConect;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class getController extends bankConect {
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
        throw new Error(e.toString());
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
        }        
        
        return images;
  
       } catch (Exception e) {
        throw new Error(e.toString());
       }

    }  
}
