/**
 * 
 */
package com.autotron.engine;

import java.io.File;
import java.util.List;

/**
 * @author prnair
 *
 */
public class TestCase {

	//
	private List<Action> testActions;
	
	//
	private String testCaseID;
	
	/**
	 * 
	 */
	public TestCase(String testCaseID) {
		this.testCaseID = testCaseID;
	}
	
	/**
	 * 
	 * @param actionFile
	 * @throws AutotronException
	 */
	public void loadActions (File actionFile) throws AutotronException {
		
	}

	/**
	 * @return the testCaseID
	 */
	public String getTestCaseID() {
		return testCaseID;
	}

	/**
	 * @return the testActions
	 */
	public List<Action> getTestActions() {
		return testActions;
	}

	
}
