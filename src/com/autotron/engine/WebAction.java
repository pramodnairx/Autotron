/**
 * 
 */
package com.autotron.engine;

import java.awt.image.BufferedImageFilter;
import java.io.File;
import java.io.FileWriter;

import org.apache.http.message.BufferedHeader;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.autotron.engine.Action.Screenshots;

/**
 * @author prnair
 *
 */
public abstract class WebAction implements Action {

	protected TestContext testContext;
	
	protected Screenshots screenshots;
	
	protected int waitTime;
	
	/**
	 * 
	 */
	public WebAction() {
	}
	
	/**
	 * 
	 * @param screenshots
	 * @param waitTime
	 */
	public WebAction(Screenshots screenshots, int waitTime) {
		this.screenshots = screenshots;
		this.waitTime = waitTime;
	}

	/* (non-Javadoc)
	 * @see com.autotron.engine.Action#setTestContext(com.autotron.engine.TestContext)
	 */
	@Override
	public void setTestContext(TestContext testContext) {
		this.testContext = testContext;
	}

	/* (non-Javadoc)
	 * @see com.autotron.engine.Action#getTestContext()
	 */
	@Override
	public TestContext getTestContext() {
		return this.testContext;
	}

	@Override
	public Screenshots getScreenshotRequirement() {
		return screenshots;
	}

	/**
	 * 
	 */
	protected void processPreScreenshot() {
		if (getScreenshotRequirement() == Screenshots.SCREENSHOT_BEFORE 
				|| getScreenshotRequirement() == Screenshots.SCREENSHOT_BEFORE_AND_AFTER) {
			byte[] screen = ((TakesScreenshot)getTestContext().getWebDriver()).getScreenshotAs(OutputType.BYTES);
			new FileWriter(getTestContext().getScreenshotsFile()).
			
		}

	}
}
