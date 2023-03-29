package com.contract;

public class Login extends Cadaster{
    public Login(String email, String password) throws Exception {
        super("", 0, email, password );
    }
    
    public boolean getValidateLogin() throws Error{
        if( this.getName() != null  || this.getCep() != 0  || this.getEmail() == null ||  this.getPassword() == null) throw new Error("Invalid data");
        return true;
    }
}
