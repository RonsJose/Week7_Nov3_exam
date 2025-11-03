package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        int option=0;
        Customer customer;
        String id;
        String name;
        String email;
        String phone;

        while(option!=4)
        {
            System.out.println("==== Customer Management System ====\n\n1) Add Customer\n\n2) Update Customer\n\n 3) Display All\n\n 4) Exit\n\n");

           while(true)
           {
               option=0;
               System.out.print("Enter number: ");
               String optionStr=sc.nextLine().trim();

               try
               {
                   option=Integer.parseInt(optionStr);
                   break;
               }
               catch(NumberFormatException e)
               {
                   System.out.println("Please enter a number: " + e.getMessage() );
               }
           }
           customer = new Customer();
           switch(option)
               {
               case 1:
                   System.out.println("Enter Customer ID(5 digits): ");
                   id=sc.nextLine().trim();

                   for(Customer c : customers)
                   {
                       while (id.equals(c.getCustomerId()))
                       {
                           System.out.println("Customer ID is already in use");
                           System.out.println("Please enter another id: ");
                           id=sc.nextLine().trim();
                       }
                   }
                   customer.setCustomerId(id);
                   customers.add(customer);
                   break;
               }


        }
    }
}
