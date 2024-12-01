import java.util.*;

public class Main {
    public static void main(String args[]) {
        try {
            double units, amount = 0;
            String cust_no, cust_name, connection;
            int prevr, currr;
            Scanner input = new Scanner(System.in);

            System.out.println("-----ACSharma Electricity-----");
            System.out.println("----Electric Billing System----\n");

            System.out.println("Enter customer no:");
            cust_no = input.next();

            System.out.println("Enter customer name:");
            cust_name = input.next();

            System.out.println("Enter prev month reading:");
            prevr = input.nextInt();

            System.out.println("Enter current month reading:");
            currr = input.nextInt();

            System.out.println("Enter type of connection(D/C):");
            connection = input.next();

            units = currr - prevr;

            // Logic for calculating the bill based on the connection type
            if (connection.equalsIgnoreCase("D")) {
                if (units <= 0)
                    amount = 0;
                else if (units <= 100)
                    amount = units * 2;
                else if (units <= 200)
                    amount = units * 2.5;
                else if (units <= 500)
                    amount = units * 4;
                else
                    amount = units * 6;
            } else if (connection.equalsIgnoreCase("C")) {
                if (units <= 0)
                    amount = 0;
                else if (units <= 100)
                    amount = units * 2;
                else if (units <= 200)
                    amount = units * 4.5;
                else if (units <= 500)
                    amount = units * 6;
                else
                    amount = units * 7;
            } else {
                System.out.println("Invalid connection type. Please enter 'D' or 'C'.");
                return;
            }

            System.out.println("Bill amount: " + amount);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
