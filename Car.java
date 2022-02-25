public class Car
{
    public enum CarType
    {
        HATCHBACK,
        SEDAN,
        SUV
    }
    
    String CarModel,InsuranceType;
    double CostPrice;
    CarType ct;
    
    public Car(String cm,CarType ct,double cp,String it)
    {
        this.CarModel=cm;
        this.InsuranceType=it;
        this.CostPrice=cp;
        this.ct=ct;
    }

    void demo(){
    switch(ct)
    {
        case SEDAN:
            System.out.println("Car Type:"+ct);
            double OriginalPremium=CostPrice*0.08;
            Insurance premium=new Insurance(CarModel,OriginalPremium,CostPrice,Insurance.InsuranceType.PREMIUM);
            premium.demo1();
            //Insurance basic=new Insurance(CarModel,Insurance.CarType.SEDAN,CostPrice,Insurance.InsuranceType.BASIC);
            break;
        
        case SUV:
            System.out.println("Welcome");
            break;

        default:
            System.out.println("Wrong Input");
            break;
    }
    }

     
    
}
