package com.testing.test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestCalculator.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Number of successful tests in TestCalculator: " + (result.getRunCount() - result.getFailureCount()) + "/"
                + result.getRunCount());
        if(result.wasSuccessful()){
            System.out.println("All tests passed");
        }
    }
}
