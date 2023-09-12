package DesignParkingSystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingSystem {
    List<Integer> availableSpots = new ArrayList<>();

    public ParkingSystem(int big, int medium, int small) {
        availableSpots.add(big);
        availableSpots.add(medium);
        availableSpots.add(small);


    }

    public boolean addCar(int carType) {
        int index = carType - 1;
        if (availableSpots.get(index) > 0) {
            int currentVal = availableSpots.get(index);
            availableSpots.set(index, currentVal - 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int big = 3;
        int medium = 2;
        int small = 1;

        int carType = 1;

        ParkingSystem obj = new ParkingSystem(big, medium, small);
        boolean param_1 = obj.addCar(carType);

    }


}
