package contract;

public final class MethodRout {
    private String PUT = "PUT";
    private String DELETE = "DELETE";
    private String GET = "GET";
    private String POST = "POST";
    private String HOTEL = "/hotel";
    private String LOGUIN = "/login";
    private String SIGNIN = "/signin";
    private String DELETEHOTEL = "/delete/hotel";
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
    public String getHOTEL() {
        return HOTEL;
    }
    public String getDELETEHOTEL() {
        return DELETEHOTEL;
    }
}
