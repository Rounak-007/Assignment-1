import java.util.*; 

public class Car{

    private final String model;
    private final String type;
    private final double costPrice;
    private final String insuranceType;
    private final Map<String, Double> Type = new HashMap<>();
    private final Map<String, Double> InsuranceType = new HashMap<>();

    public Car(String model, String type, double costPrice, String insuranceType){
        this.model=model;
        this.type=type;
        this.costPrice=costPrice;
        this.insuranceType=insuranceType;
        Type.put("Hatchback",0.05);
        Type.put("Sedan",0.08);
        Type.put("SUV",0.1);
        InsuranceType.put("Premium",1.2);
        InsuranceType.put("Basic",1.0);
    }


    public double calculateTotalPremium(){
        return ((costPrice * Type.get(type)) * InsuranceType.get(insuranceType));
    }
}