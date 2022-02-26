import java.util.*; 

public class Car{

    private final String model;
    private final String carType;
    private final double costPrice;
    private final String carInsuranceType;
    
    public Car(String model, String carType, double costPrice, String carInsuranceType){
        this.model=model;
        this.carType=carType;
        this.costPrice=costPrice;
        this.carInsuranceType=carInsuranceType;
    }


    public double calculateTotalPremium(){
        Type type = new Type();
        InsuranceType insuranceType=new InsuranceType();
        return ((costPrice * type.getDiscount(carType)) * insuranceType.getInsuranceType(carInsuranceType));
    }
}