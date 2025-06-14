package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithIRetryAnalyzer {
	@Test(retryAnalyzer = listenerUtility.RetryAnalyzerImplementation.class)
	public void test() {
		System.out.println("test");
		Assert.assertEquals("hdfc", "hfdc");
	}

}
