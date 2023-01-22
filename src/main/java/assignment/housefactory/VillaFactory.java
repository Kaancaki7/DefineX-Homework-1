package assignment.housefactory;

import assignment.house.House;
import assignment.house.Villa;

import java.util.List;

public class VillaFactory implements ListFactory{

    @Override
    public List<House> getList(){

        House house1 = new Villa(10_000_000L,400,8,3);
        House house2 = new Villa(10_000_000L,400,8,3);
        House house3 = new Villa(10_000_000L,400,8,3);

        return List.of(house1,house2,house3);
    }
}
