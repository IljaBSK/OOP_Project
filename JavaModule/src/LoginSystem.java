package JavaModule.src;

import java.io.*;
import java.util.*;

public class LoginSystem {

    private HashMap<String, User > users;

    public LoginSystem() throws IOException {
        users = CSVManager.readUsers();
        System.out.println("Debug: Users loaded into the system:");
        for (String username : users.keySet()) {
            User user = users.get(username);
            System.out.println("  Username: " + username + ", Password: " + user.getPassword() + ", Role: " + user.getJobType());
        }
    }

    public User loginFunction() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select your role: A)dmin E)mployee H)R");
        String command = scanner.nextLine().trim(); // Trim to remove extra spaces

        System.out.println("Enter your username");
        String username = scanner.nextLine().trim(); // Trim input
        System.out.println("Enter your password");
        String password = scanner.nextLine().trim(); // Trim input

        // Debugging: Show entered credentials
        System.out.println("Debug: Entered Username: " + username);
        System.out.println("Debug: Entered Password: " + password);

        if (users.containsKey(username)) {
            User user = users.get(username);

            // Debugging: Show stored credentials
            System.out.println("Debug: Stored Username: " + user.getUsername());
            System.out.println("Debug: Stored Password: " + user.getPassword());
            System.out.println("Debug: Stored Role: " + user.getJobType());

            if (user.getPassword().equals(password)) { // Compare passwords
                if (command.equalsIgnoreCase("A") && user.getJobType().equalsIgnoreCase("Admin")) {
                    System.out.println("Login successful as Admin.");
                    return user; // Return user if the role matches
                } else if (command.equalsIgnoreCase("E") && user.getJobType().equalsIgnoreCase("Employee")) {
                    System.out.println("Login successful as Employee.");
                    return user;
                } else if (command.equalsIgnoreCase("H") && user.getJobType().equalsIgnoreCase("HR")) {
                    System.out.println("Login successful as HR.");
                    return user;
                } else {
                    System.out.println("Role mismatch. Expected Role: " + user.getJobType());
                }
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }

        return null;
    }
}
