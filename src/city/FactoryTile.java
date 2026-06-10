package city;

import java.time.LocalDate;
import java.util.Random;

public class FactoryTile extends Tile{
    int production;
    
    public FactoryTile (Coordinate coordinate, LocalDate created_at) {
        super(coordinate, created_at, 300, 300);
    }
    
    public int produce(){
        Random random = new Random();
        return random.nextInt(25,75);
    }
}
