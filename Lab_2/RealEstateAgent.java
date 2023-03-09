package Lab_2;

import java.util.ArrayList;
import java.util.Objects;


public class RealEstateAgent {
    private String firstName;
    private String lastName;
    private ArrayList<House> houseList = new ArrayList<>();
    

    public RealEstateAgent(String firstName, String lastName, ArrayList<House> houseList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseList = houseList;
    }
        
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }

    void showHouse(String id){
        for (House house : houseList) {
            if(Objects.equals(id, house.getId())){
                house.profileOfHouse();
            }
        }
    }

}
