import java.util.*;

public class InsuranceType{

    private final Map<String,Double> insuranceType = new HashMap<>();

    public InsuranceType(){
        insuranceType.put("Baisc",1.0);
        insuranceType.put("Premium",1.2);
    }

    public double getInsuranceType(String insurance){
        return insuranceType.get(insurance);
    }
}