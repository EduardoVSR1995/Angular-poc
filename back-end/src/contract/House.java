package contract; 

public class House extends IdName {
    private String state;
    private int price;
    private boolean location;

    public House(int id, String name, String state, int price, boolean location) {
        super(id, name);
        this.state = state;
        this.price = price;
        this.location = location;
    }
    public String getState() {
        return this.state;
    }
    public int getPrice() {
        return this.price;
    }
    public boolean getLocation(){
        return this.location;
    }


}