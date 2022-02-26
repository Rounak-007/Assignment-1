import java.util.*;

public class Type{

    private final Map<String,Double> carType = new HashMap<>();

    public Type(){
        carType.put("Hatchback",0.05);
        carType.put("Sedan",0.08);
        carType.put("SUV",0.1);
    }

    public double getDiscount(String type){
        return carType.get(type);
    }
}