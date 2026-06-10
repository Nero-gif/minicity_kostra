package city;

import java.util.ArrayList;

public class CityMap {
    int side;
    ArrayList<Tile> tiles = new ArrayList<>();

    public CityMap(int side) {
        this.side = side;
    }
    
    public void addTile(Tile tile){
        this.tiles.add(tile);
    }
}
