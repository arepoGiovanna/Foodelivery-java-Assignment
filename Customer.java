
public class Customer extends FoodeliverMenu{

    //instance variables
    //private int custID = 001;
    private String custName;
    private String phoneNum;

    public Customer(){}
    //customer constructor
    public Customer(String name, String phone){
        custName = name;
        phoneNum = phone;
    }

    //toString method that returns the customer information
    public String toString(){
        String result = "";
        result = "\nName: " + custName + "\nPhone number: " + phoneNum ;
        return result;
    }

}