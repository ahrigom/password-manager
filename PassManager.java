import java.util.ArrayList;
import java.util.Scanner;

public class PassManager {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in); // Create a scanner object
        ArrayList<Account> accounts = new ArrayList<>(); // A java array that can have things added or removed whenever you want

        boolean running = true; //

        while(running){
            // Present menu options
            System.out.println("Menu options:\nadd account\nview account\nexit");
            // Request user input
            System.out.println("What would you like to do today? ");
            String ans = newScan.nextLine(); // Get that input

            // If the user chooses to add an account
            if (ans.equals("add account")){
                // Asks for the website name
                System.out.print("Website name? ");
                String website = newScan.nextLine(); // Collect website name input
                // Asks for the username
                System.out.print("Username? ");
                String username = newScan.nextLine(); // Collect the username input
                // Asks for the password
                System.out.print("Password? ");
                String password = newScan.nextLine(); // Collect the password input

                // Create the Account object
                Account newAcc = new Account(website, username, password);

                // Add/Store that account object to the ArrayList
                accounts.add(newAcc);

                // Testing purposes
                System.out.println("Account added!");

            }

            // If the user chooses to view the current account
            if (ans.equals("view account")){
                // Checks if the ArrayList (accounts) has an account within
                if (accounts.isEmpty()){
                    System.out.print("No accounts found");
                }
                else {
                    for (int i = 0; i < accounts.size(); i++){
                        // Get the item at the current index
                        Account current = accounts.get(i);
                        // Uses the getters from the Account class to display the information
                        System.out.println("Website: " + current.getWebsite());
                        System.out.println("Username: " + current.getUsername());
                        System.out.println("Password: " + current.getPassword());
                    }
                }
            }

            // If the user chooses the exit command
            if (ans.equals("exit")){
                System.out.print("Goodbye!");
                running = false;
            }
        }
    }
}
