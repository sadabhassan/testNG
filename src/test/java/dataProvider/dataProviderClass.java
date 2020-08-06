package dataProvider;

import org.testng.annotations.DataProvider;

public class dataProviderClass {
    @DataProvider(name = "getUserCredentials")
    public Object[][] getUserCredentials() {
        String[][] userCredentials = new String[2][2];
        userCredentials[0][0] = "sadab";
        userCredentials[0][1] = "abc123";
        userCredentials[1][0] = "test123";
        userCredentials[1][1] = "xyz123";
        return userCredentials;
    }
}
