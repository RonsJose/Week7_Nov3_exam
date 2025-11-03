package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<Customer>();
        int option=0;

        while(option!=4)
        {
            System.out.println("==== Customer Management System ====\n\n1) Add Customer\n\n2) Update Customer\n\n 3) Display All\n\n 4) Exit\n\n");

            System.out.print("Enter: ");
            String optionStr=sc.nextLine().trim();

            try
            {
                option=Integer.parseInt(optionStr);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Please enter a number: " + e.getMessage() );
            }
        }
    }
}
