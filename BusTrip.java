package homeWokr.task1.bus;

import java.util.ArrayList;
import java.util.Random;

public class BusTrip {

    public static final int SPEED_BUS = 60;
    public static final int MINUTS_IN_HOUR = 60;
    static int x = 0;

    private static ArrayList<Integer> tripList = new ArrayList<>();
    Random random = new Random(); // qwerty jghg;egf


    public BusTrip() { //enfklhrhflkrhfk4f
    }



    public void addRoute(int x){
        this.x = x;
        int distanse = 0;

        for (int i = 0; i<x; i++){
            if (i==0){
                tripList.add(distanse);
            }else{
                distanse = distanse +  (random.nextInt(50)+10);
                tripList.add(distanse);

            }
        }

    }

    public void route() {
        System.out.println("Bus trip (km): \n" + tripList.toString());
    }

    public int getTripList(int number){
        return tripList.get(number);
    }

    public int getX() {
        return x;
    }


}
