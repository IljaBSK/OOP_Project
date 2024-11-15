package JavaModule.src;

import java.io.IOException;
import java.util.Scanner;

public class PaySlipMenu {

    public void run(LoginSystem login) throws IOException{
        User user = login.loginFunction();
    }
}