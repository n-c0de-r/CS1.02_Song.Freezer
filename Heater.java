/**
 * A simple heater, controlled by the
 * methods "warmer" and "cooler".
 * 
 * @author	n-c0de-r
 * @version	2021.07.21
 */

public class Heater {
	private int temperature;
	private int min;
	private int max;
	private int increment;

	/**
	 * Constructor for objects of class Heater.
	 * 
	 * @param newMin The minimum temperature allowed for this heater.
	 * @param newMax The maximum temperature allowed for this heater.
	 */
	public Heater(int newMin, int newMax) {
		// Initialize instance variables
		min = newMin;
		max = newMax;
		increment = 2;
		temperature = 15;
		
		// Simple check for invalid values
		// If the minimum is higher than the max, set it to 0.
		if (newMin > newMax) {
			System.out.println("Sorry, that is not possible.");
			System.out.println("The minimum will be set to 0.");
			min = 0;
			max = newMax;
		}
		// If the maximum is lower than the min, set it to 60.
		else if (newMin > newMax) {
			System.out.println("Sorry, that is not possible.");
			System.out.println("The maximum will be set to 60.");
			min = newMin;
			max = 60;
		}
		
		// Check if minimum is higher than initial temperature
		if (temperature < newMin) {
			temperature = newMin;
		}
		// Check if maximum is lower than initial temperature
		if (temperature > newMax) {
			temperature = newMax;
		}
	}

	/**
	 * Increase the temperature by the increment value.
	 */
	public void warmer() {
		// Check if the increment is higher than max, ...
		if ((temperature + increment) > max) {
			//... if so, set to max.
			temperature = max;
		} else {
			// ... if not, set to desired temperature
			temperature = temperature + increment;
		}
		
		// Same result, one line solution!
		// temperature = Math.min(max, temperature + increment);
	}

	/**
	 * Reduce the temperature by the increment value.
	 */
	public void cooler() {
		// Check if the decrement is lower than min, ...
//		if ((temperature - increment) < min) {
//			// ... if so, set to min.
//			temperature = min;
//		} else {
//			// ... if not, set to desired temperature
//			temperature = temperature - increment;
//		}
		
		// Same result, one line solution!
		 temperature = Math.max(min, temperature - increment);
	}

	/**
	 * Get the current temperature set to the heater.
	 */
	public int getTemperature() {
		return temperature;
	}

	/**
	 * Sets the increment value to the given amount.
	 * 
	 * @param valueOfIncrement	The increment value.
	 */
	public void setIncrement(int valueOfIncrement) {
		// Check if the increment is negative, ...
		if (valueOfIncrement >= 0)
		{
			increment = valueOfIncrement;
		}
		// ... otherwise convert to positive.
		else {
			increment = -valueOfIncrement;
		}
		
		
		// Only allow positive numbers, one line solution.
		// increment = Math.abs(valueOfIncrement);
	}
}
