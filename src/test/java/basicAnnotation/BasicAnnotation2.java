package basicAnnotation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation2 extends baseAnnotation {
    @Test
    public void test4(){
        System.out.println("I am in test4");
    }

    @Test
    public void test5(){
        System.out.println("I am in test5");
    }
    @Test
    public void test6(){
        System.out.println("I am in test6");
    }
}
