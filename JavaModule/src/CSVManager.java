package JavaModule.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class CSVManager {
    private static final String filename = "UserLogins.csv";

    public static HashMap<String, String> readUsers() throws IOException{
        HashMap<String, String> users = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        reader.readLine();

        while((line = reader.readLine()) != null){
            String[] parts = line.split(",");
            if(parts.length == 3){
                String jobType = parts[0].trim();
                String username = parts[1].trim();
                String password = parts[2].trim();
                users.put(username, new Employee(jobType, username, password));
            }
        }
        reader.close();
        return users;
    }
}

