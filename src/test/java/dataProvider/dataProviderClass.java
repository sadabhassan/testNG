package dataProvider;

import org.testng.annotations.DataProvider;
import utility.ExcelUtils;

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
    @DataProvider(name="credentials")
    public Object[][] getUserCredentialsUsingExcel() {
        ExcelUtils.initialize();
        String[][] userCredentials = new String[4][2];
        for(int i=0;i<=ExcelUtils.getLastRowNumber("PV");i++) {
            for(int j=0;j<2;j++) {
                userCredentials[i][j] = ExcelUtils.getCellValue("PV",i,j);
            }
        }
        return userCredentials;
    }
}
