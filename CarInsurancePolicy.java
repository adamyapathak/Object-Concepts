public class CarInsurancePolicy {
    private int policyNumber;
    private int numPayments;
    private String residentCity;
    public CarInsurancePolicy(int num, int payments, String city){
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
    public CarInsurancePolicy(int num, int payments){
        this(num, payments, "Mayfield");
    }
    public CarInsurancePolicy(int num){
        this(num, 2);
    }
    public void display(){
        System.out.println(" Policy # " + policyNumber + " . " + numPayments + " payments anually. Driver resides in " + residentCity + " . ");
    }
    
}
