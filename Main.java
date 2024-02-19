import java.util.Scanner;

class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Initit init = new Initit();
      
      init.createBus();
      
      while(true){
        System.out.println("Enter your choise\n1.Ticket Book\n2.See dettails\n3.Exit\n\n");
        int optionSelected = sc.nextInt();


        //Option 1 is selected -- booking of ticket
        if(optionSelected==1){
          init.toShowBusDetails();            //show all the bus details.
          init.toShowSeatsOfSpecificBus();    //Select the bus needed. 
          Bus bussel = init.getSelectedBus(); //get the selected bus.
          bussel.show_tickets();              //show the seats of buss seleted.
          init.gettingCustomerDetails();      //getting customer details and storing it in the gettingCustomerDetails.class
          init.ticketBook(bussel);            // ticket booking for the selecgted buss.
          init.addDetailsToCust();            //storing it in the gettingCustomerDetails.class

          bussel.show_tickets();             // display the ticket after the ticket booking is done.
        }      
        
        //Option 2 is selected -- costomer details is shown. 
        else if(optionSelected==2){
          init.getCustomerDetails();

        }

        //option 3 - termination of the program. 
        else if(optionSelected == 3){
          System.out.println("Thank You for visiting our company :) ");
          break;
        }

    }
  }
    
}