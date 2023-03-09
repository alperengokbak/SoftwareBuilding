package Lab_2;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<House> houseList = new ArrayList<>();

        RealEstateAgent agent = new RealEstateAgent("Century21", "Miami", houseList);
        HouseBuyer hb = new HouseBuyer("Alperen", "Gökbak", agent);

        House h1 = new House("2507", "California", "White", 140.0);
        House h2 = new House("3008", "Miami/Florida", "Beige", 120.0);
        House h3 = new House("1809", "New Jersey", "Yellow", 130.0);

        houseList.add(h1);
        houseList.add(h2);
        houseList.add(h3);

        hb.requestHouseInfo("2507");
    }
}
