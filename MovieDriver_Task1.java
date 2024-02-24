import java.util.Scanner;

public class MovieDriver_Task1 {
	
	public static void main(String[] args) {
		
		//initiating the reading function 
		Scanner stdin = new Scanner(System.in);
		
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
	
        stdin.close();
	}
}
