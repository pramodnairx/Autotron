package com.autotron.engine;

/**
 * 
 * @author prnair
 *
 */
public interface Action {

	/**
	 * Screenshot constants
	 */
	public enum Screenshots {
		SCREENSHOT_NONE, SCREENSHOT_BEFORE, SCREENSHOT_AFTER, SCREENSHOT_BEFORE_AND_AFTER
	}
	
	/**
	 * 
	 * @param testContext
	 */
	public void setTestContext(TestContext testContext);
	
	/**
	 * 
	 * @return
	 */
	public TestContext getTestContext();
	
	/**
	 * 
	 * @param parameter
	 * @param targetType
	 * @param target
	 * @return
	 * @throws AutotronException
	 */
	public boolean perform(String parameter, String targetType, String target) throws AutotronException;
	
	/**
	 * 
	 * @return
	 */
	public Screenshots getScreenshotRequirement();
}
