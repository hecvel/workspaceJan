//Hector Velazco 1/16 Asks for a number, generates a random number
import java.util.*;
public class RandomGuess 
{
	public static void main(String[] args)
	
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Think of a number 1-10");
		
		int guess = in.nextInt();
		
		System.out.println("Entered number: " + guess + " as your guess");
				
		System.out.println("The number is " + (1 + (int)(Math.random() * 10)));
		
	}
}
