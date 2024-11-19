package JavaModule.src;

import java.io.*;
import java.util.HashMap;

public class CSVManager {
    private static final String filename = "UserLogins.csv";


    public static HashMap<String, User> readValidUsers() {
        HashMap<String, User> users = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            reader.readLine();

            String line;

            while((line = reader.readLine()) != null){
                String[] details = line.split(",");
                if(details.length == 3){
                    String userName = details[0].trim();
                    String userPassword = details[1].trim();
                    String userJob = details[2].trim();

                    User newUser = new User(userName, userPassword, userJob);
                    users.put(userName, newUser);
                }else{
                    System.out.println("Too many details input");
                }
            }

            reader.close();
            return users;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}





