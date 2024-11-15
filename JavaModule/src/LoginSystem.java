package JavaModule.src;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {

   private HashMap<String, User> users;

   public LoginSystem() throws IOException {
       users = CSVManager.readUsers();
   }

   public User loginFunction(){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Select your role: A)dmin E)mployee H)R");
       String command = scanner.nextLine();

       System.out.println("Enter your username");
       String username = scanner.nextLine();
       System.out.println("Enter your password");
       String password = scanner.nextLine();

       if(users.containsKey(username)){
           User user = users.get(username);
           if(user.getPassword().equals(password)){
               if (command.equals("A") && user.getJobType().equals("Admin")) {
                   return user; // Return user if the role matches
               } else if (command.equals("E") && user.getJobType().equals("Employee")) {
                   return user;
               } else if (command.equals("H") && user.getJobType().equals("HR")) {
                   return user;
               } else {
                   System.out.println("Role mismatch.");
               }
           } else {
               System.out.println("Incorrect password.");
           }
       } else {
           System.out.println("Username not found.");
       }
   }
}
