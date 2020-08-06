package priorityAndDisabling;

import org.testng.annotations.Test;

public class Example1 {

        @Test(priority = 1, invocationCount = 3)
        public void testB(){
            System.out.println("I am in test1");
        }

        @Test(priority = 2, enabled = false)
        public void testA(){
            System.out.println("I am in test2");
        }
        @Test(priority = 3)
        public void testC(){
            System.out.println("I am in test3");
        }
}