/**
 * 
 */
package com.autotron.engine.keyword.model;

/**
 * @author prnair
 *
 */
public class TestStep {

	/**
	 * 
	 */
	public static final String ACTION_NAVIGATE = "Navigate";
	
	/**
	 * 
	 */
	public static final String ACTION_VERIFY = "Verify";
		
	/**
	 * 
	 */
	public static final String ACTION_INPUT = "Input";
	
	/**
	 * 
	 */
	public static final String ACTION_SUBMI = "Submit";
	
	/**
	 * 
	 */
	public static final String ACTION_CLICK = "Click";
		
	
	/**
	 * 
	 */
	private String testCaseRef;
	
	/**
	 * 
	 */
	private String testStepRef;
	
	/**
	 * 
	 */
	private String action;
	
	/**
	 * 
	 */
	private String targetType;
	
	/**
	 * 
	 */
	private String target;
	
	/**
	 * 
	 */
	public TestStep() {
	}

	/**
	 * @return the testCaseRef
	 */
	public String getTestCaseRef() {
		return testCaseRef;
	}

	/**
	 * @param testCaseRef the testCaseRef to set
	 */
	public void setTestCaseRef(String testCaseRef) {
		this.testCaseRef = testCaseRef;
	}

	/**
	 * @return the testStepRef
	 */
	public String getTestStepRef() {
		return testStepRef;
	}

	/**
	 * @param testStepRef the testStepRef to set
	 */
	public void setTestStepRef(String testStepRef) {
		this.testStepRef = testStepRef;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the targetType
	 */
	public String getTargetType() {
		return targetType;
	}

	/**
	 * @param targetType the targetType to set
	 */
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	/**
	 * @return the target
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @param target the target to set
	 */
	public void setTarget(String target) {
		this.target = target;
	}

	
}
