package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    @Test
    @Parameters({"userName", "password"})
    public void executeParameter(String user, String pwd){
        System.out.println(user);
        System.out.println(pwd);
    }
}
