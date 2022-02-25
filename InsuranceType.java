public enum InsuranceType{

    PREMIUM(1.2),
    BASIC(1.0);

    private final double addedRateOfPremium;

    InsuranceType(double addedRateOfPremium){
        this.addedRateOfPremium=addedRateOfPremium;
    }

    public double calculateAddedPremium(double originalPremiumValue){
        return originalPremiumValue * addedRateOfPremium;
    }
}