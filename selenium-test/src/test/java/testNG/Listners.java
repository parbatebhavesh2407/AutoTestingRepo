package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

//ITestListeners - is an interface which has all methods for TestNG Listeners.
public class Listners implements ITestListener {

	/*
	 * @Override public void onTestSuccess(ITestResult result) {
	 * System.out.println("I successfully executed listner code"); }
	 */
	@Override
	 public void onTestSuccess(ITestResult result) {
		 System.out.println("----------------------------------------");
}
}
