// dostegeo
/*
 * George Doster
 */

import java.awt.Rectangle;

public class Homework2 {

	/* Write the constructor for Homework2.
	 * It takes in one parameter: a String
	 * Save the string as a private instance variable
	 */
private String q1;

public Homework2(String q11){
		q1 = q11;

}

	/* Write the method upperase
	 * It does not take in any parameters
	 * It returns a String
	 * Use String methods to turn the instance variable String into all
	 * uppercase letters and return the result
	 * Hint: Search the String class for 'uppercase'
	 */
	 public String uppercase(){
		 /* This should not create a new String,
		  * but should rather call the toUpperCase
		  * method on the String you have saved, q1
		  */
	 String q2 = "hello, world!";
	 String q2uc = q2.toUpperCase();
	 return q2uc;
}


	/* Write the method strip
	 * It takes in one paramter: a String
	 * It returns a String
	 * Use String methods to remove punctuation from the parameter String
	 * It should remove spaces, commas, periods, and exclamation points.
	 * Hint: Search the String class for 'replace'
	 */
public String strip(String q3) {

	String difString1=q3.replace(" ","");
	String difString2=difString1.replace(",","");
	String difString3=difString2.replace(".","");
	String difString4=difString3.replace("!","");
	return difString4;
}

	/* Fix the errors in the method problem4
	 */
	public Rectangle problems() {
		Rectangle r1 = new Rectangle(5, 10, 15, 20);
		double width = r1.getWidth();
		Rectangle r2 = new Rectangle();
		r2.translate(15, 25);
		Rectangle r3 = new Rectangle();
		r3.translate(10,20);
		return r3;
	}


	/* Use Rectangle methods to calculate and return the perimeter of the
	 * parameter Rectangle
	 */
	public double getPerimeter(Rectangle rect) {
		double height = rect.getHeight();
		double width = rect.getWidth();
		double perimeter = (2 * height) + (2 * width);
		return perimeter;


	}

}
