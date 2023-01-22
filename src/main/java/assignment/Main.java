package assignment;

import assignment.house.House;
import assignment.housefactory.HouseFactory;
import assignment.housefactory.SummerHouseFactory;
import assignment.housefactory.VillaFactory;
import assignment.service.RealEstateService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        HouseFactory houseFactory = new HouseFactory();
        List<House> houses = houseFactory.getList();
        VillaFactory villaFactory = new VillaFactory();
        List<House> villas = villaFactory.getList();
        SummerHouseFactory summerHouseFactory = new SummerHouseFactory();
        List<House> summerHouses = summerHouseFactory.getList();

        // System.out.println("Houses: ");
        // houses.forEach(System.out::println);
        // System.out.println("Villas: ");
        // villas.forEach(System.out::println);
        // System.out.println("Summer houses: ");
        // summerHouses.forEach(System.out::println);
        List<House> allHouses = new ArrayList<House>();
        allHouses.addAll(houses);
        allHouses.addAll(villas);
        allHouses.addAll(summerHouses);

        //method to return the total price of houses
        System.out.println(RealEstateService.totalPrice(houses));
        //method to return the total price of villas
        System.out.println(RealEstateService.totalPrice(villas));
        //method to return the total price of summer houses
        System.out.println(RealEstateService.totalPrice(summerHouses));
        //method to return the total price of all houses
        System.out.println(RealEstateService.totalPrice(allHouses));

        //method that returns the average meter of houses
        System.out.println(RealEstateService.averageSquareMeter(houses));
        //method that returns the average meter of villas
        System.out.println(RealEstateService.averageSquareMeter(villas));
        //method that returns the average meter of summer houses
        System.out.println(RealEstateService.averageSquareMeter(summerHouses));
        //method that returns the average meter of all houses
        System.out.println(RealEstateService.averageSquareMeter(allHouses));

        //A method that filters and rotates all types of houses by seeing room and hall functions
        List<House> filteredHouses = RealEstateService.houseListFilteredByRoomAndLivingRoomCount(allHouses,3,1);
        System.out.println("House Object : Number of Rooms | Number of Living Rooms");
        filteredHouses.forEach(house -> System.out.println(house + " : " + house.getNumberOfRooms() + " | " + house.getNumberOfLivingRooms()));
    }
}
