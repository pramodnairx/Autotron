/**
 * 
 */
package com.autotron.engine;

import java.io.File;
import java.util.logging.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


/**
 * @author prnair
 *
 */
public class NavigateAction extends WebAction {

	private static Logger logger = Logger.getLogger(NavigateAction.class.getName());
	
	/**
	 * 
	 */
	public NavigateAction() {
	}

	/**
	 * 
	 * @param screenshots
	 * @param waitTime
	 */
	public NavigateAction(Screenshots screenshots, int waitTime) {
		super(screenshots, waitTime);
	}
	
	/* (non-Javadoc)
	 * @see com.autotron.engine.Action#perform(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean perform(String parameter, String targetType, String target) throws AutotronException {
				
		WebDriver driver = getTestContext().getWebDriver();
		
		logger.info("WebDriver navigating to [" + target + "]");
		driver.get(target);
		return true;
	}

}
