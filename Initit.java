import java.util.ArrayList;
import java.util.Scanner;

public class Initit extends Ticket{
    ArrayList<Bus> buss = new ArrayList<>();
    private Bus selectedBus;
    Scanner sc = new Scanner(System.in);
    void createBus(){
        buss.add(new Bus(1,40,true));
        buss.add(new Bus(2,50,false));
        buss.add(new Bus(3,45,true));
    }

  
    void toShowBusDetails(){
        System.out.println();
        for(Bus itr : buss){
            itr.showBusDetails();
        }
    }
    
    int selectBus;
    void toShowSeatsOfSpecificBus(){
        System.out.println("Enter The bus no : ");
        selectBus = sc.nextInt();
        for(Bus itr : buss){
            if(itr.getbus_no()==selectBus){
                selectedBus = itr;
                selectedBus.show_tickets();
            }
        }
    }
    Bus getSelectedBus(){
        return selectedBus;
    }

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
