package uk.axone.devintest.maven.tests;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Test;

public class Test_Application {

    @Test
    public void test1(){
        System.out.println("running test 1");
    }

    @Test
    public void test2(){
        System.out.println("running test 2");
    }

    @Test
    public void test3(){
        System.out.println("running test 3");
    }

    @Test
    public void test4(){
        int i = 100/0;
        System.out.println("running test 4");
    }

    @Test
    public void test5(){
        System.out.println("running test 5");
    }

}
