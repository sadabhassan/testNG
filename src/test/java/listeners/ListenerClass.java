package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {
    public void onTestStart(ITestResult result) {
        System.out.println("onTestStart executed" + result.getName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess executed" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure executed" + result.getName());
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped executed" + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage executed" + result.getName());
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
        System.out.println("onTestFailedWithTimeout executed" + result.getName());
    }

    public void onStart(ITestContext context) {
        System.out.println("onStart executed" + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("onFinish executed" + context.getName());
    }
}
