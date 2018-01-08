package com.org.uiautomation;

/**
 * The Class LifeCycleConfig.
 */
public class ConfigFileData {

	/** The browser. */
	private String browser;
	
	/** The runlocally. */
	private String runlocally;
	
	/** The url. */
	private String URL;
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/** The sqresellerresults. */
	private String sqresellerresults;
	
	/**
	 * Instantiates a new life cycle config.
	 */
	public ConfigFileData(){
		
	}
	
	/**
	 * Instantiates a new life cycle config.
	 *
	 * @param browser the browser
	 * @param runlocally the runlocally
	 * @param uRL the u rl
	 * @param username the username
	 * @param password the password
	 */
	public ConfigFileData(String browser, String runlocally, String uRL,
			String username, String password,String sqresellerresults ) {
		super();
		this.browser = browser;
		this.runlocally = runlocally;
		URL = uRL;
		this.username = username;
		this.password = password;
		this.sqresellerresults =sqresellerresults;
	}

	/**
	 * Gets the browser.
	 *
	 * @return the browser
	 */
	public String getBrowser() {
		return browser;
	}

	/**
	 * Sets the browser.
	 *
	 * @param browser the new browser
	 */
	public void setBrowser(String browser) {
		this.browser = browser;
	}

	/**
	 * Gets the runlocally.
	 *
	 * @return the runlocally
	 */
	public String getRunlocally() {
		return runlocally;
	}

	/**
	 * Sets the runlocally.
	 *
	 * @param runlocally the new runlocally
	 */
	public void setRunlocally(String runlocally) {
		this.runlocally = runlocally;
	}

	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * Sets the url.
	 *
	 * @param uRL the new url
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Gets the sqresellerresults.
	 *
	 * @return the sqresellerresults
	 */
	public String getSqresellerresults() {
		return sqresellerresults;
	}

	/**
	 * Sets the sqresellerresults.
	 *
	 * @param sqresellerresults the new sqresellerresults
	 */
	public void setSqresellerresults(String sqresellerresults) {
		this.sqresellerresults = sqresellerresults;
	}
	
}
