import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		//initiating the reading function 
		Scanner stdin = new Scanner(System.in);
		
		boolean more = true;
		
		//initializing a loop that will check for user's answer and execute until false
		while (more) {
				
			//creating the movie object
			Movie movie = new Movie();
			
			//prompting the user to enter the movie name, reading it and setting it in our movie object
			System.out.println("Enter the name of a movie ");
			String title = stdin.nextLine();
			movie.setTitle(title);
			
			//prompting the user for the movie rating, reading it and setting it in our movie object
			System.out.println("Enter the rating of the movie ");
			String rating = stdin.nextLine();
			movie.setRating(rating);
			
			//prompting the user for the movie sold tickets, reading it and setting it in our movie object
			System.out.println("Enter the number of tickets sold for this movie ");
			int soldTickets = stdin.nextInt();
			movie.setSoldTickets(soldTickets);
			
			//Printing out the informations the user provided
			System.out.println(movie.toString());
			
			//reading the previous line feed
			stdin.nextLine();
			
			/*
			 * Prompting the user to chose between adding more movies and exiting, 
			 * reading the user input and executing accordingly
			*/
			System.out.println("Do you want to enter another? (y or n): ");
			String response = stdin.nextLine();
			if (!response.equalsIgnoreCase("y")) {
				more = false;
				System.out.println("Goodbye");
			}
		}
		stdin.close();
	}
}
