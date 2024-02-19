public class Customer_details {
    static int id =1;
    private int customer_id;
    private String name;
    private long phno;
    private int busbooked;
    private int noOfTicketsBooked;
    Customer_details(){}


    //custometr details object created.
    Customer_details(String name,long phno,int busbooked,int noOfTicketsBooked){
        this.customer_id =id++;
        this.name = name;
        this.phno =phno;
        this.busbooked = busbooked;
        this.noOfTicketsBooked = noOfTicketsBooked;
    }

    
    int getBusBooked(){
        return busbooked;
    }

    void getCostomerDetailsByBusNO(){
        System.out.println("{\nid : "+customer_id+"\nname : "+name+"\nphno : "+phno+"\n}");
    }
}
