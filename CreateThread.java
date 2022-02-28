public class CreateThread {
	public void processThread(char[][] currentGenPassed, char[][] nextGenPassed) 
	{
		// create a thread for each cell in the 20x20 grid
		Thread thread[] = new Thread[400];
		int index = 0;
		for(int i=0; i<20; i++) {
			for(int j=0; j<20; j++) {
				thread[index] = new Thread(new GameOfLife(i,j,currentGenPassed,
								nextGenPassed));
				thread[index].start();
				index++;
			}
		}
		try {
			for(int i = 0; i<400; i++) {
				thread[i].join();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		// assign nextGen values into grid values
		for(int i=0; i<20; i++) {
			for(int j=0; j<20; j++) {
				currentGenPassed[i][j] = nextGenPassed[i][j];
			}
		}
		
	}
}
