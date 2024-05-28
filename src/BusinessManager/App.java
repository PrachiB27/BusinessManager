package BusinessManager;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        boolean isRunning = true;
        int option;
        Scanner scanner = new Scanner(System.in);
        BusinessUtilities businessUtilities = new BusinessUtilities();
        System.out.println("################# WELCOME TO BUSINESS MANAGER #################");
        while(isRunning) {
            displayMenu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                	try {
                	businessUtilities.createBusiness();  
                	}catch(InputMismatchException e) {
                		System.out.println("Please provide valid input");
                	}
                    break;

                case 2:
                    // READ BUSINESS DETAILS LOGIC
                	businessUtilities.readBusiness();
                    break;

                case 3:
                    // UPDATE BUSINESS DETAILS LOGIC
                	try {
        			businessUtilities.updateBusiness();	     
                	}catch(InputMismatchException e) {
                		System.out.println("Please provide valid input");
                	}
                    break;                    

                case 4:
                    // DELETE BUSINESS LOGIC
                	businessUtilities.deleteBusiness();
                    break;

                case 5:
                    System.out.println("Exiting business manager...");
                    isRunning = false;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Please choose an option from below menu:");
        System.out.println("1. Create business");
        System.out.println("2. Read Business Details");
        System.out.println("3. Update Business Details");
        System.out.println("4. Delete Business Details");
        System.out.println("5. Quit Program");
    }
       
   
}