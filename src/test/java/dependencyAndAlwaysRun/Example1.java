package dependencyAndAlwaysRun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example1 {
    @Test
    public void startCar(){
        System.out.println("car started");

    }
    @Test(dependsOnMethods = "startCar")
    public void driveCar(){
        System.out.println("drive car");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startCar", "driveCar"})
    public void stopCar(){
        System.out.println("stop car");
    }
    @Test(dependsOnMethods = "stopCar", alwaysRun = true)
    public void parkCar(){
        System.out.println("park car");
    }

}
