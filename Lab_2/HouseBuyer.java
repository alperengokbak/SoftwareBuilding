package Lab_2;


public class HouseBuyer {
    private String firstName;
    private String lastName;
    private RealEstateAgent realEstateAgent;
    
    public HouseBuyer(String firstName, String lastName, RealEstateAgent realEstateAgent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.realEstateAgent = realEstateAgent;
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
    public RealEstateAgent getRealEstateAgent() {
        return realEstateAgent;
    }
    public void setRealEstateAgent(RealEstateAgent realEstateAgent) {
        this.realEstateAgent = realEstateAgent;
    }

    void requestHouseInfo(String id){
        this.realEstateAgent.showHouse(id);
    }
}
