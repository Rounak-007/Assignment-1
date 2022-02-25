import java.util.*;
public class MainClass
{
    public static void main(String[] args)
    {
        String cm,it;
        int ccp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Car Model:");
        cm=sc.nextLine();
        /*System.out.print("Car Type:");
        ct=sc.nextLine();*/
        System.out.print("Insurance Type:");
        it=sc.nextLine();
        System.out.print("Car Cost Price:");
        ccp=sc.nextInt();
        Car sedan=new Car(cm,Car.CarType.SEDAN,(double)ccp,it);
        sedan.demo();
    }
}
