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
                   System.out.println("Enter Customer Name: ");
                   name=sc.nextLine().trim();

                   System.out.println("Enter Customer Email: ");
                   email=sc.nextLine().trim();

                   System.out.println("Enter Customer Phone Number: ");
                   phone=sc.nextLine().trim();

                   customer.setName(name);
                   customer.setEmail(email);
                   customer.setPhoneNumber(phone);
                   customer.setCustomerId(id);
                   customers.add(customer);
                   break;
                   case 2:
                       System.out.println("Enter customer id: ");
                       id=sc.nextLine().trim();

                       for(Customer c : customers)
                       {
                           if (id.equals(c.getCustomerId()))
                           {
                               System.out.println("Customer ID found\n");

                               System.out.println("Old name: " + c.getName());
                               System.out.println("Enter new name: ");
                               name=sc.nextLine().trim();

                               System.out.println("Old email: "+c.getEmail());
                               System.out.println("Enter new email: ");
                               email=sc.nextLine().trim();

                               System.out.println("Old phone number: "+c.getPhoneNumber());
                               System.out.println("Enter new phone number: ");
                               phone=sc.nextLine().trim();

                               c.setName(name);
                               c.setEmail(email);
                               c.setPhoneNumber(phone);
                           }
                           else
                           {
                               System.out.println("Customer ID does not exist");
                           }
                       }
                       break;
                       case 3:
                           System.out.println("All customer info\n");
                           for (Customer c : customers)
                           {
                               System.out.println(c);
                           }
                           break;
                           default:
                               System.out.println("Please enter a valid option");
               }


        }
    }
}
