public class Main {

	public static void main(String[] args) {
		
		// Create new ReadFile object game to read in data
		ReadFile game = new ReadFile();
		
		// Return number of generations from getFileInformation method in 
		// game(ReadFile object) and store in generation
	    int gen = game.getGeneration();
	    
	    // Create CreateThread object to process threads
	    CreateThread thread = new CreateThread();

	    // Process threads for each generation
	    for (int i = 0; i < gen; i++) {
	    	thread.processThread(game.currentGen, game.nextGen);	
	    }
	    
	    // Print out grid after specified number of generations
	    System.out.println("The output after " + gen + " generation(s) is:");
	    for (int i = 0; i < 20; i++) {
	    	for (int j = 0; j < 20; j++) {
	            System.out.print(String.valueOf(game.currentGen[i][j]));
	        }
	        System.out.println("");
	    }
	}
}
