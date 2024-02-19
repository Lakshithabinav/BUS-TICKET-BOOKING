import java.util.ArrayList;

public class Bus extends Customer_details{
    private int bus_no;
    private int seatsAvailable;
    private int noofseats;
    private boolean ac;
    ArrayList<Integer> seats= new ArrayList<>();
    ArrayList<Customer_details> cust = new ArrayList<>();
    Bus(){}
    Bus(int bus_no,int noofseats,boolean ac){
        this.bus_no=bus_no;
        this.noofseats=noofseats;
        this.seatsAvailable = noofseats;
        this.ac= ac;
        for(int i=1;i<=noofseats;i++){
            seats.add(i);
        }
    }
    int  getbus_no(){
        return bus_no;
    }
    void busSeatsUpdate(int noOfSeatsBooked){
        seatsAvailable -= noOfSeatsBooked;
    }
    void showBusDetails(){
        System.out.println(bus_no+" "+seatsAvailable+" "+ac);
    }
    void show_tickets(){
        int k =0;
        int noOfColumn = noofseats/5;
        for(int i=1;i<=noOfColumn;i++){
            
            for(int j=1;j<=5;j++){
                if( (i==1||i==2)&&(k<9)){
                System.out.print(" ");
            }
               if(j==2){
                 System.out.print(seats.get(k)+" |    | ");
                 k++;
               }
               else{
                 System.out.print(seats.get(k)+" | ");
                 k++;
               }
               
            }
            System.out.println("");
            System.out.println("-----------------------------");
        }
    }
    
}
