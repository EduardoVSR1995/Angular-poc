package com.bank;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.*;
import java.util.HashMap;

public class seed {
    private static Connection connection;
    public void cretebanck() throws Exception {
        try {
            connection = new bankConect().connection();
            
            try{
                connection.createStatement()
                .executeQuery("SELECT * FROM user WHERE id=1;");
                System.out.println("Database already exists.");
                return;
            } catch(Exception e){} 

            connection.createStatement()
            .execute("CREATE TABLE IF NOT EXISTS user (id INT PRIMARY KEY AUTO_INCREMENT, name varchar(30) NOT NULL, email varchar(30) NOT NULL UNIQUE, cep INT NOT NULL, password varchar(30) NOT NULL);");
            
            connection.createStatement()
            .execute("CREATE TABLE IF NOT EXISTS house (id INT PRIMARY KEY AUTO_INCREMENT, name Varchar(30) NOT NULL, state varchar(4) NOT NULL, price INT(30) NOT NULL, location BOOLEAN NOT NULL DEFAULT false);" );
            
            connection.createStatement()
            .execute("CREATE TABLE IF NOT EXISTS images (id INT PRIMARY KEY AUTO_INCREMENT, url TEXT NOT NULL, houseId INT NOT NULL, FOREIGN KEY (houseId) REFERENCES house(id));");

            connection.createStatement()
            .execute("CREATE TABLE IF NOT EXISTS userHouse (id INT PRIMARY KEY AUTO_INCREMENT, houseId INT NOT NULL , userId INT NOT NULL, FOREIGN KEY (houseId) REFERENCES house(id), FOREIGN KEY (userId) REFERENCES user(id));");                       
        
            imagesScrap();

        } catch (Exception e) {
            System.out.println(e.toString());   
        }
    }

    public void imagesScrap() throws Exception {
        String url = "https://br.freepik.com/fotos/casa";
        String selector = "img[src$=.jpg]";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements images = doc.select(selector);
            int i =0;
            for (Element image : images) {
                String src = image.attr("src");
                PreparedStatement house = connection.prepareStatement("INSERT INTO  house (name, state, price) VALUES (?, ?, ?);", Statement.RETURN_GENERATED_KEYS);
                house.setString(1, "House beautifull");
                house.setString(2, stateSelect(i));
                house.setInt(3, 500);
                house.executeUpdate();
                
                ResultSet r = house.getGeneratedKeys(); 

                int id;
                if (r.next()){
                   id = r.getInt(1);
                   PreparedStatement img = connection.prepareStatement("INSERT INTO  images ( url, houseId) VALUES (?, ?);");
                   img.setString(1, src);
                   img.setInt(2, id);
                   img.executeUpdate();
                }   

                i++;
            }
            System.out.println("Creation and insertion of elements in the complete database!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String stateSelect( int i ){
        HashMap<String, String> objetoOriginal = new HashMap<>();
        objetoOriginal.put("0", "TO");
        objetoOriginal.put("1", "AC");
        objetoOriginal.put("2", "AL");
        objetoOriginal.put("3", "AM");
        objetoOriginal.put("4", "AP");
        objetoOriginal.put("5", "BA");
        objetoOriginal.put("6", "CE");
        objetoOriginal.put("7", "DF");
        objetoOriginal.put("8", "ES");
        objetoOriginal.put("9", "GO");
        objetoOriginal.put("10", "MA");
        objetoOriginal.put("11", "MT");
        objetoOriginal.put("12", "MS");
        objetoOriginal.put("13", "MG");
        objetoOriginal.put("14", "PA");
        objetoOriginal.put("15", "PB");
        objetoOriginal.put("16", "PR");
        objetoOriginal.put("17", "PE");
        objetoOriginal.put("18", "PI");
        objetoOriginal.put("19", "RJ");
        objetoOriginal.put("20", "RN");
        objetoOriginal.put("21", "RS");
        objetoOriginal.put("22", "RO");
        objetoOriginal.put("23", "RR");
        objetoOriginal.put("24", "SC");
        objetoOriginal.put("25", "SP");
        objetoOriginal.put("26", "SE");

        float resultado = -0.01f * i * i + i;
        int e = Float.valueOf(resultado).intValue();        
        String value = objetoOriginal.get(e+"");
        return value;        
    }
}

// Delete table comand: drop tables user, userHouse, images, house;