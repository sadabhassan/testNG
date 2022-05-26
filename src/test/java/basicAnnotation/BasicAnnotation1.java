package basicAnnotation;

import org.testng.annotations.Test;

public class BasicAnnotation1 extends baseAnnotation{

    @Test
    public void test1(){
        System.out.println("Git test branch A");
        System.out.println("I am in test1");
    }

    @Test
    public void test2(){
        System.out.println("I am in test2");
    }

    @Test
    public void test3(){
        System.out.println("I am in test3");
    }
}
