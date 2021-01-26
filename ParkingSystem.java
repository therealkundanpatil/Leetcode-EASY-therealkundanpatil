package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode Easy
 * 
 * Id: Design Parking System
 * 
 * Time Complexity : O(1)
 * 
 * Space Complexity : O(1)
 * 
 * @author Kundan
 *
 */
public class ParkingSystem {
    List<Integer> bigCarParkingSpace = new ArrayList<>();
    List<Integer> mediumCarParkingSpace = new ArrayList<>();
    List<Integer> smallCarParkingSpace = new ArrayList<>();
    int bigCarParkingLimit = 0;
    int mediumCarParkingLimit = 0;
    int smallCarParkingLimit = 0;
    
    public ParkingSystem(int big, int medium, int small) {
        this.bigCarParkingLimit = big;
        this.mediumCarParkingLimit = medium;
        this.smallCarParkingLimit = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(canAddCar(bigCarParkingSpace,bigCarParkingLimit, carType)){
                return true;
            }
            else{
                return false;
            }
        }
        else if (carType == 2){
            if(canAddCar(mediumCarParkingSpace,mediumCarParkingLimit, carType)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            if(canAddCar(smallCarParkingSpace, smallCarParkingLimit, carType)){
                return true;
            }
            else{
                return false;
            }
        }
    }
    
    private boolean canAddCar(List<Integer> parkingSpace, int maxSize, int carType){
        if(parkingSpace.size() >= maxSize){
            return false;
        }
        else{
            parkingSpace.add(carType);
            return true;
        }
    }
}
