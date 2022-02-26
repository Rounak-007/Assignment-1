import java.util.*;

class MainClass{

    public static void main(String[] args){


        Car car=new Car("Maruti 800","Sedan",1000000,"Premium");

        double totalPremium = car.calculateTotalPremium();
        System.out.println(totalPremium);
    }
}