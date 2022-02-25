public class Insurance
{
    public enum InsuranceType
    {
        BASIC,
        PREMIUM
    }

    String Car_Model;
    InsuranceType Insurance_Type;
    double Cost_Price,original_premium;
    
    public Insurance(String cm,double pr,double cp,InsuranceType it)
    {
        this.Car_Model=cm;
        this.Insurance_Type=it;
        this.Cost_Price=cp;
        this.original_premium=pr;
    }

    void demo1()
    {
        switch(Insurance_Type)
        {
        case PREMIUM:
            System.out.println("INSURANCE TYPE:"+Insurance_Type);
            double new_premium=original_premium+(original_premium*0.2);
            System.out.println("Amt to be Paid:"+new_premium);
            break;
        
        case BASIC:
            System.out.println("Welcome");
            break;

        default:
            System.out.println("Wrong Input");
            break;
        }
    }
}