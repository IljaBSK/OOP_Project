package JavaModule.src;

import java.util.Scanner;

public class HR extends User {

    public HR(String username, String password, String jobType) {
        super(username, password, jobType);
    }

    public void promoteEmployee() {

        //HR enters id after method promoteEmployee is called then opens csv file for the Employees and
        //then promote from there changing jobType also create a reader and writer in CSVManger
        //to open and change and write the differences also add a check for when a jobType
        //entered doesn't exist also allow HR to change the Scalepoint

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Promoting Employee: " + employee.getName());
        //System.out.println("Current job title: " + employee.getJobTitle());
        System.out.print("Enter new job title for promotion: ");
        String newTitle = scanner.nextLine();

        //employee.setPendingPromotion(newTitle);
        //System.out.println("Promotion request sent for " + employee.getName() +
          //      ". Awaiting their decision upon next login.");
    }

    public void showHRMenu(Employee employee) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHR Menu:");
            System.out.println("P)romote Employee");
            System.out.println("E)xit");
            System.out.print("Select an option: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "P":
                    //promoteEmployee(employee);
                    break;
                case "E":
                    System.out.println("Exiting HR system...");
                    return; // Exit the menu
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
