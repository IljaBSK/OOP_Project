package JavaModule.src;


import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {

   private HashMap<String, String> users;

   public LoginSystem() throws IOException {
       users = CSVManager.readUsers();
   }

   public User loginFunction(){
       Scanner scanner = new Scanner(System.in);

       System.out.println("Select your role: A)dmin E)mployee H)R");
       String command = scanner.nextLine();

       if(command.equals("A")){

       }else if(command.equals("E")){

       }else if(command.equals("H")){

       }else{
           System.out.println("Invalid input");
       }
   }
}
