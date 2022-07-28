/**
 * A simple heater, controlled by the
 * methods "cooler" and "warmer".
 * 
 * @author	n-c0de-r
 * @version	2021.07.21
 * @version 2022.07.28
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
        // Simple check for conflicting min and max values
        // If the minimum is higher than the max, set fixed values.
        if (newMin > newMax) {
            System.out.println("Sorry, that is not possible.");
            System.out.println("The minimum will be set to 0.");
            System.out.println("The maximum will be set to 60.");
            newMin = 0;
            newMax = 60;
        }
        
        // Initialize instance variables
        min = newMin;
        max = newMax;
        increment = 2;
        temperature = 15;

        // Check if minimum is higher than initial temperature
        if (min > temperature) {
            temperature = min; // Up the temperature
        }
        // Check if maximum is lower than initial temperature
        else if (max < temperature) {
            temperature = max; // Lower the temperature
        }
        
        // One line solution for boundry checks.
        // temperature = Math.max(Math.min(temperature, max), min);
        // or
        // temperature = Math.min(Math.max(temperature, min), max);
    }

    /**
     * Reduce the temperature by the increment value.
     */
    public void cooler() {
        temperature = temperature - increment; // Set the new temperature ...
        
        // ... check if the decrement is lower than min, ...
        if (temperature < min) {
            temperature = min; // ... if so, set to min.
        }
        // ... if not, it stays as it is set already.

        // Same result, one line solution!
        // temperature = Math.max(min, temperature - increment);
    }

    /**
     * Increase the temperature by the increment value.
     */
    public void warmer() {
        temperature = temperature + increment; // Set the new temperature ...
        
        // ... check if the increment is higher than max, ...
        if (temperature > max) {
            temperature = max; //... if so, set to max.
        }
        // ... if not, it stays as it is set already.

        // Same result, one line solution!
        // temperature = Math.min(max, temperature + increment);
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
     * @param valueOfIncrement    The increment value.
     */
    public void setIncrement(int valueOfIncrement) {
        // Check if the increment is negative, ...
        if (valueOfIncrement < 0) {
            valueOfIncrement = -valueOfIncrement; // ... if so, switch the sign.
        }
        // ... then set the new increment.
        increment = valueOfIncrement;

        // One line solution.
        // increment = Math.abs(valueOfIncrement);
    }
}
