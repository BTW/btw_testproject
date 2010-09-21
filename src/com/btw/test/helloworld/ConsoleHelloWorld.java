package com.btw.test.helloworld;

/**
 * Simple console 'Hello World' class
 *
 * @author Alexander Borisov
 *
 */
public class ConsoleHelloWorld {

	/*
	 * System properties names
	 */
	private static final String OS_NAME_PROPERTY = "os.name";
	private static final String USER_NAME_PROPERTY = "user.name";

	/*
	 * Default values
	 */
	private static final String DEFAULT_OS_NAME = "<Unknown>";
	private static final String DEFAULT_USER_NAME = "Incognito";

	/**
	 * Constructor
	 */
	ConsoleHelloWorld(){
		writeInfo(System.getProperty(USER_NAME_PROPERTY, DEFAULT_USER_NAME),
			System.getProperty(OS_NAME_PROPERTY, DEFAULT_OS_NAME));
	}

	protected void writeInfo(String userName, String osName){
		System.out.printf("Hello, %s!%nYou're using '%s' operation system, aren't you?%n", userName, osName);
		System.out.println("I can't see Hello World words, where are they?");
	}

	/**
	 * Entrance point
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		new ConsoleHelloWorld();
	}

}
