package dataProvider;

import org.testng.annotations.Test;

public class dataProviderExample {
    @Test(dataProvider = "getUserCredentials", dataProviderClass = dataProviderClass.class)
    public void displayCredentials(String user, String password){
        System.out.println(user);
        System.out.println(password);
    }

    @Test(dataProvider = "credentials", dataProviderClass = dataProviderClass.class)
    public void login(String userName, String pwd) {
        System.out.println(userName + "  "+ pwd);
    }
}
