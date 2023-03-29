package com.contract;

public class Cadaster extends IdName {
    private int cep;
    private String email;
    private String password;
    
    public Cadaster(String name, int cep, String email, String password) throws Exception {
        super(0, name);
        this.cep = cep;
        this.email = email;
        this.password = password;
    }
    
    public boolean getValidate() throws Error{
        if( this.getName() == null ||  this.cep == 0 ||  this.email == null ||  this.password == null) throw new Error("Invalid data");
        return true;
    }

    public int getCep(){
        return this.cep;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getPassword(){
        return this.password;
    }
}





