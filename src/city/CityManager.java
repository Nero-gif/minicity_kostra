package city;

import java.time.LocalDate;

public class CityManager {
    // TODO
    CityMap cityMap;
    int budget;

    public CityManager(CityMap cityMap, int budget) {
        this.cityMap = cityMap;
        this.budget = budget;
    }
    
    public void addTile (String type, Coordinate coordinate){
        switch (type) {
            case "Road": cityMap.addTile(new RoadTile(coordinate, LocalDate.now())); break;
            case "Park": cityMap.addTile(new ParkTile(coordinate, LocalDate.now())); break;
            case "House": cityMap.addTile(new HouseTile(coordinate, LocalDate.now())); break;
            case "Factory": cityMap.addTile(new FactoryTile(coordinate, LocalDate.now())); break;
            default:
                System.out.println("User is an Idiot"); break;
        }
    }
}
