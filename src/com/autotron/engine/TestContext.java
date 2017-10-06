/**
 * 
 */
package com.autotron.engine;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

/**
 * @author prnair
 *
 */
public class TestContext {

	private Map<String, String> store;
	
	private WebDriver webDriver;
	
	private File screenshotsFile;
	
	
	/**
	 * 
	 */
	public TestContext() {
		store = new HashMap<String, String>();
	}
	
	
	/**
	 * 
	 * @param key
	 * @param value
	 */
	public void addToStore(String key, String value) {
		store.put(key, value);
	}
	
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public String getFromStore(String key) {
		return store.get(key);
	}
	
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean isStored(String key) {
		return store.containsKey(key);
	}
	
	
	/**
	 * 
	 * @param key
	 */
	public void removeFromStore(String key) {
		store.remove(key);
	}


	/**
	 * @return the webDriver
	 */
	public WebDriver getWebDriver() {
		return webDriver;
	}


	/**
	 * @param webDriver the webDriver to set
	 */
	public void setWebDriver(WebDriver webDriver) {
		this.webDriver = webDriver;
	}


	/**
	 * @return the screenshotsFile
	 */
	public File getScreenshotsFile() {
		return screenshotsFile;
	}


	/**
	 * @param screenshotsFile the screenshotsFile to set
	 */
	public void setScreenshotsFile(File screenshotsFile) {
		this.screenshotsFile = screenshotsFile;
	}

}
