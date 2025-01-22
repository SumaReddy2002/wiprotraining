package wiprotraining;

public class DefaultValues {
	    // Instance variables
	    byte byteValue;
	    short shortValue;
	    int intValue;
	    long longValue;
	    float floatValue;
	    double doubleValue;
	    char charValue;
	    boolean booleanValue;
	    String stringValue; // Reference type

	    // Static variables
	    static int staticIntValue;
	    static double staticDoubleValue;

	    public static void main(String[] args) {
	        // Create an object to access instance variables
	        DefaultValues defaults = new DefaultValues();

	        // Display default values of instance variables
	        System.out.println("Default values of instance variables:");
	        System.out.println("byte: " + defaults.byteValue);
	        System.out.println("short: " + defaults.shortValue);
	        System.out.println("int: " + defaults.intValue);
	        System.out.println("long: " + defaults.longValue);
	        System.out.println("float: " + defaults.floatValue);
	        System.out.println("double: " + defaults.doubleValue);
	        System.out.println("char: [" + defaults.charValue + "]"); // Display char as is
	        System.out.println("boolean: " + defaults.booleanValue);
	        System.out.println("String: " + defaults.stringValue);

	        // Display default values of static variables
	        System.out.println("\nDefault values of static variables:");
	        System.out.println("static int: " + staticIntValue);
	        System.out.println("static double: " + staticDoubleValue);
	    }
	}
