package com.contract;

public final class MethodRout {
    private String PUT = "PUT";
    private String DELETE = "DELETE";
    private String GET = "GET";
    private String POST = "POST";
    private String HOUSE = "/house";
    private String LOGUIN = "/login";
    private String SIGNIN = "/signin";
    private String DELETEHOUSE = "/delete/house";
    public String getPUT() {
        return PUT;
    }
    public String getDELETE() {
        return DELETE;
    }
    public String getGET() {
        return GET;
    }
    public String getPOST() {
        return POST;
    }
    public String getSIGNIN() {
        return SIGNIN;
    }
    public String getLOGUIN() {
        return LOGUIN;
    }
    public String getHOUSE() {
        return HOUSE;
    }
    public String getDELETEHOUSE() {
        return DELETEHOUSE;
    }
}
