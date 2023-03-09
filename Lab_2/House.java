package Lab_2;

public class House {
    private String id;
    private String address;
    private String color;
    private Double size;
    

    public House(String id, String address, String color, Double size) {
        this.id = id;
        this.address = address;
        this.color = color;
        this.size = size;
    }
    

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public Double getSize() {
        return size;
    }


    public void setSize(Double size) {
        this.size = size;
    }


    void profileOfHouse(){
        System.out.println("The address of the house: " + this.address);
        System.out.println("The color of the house: " + this.color);
        System.out.println("The size of the house: " + this.size);
    }

}
