package JavaModule.src;
import java.util.*;

public class LoginSystem {
    private HashMap<String, User> users;

    public LoginSystem(){
        users = CSVManager.readValidUsers();
    }

    public void loginFunction(){
        Scanner input = new Scanner(System.in);

        System.out.println("Select your role: A)dmin E)mployee H)R");
        String command = input.nextLine().trim(); // Trim to remove extra spaces

        System.out.println("Enter your username");
        String usernameIn = input.nextLine().trim();
        System.out.println("Enter your password");
        String passwordIn = input.nextLine().trim();

        if(users.containsKey(usernameIn)){
            User validUser = users.get(usernameIn); // retrieves the user from the hashmap
            if(validUser.getPassword().equals(passwordIn)){
                if (command.equalsIgnoreCase("A") && validUser.getJobType().equalsIgnoreCase("Admin")) {
                    System.out.println("Login successful as Admin.");
                } else if (command.equalsIgnoreCase("E") && validUser.getJobType().equalsIgnoreCase("Employee")) {
                    System.out.println("Login successful as Employee.");
                } else if (command.equalsIgnoreCase("H") && validUser.getJobType().equalsIgnoreCase("HR")) {
                    System.out.println("Login successful as HR.");
                } else{
                    System.out.println("Incorrect User Type");
                }

            }else{
                System.out.println("Incorrect password");
            }

        }else{
            System.out.println("Incorrect username");
        }

    }
}

