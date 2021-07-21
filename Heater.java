/**
 * A simple heater, controlled by the
 * methods "warmer" and "cooler".
 * 
 * @author	n-c0de-r
 * @version	2021.07.21
 */

public class Heater {
	private int temperature;

	/**
	 * Constructor for objects of class Heater.
	 */
	public Heater() {
		temperature = 15;
	}

	/**
	 * Increase the temperature by 2 degrees.
	 */
	public void warmer() {
		temperature = temperature + 2;
	}

	/**
	 * Reduce the temperature by 2 degrees.
	 */
	public void cooler() {
		temperature = temperature - 2;
	}

	/**
	 * Get the current temperature set to the heater.
	 */
	public int getTemperature() {
		return temperature;
	}
}
