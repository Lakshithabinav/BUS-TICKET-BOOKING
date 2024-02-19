
import java.util.ArrayList;
import java.util.Scanner;
public class Ticket{
    Scanner sc = new Scanner(System.in);
    ArrayList <Customer_details> customer_details= new ArrayList<>();
    private int noOfTickets;
    private String name;
    private long phno;
    private Bus buss;


    //buok the ticket for the selected bus.
    public void ticketBook(Bus busSelected){
        System.out.println("Enter the no of seats you need to book");
        buss = busSelected;
        noOfTickets = sc.nextInt();

        buss.busSeatsUpdate(noOfTickets);//update the no of seats available for a particular bus.

        for(int i = 0;i<noOfTickets;i++){
            System.out.println("Enter the seat no for ticket "+i+1+" :");
            int seatNoSelected = sc.nextInt();
            busSelected.seats.set(seatNoSelected-1,-1);// update the seats in the bus
        }
    }

    //collect the customer details for the specific bus.
    public void gettingCustomerDetails(){
        System.out.print("Enter your name : ");
        name = sc.next();
        System.out.println("Enter your phone number : ");
        phno = sc.nextLong();

    }

    //update the customer details
    public void addDetailsToCust(){
        buss.cust.add(new Customer_details(name, phno, buss.getbus_no(), noOfTickets));
    }
}
