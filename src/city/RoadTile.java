package city;

import java.time.LocalDate;

public class RoadTile extends Tile{
    int level;

    public RoadTile(Coordinate coordinate, LocalDate created_at) {
        super(coordinate, created_at, 100, 100);
        this.level = 1;
    }
    
    public RoadTile(Coordinate coordinate, LocalDate created_at, int level, int price, int score){
        super(coordinate, created_at, price, score);
        this.level = level;
        }
}
