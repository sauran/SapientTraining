//Listing 1
// Compute distance light travels using long variables.

import java.util.logging.Logger;
public class Light{

/**
* The main method contains
* 
*/

  public static void main(String[] args) {
// TODO Auto-generated method stub
	  Logger log = Logger.getLogger(Light.class.getName());
    int lightSpeed;
    long days;
    long seconds; 
    
    // approximate speed of light in miles per second
    lightSpeed = 186000;

    days = 1000; // specify number of days here

    seconds = days * 24 * 60 * 60; // convert to seconds
    long distance;
    distance = lightSpeed * seconds; // compute distance

    log.fine("In " + days);
    log.fine(" days light will travel about ");
    log.fine(distance + " miles.");
  }
  

}


