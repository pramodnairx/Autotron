/**
 * 
 */
package com.autotron.engine;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.autotron.engine.keyword.model.TestStep;

/**
 * @author prnair
 *
 */
public class ExecutionRunner {

	private WebDriver driver;
	
	/**
	 * 
	 */
	public ExecutionRunner() {
	}
	
	/**
	 * 
	 */
	public void executeRun(ArrayList<TestStep> steps, WebDriver driver) {

		this.driver = driver;
		
		Iterator<TestStep> iterator = steps.iterator();
		while(iterator.hasNext()) {
			TestStep step = iterator.next();
			processStep(step);
		}
		
	}
	
	
	/**
	 * 
	 * @param step
	 */
	private void processStep(TestStep step) {
		
		if(step.getAction().equals(TestStep.ACTION_NAVIGATE)) {
			processNavigateAction(step);
		}
	}
	
	
	/**
	 * 
	 */
	private void processNavigateAction(TestStep step) {
		
		if(step.getTargetType().equals("URL")) {
			String navigationURL = step.getTarget();
			driver.get(navigationURL);
		}
	}
	
	
	/**
	 * 
	 * @param waitTime
	 * @param pageTitle
	 */
	private void waitForPageLoad(int waitTime, String pageTitle) {
        (new WebDriverWait(driver, waitTime)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().startsWith(pageTitle);
            }
        });	
	}


}
