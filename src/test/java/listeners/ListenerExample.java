package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// this is the first way and other way is defining listeners in xml
// @Listeners(listeners.ListenerClass.class)
public class ListenerExample {
    @Test
    public void startCar() {
        System.out.println("car started");

    }

    @Test(dependsOnMethods = "startCar")
    public void driveCar() {
        System.out.println("drive car");
        Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar", "driveCar"})
    public void stopCar() {
        System.out.println("stop car");
    }

    @Test(dependsOnMethods = "stopCar", alwaysRun = true)
    public void parkCar() {
        System.out.println("park car");
    }
}


