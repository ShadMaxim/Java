package homeWokr.task1;

import homeWokr.task1.bus.BusTrip;
import homeWokr.task1.busThread.BusTread;

import java.util.Scanner;

import static homeWokr.task1.bus.BusTrip.SPEED_BUS;


public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // создал маршрут
        BusTrip minskNeminsk = new BusTrip();


        // количество остановочных пунктов

        System.out.println("A route with a number of stops you want to create?  \n Enter the number, please");
        minskNeminsk.addRoute(sc.nextInt());
        minskNeminsk.route();

        Thread thread = new Thread(new BusTread(minskNeminsk));

        thread.start();


    }
}

