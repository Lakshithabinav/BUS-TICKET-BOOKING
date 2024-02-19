import java.util.ArrayList;
import java.util.Scanner;

public class Initit extends Ticket{
    ArrayList<Bus> buss = new ArrayList<>();//arraylist created for storing bus objects.

    private Bus selectedBus;

    Scanner sc = new Scanner(System.in);

    //Buss are intialized and added to buss arraylist.
    void createBus(){
        buss.add(new Bus(1,40,true));//bus1
        buss.add(new Bus(2,50,false));//bus2
        buss.add(new Bus(3,45,true));//bus3
    }


    //display the bus details of all the busses.
    void toShowBusDetails(){
        System.out.println();
        for(Bus itr : buss){ //iterate all the bus odject from buss arraylist.
            itr.showBusDetails();// Display the bus details fo every buss.
        }
    }
    

    //Select the bus need to book.
    void toShowSeatsOfSpecificBus(){
        System.out.println("Enter The bus no : ");
        int selectBus = sc.nextInt();
        for(Bus itr : buss){
            if(itr.getbus_no()==selectBus){
                selectedBus = itr;
            
            }
        }
    }

    //returns the selected bus.
    Bus getSelectedBus(){
        return selectedBus;
    }

    //retruns the customerDetails of specific buss.
    public void getCustomerDetails(){
        System.out.println("Enter The bus no : ");
        int DetailBus = sc.nextInt();
        for(Bus itr : buss){
            if(itr.getbus_no()==DetailBus){
                itr.show_tickets();
                itr.cust.get(0).getCostomerDetailsByBusNO();
            }
        }
    }

}
