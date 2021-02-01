package libs;

import org.junit.Assert;

public class Utils {
	
	/**
	 * Check is Steps Pass
	 * If not - failed test
	 * @param state
	 */
	public static void checkStepPassed(boolean state) {
		Assert.assertTrue("Some Steps not passed",state);
	}
	
	/**
	 * Check is test passed
	 * @param state
	 */
	public static void isTestPassed(boolean state) {
		Assert.assertTrue("Test Not Passed",state);
	}
	
	
	
	
}
