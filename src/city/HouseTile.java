package city;

import java.time.LocalDate;
import java.util.Random;

public class HouseTile extends Tile implements Upgradable {
    int population;
    int level;
    
    public HouseTile (Coordinate coordinate, LocalDate created_at){
        super(coordinate, created_at, 200, 250);
        Random rand = new Random();
        this.population = rand.nextInt(1,8);
        this.level = 1;
    }
}
