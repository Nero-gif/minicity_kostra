package city;

import java.time.LocalDate;

public class ParkTile extends RoadTile implements Upgradable{
    int attractivenessBonus;
    
    public ParkTile (Coordinate coordinate, LocalDate created_at){
        super(coordinate, created_at, 1, 200, 250);
        this.attractivenessBonus = 50;
    }
}
