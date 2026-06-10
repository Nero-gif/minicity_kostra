package city;

import java.time.LocalDate;

public class Tile {
    Coordinate coordinate;
    LocalDate created_at;
    
    int price;
    int score;

    public Tile(Coordinate coordinate, LocalDate created_at, int price, int score) {
        this.coordinate = coordinate;
        this.created_at = created_at;
        this.price = price;
        this.score = score;
    }
}

