//Allows the user to input coordinates in order to create a shape

import TurtleGraphics.StandardPen;
import java.util.Scanner;
public class drawclass {
	
	    public static void main(String[] args){
	            StandardPen pen = new StandardPen();
				Scanner s = new Scanner(System.in);
				System.out.println("The goal is to make a rectangle : ");
				System.out.println("Hint : A rectangle has 4 right angles");
	            System.out.println("Input a number to customize turn : ");
	            int turn1 = s.nextInt();
	            System.out.println("give a number to move");
	            int move1 = s.nextInt();
	            System.out.println("Input a number to customize turn ");
	            int turn2 = s.nextInt();
	            System.out.println("give a number");
	            int move2= s.nextInt();
	            System.out.println("Input a number to customize turn ");
	            int turn3 = s.nextInt();
	            System.out.println("give a number to move");
	            int move3 = s.nextInt();
	            System.out.println("Input a number to customize turn ");
	            int turn4 = s.nextInt();
	            System.out.println("give a number to move");
	            int move4 = s.nextInt();
	        
	            /* Lifts the pen, and moves it to top of square */ 
	            pen.up();
	            pen.move(25);
	            pen.turn(90);
	            pen.move(25);
	            pen.down();
	            
	          // Draws square
	       
	            pen.turn(turn1); pen.move(move1); 
		        pen.turn(turn2); pen.move(move2);
		        pen.turn(turn3);pen.move(move3);
		        pen.turn(turn4);pen.move(move4);
		        
		       //pen.turn(90); pen.move(50);
		       // pen.turn(90); pen.move(50);
		       //pen.turn(90); pen.move(50);
			   // pen.turn(90); pen.move(50);	                                   
	        
	    }
	}


