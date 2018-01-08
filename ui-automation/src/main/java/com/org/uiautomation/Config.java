package com.org.uiautomation;

/**
 * The Enum Config.
 */
public enum Config {

	/** The browser. */
	BROWSER("browser","BROWSER"),
	
	/** The runlocally. */
	RUNLOCALLY("runlocally","RUNLOCALLY"),
	
	/** The url. */
	URL("url","URL"),
	URL1("url1","URL1"),
	
	
	/** The username. */
	USERNAME("username","USERNAME"),
	
	/** The password. */
	PASSWORD("password","PASSWORD"),
	
	/** The SQResellerResults. */
	SQRESELLERRESULTS("sqresellerresults","SQRESELLERRESULTS");
	
	/** The configvalue. */
	private final String configvalue;
	
	/** The vmarg. */
	private final String vmarg;
    
	/**
	 * Instantiates a new config.
	 *
	 * @param configvalue the configvalue
	 * @param vmarg the vmarg
	 */
	Config(String configvalue,String vmarg) {
		this.configvalue = configvalue;
		this.vmarg = vmarg;
    }

	/**
	 * Gets the configvalue.
	 *
	 * @return the configvalue
	 */
	public String getConfigvalue() {
		return configvalue;
	}

	/**
	 * Gets the vmarg.
	 *
	 * @return the vmarg
	 */
	public String getVmarg() {
		return vmarg;
	}
    
    
}
