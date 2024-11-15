package JavaModule.src;

import java.io.*;
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
                users.put(username, new User(jobType, username, password));
            }
        }
        reader.close();
        return users;
    }

    public static void writeUsers(HashMap<String, User> users) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

        // Write the header
        writer.write("jobType,username,password");
        writer.newLine();

        // Write user data
        for (User user : users.values()) {
            writer.write(user.getJobType() + "," + user.getUsername() + "," + user.getPassword());
            writer.newLine();
        }
        writer.close();
    }

}



