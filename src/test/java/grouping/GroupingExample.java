package grouping;

import org.testng.annotations.Test;

public class GroupingExample {
    @Test(groups = "sanity")
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test(groups = "smoke")
    public void test2(){
        System.out.println("I am in test2");
    }

    @Test(groups = "sanity")
    public void test3(){
        System.out.println("I am in test3");
    }

    @Test(groups = "smoke")
    public void test4(){
        System.out.println("I am in test4");
    }

    @Test(groups = "sanity")
    public void test5(){
        System.out.println("I am in test5");
    }

    @Test(groups = "smoke")
    public void test6(){
        System.out.println("I am in test6");
    }
}
