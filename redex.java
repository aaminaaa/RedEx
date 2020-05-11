/* 
Amina Hussain
Project 2: RedEx Corp

Sample Run: 
   Enter your full name: 
   Captain America
   Enter package weight: 
   32.0
   Captain, the total cost for your package is 72.25
*/

//program
import java.util.Scanner; //allows user to input values into console

public class redex {

	public static void main(String[] args) {
    // TODO Auto-generated method stub

	//allows for user to input values into console
		Scanner input = new Scanner(System.in);	
	
	//asks user to enter full name
		System.out.println("Enter your full name: ");
	
	//allows user to enter name via stringed characters
		String name = input.nextLine();
		int space = name.indexOf(' ');
		String firstName = name.substring(0, space);
		String lastName = name.substring(space + 1);
		
	//asks user to enter package weight	
		System.out.println("Enter package weight: ");
	
	//allows user to enter value for weight
		double weight = input.nextDouble();	
	
	//initiates cost
		double cost = 0;
	
 //conditionals
	//package cost if 0 < weight <= 15	
	if(0 < weight && weight <= 15 ) {
	     cost = 3 + (weight)* 4;
	     System.out.println(firstName + ", the total cost for your package is " + cost);
	//package if 15 < weight <= 25	
	} else if(15 < weight && weight <= 25){ 
		cost = 35 + (weight - 1)* 2;
		System.out.println(firstName + ", the total cost for your package is " + cost);
	//package if 25 < weight <= 40	
	} else if(25 < weight && weight <= 40) {
		cost = 7.25 + (weight - 12)* 3.25;
		System.out.println(firstName + ", the total cost for your package is " + cost);
	//package if weight > 40 OR weight < 0
	} else if(weight > 40 || weight < 0) {
		System.out.println(firstName + ", your package cannot be shipped.");
	}
	}
	}
		
	
	


