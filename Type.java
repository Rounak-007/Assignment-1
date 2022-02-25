import java.util.*;

public enum Type{

    HATCHBACK(1.05),
    SEDAN(1.08),
    SUV(1.1);

    private final double rateOfPremium;

    Type(double rateOfPremium){
        this.rateOfPremium=rateOfPremium;
    }

    public double calculatePremium(double costPrice){
        return costPrice * rateOfPremium;
    }
}