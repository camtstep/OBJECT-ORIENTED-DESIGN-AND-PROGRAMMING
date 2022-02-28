class GameOfLife implements Runnable {
	  
	private int x, y; // both used to determine alive neighbors
	private char currentGen[][], nextGen[][];
	   
	public GameOfLife(int xAxis, int yAxis, char[][] currentGenPassed, char[][] 
					  nextGenPassed) {
		x = xAxis;
	    y = yAxis;
	    currentGen = currentGenPassed;
	    nextGen = nextGenPassed;
	}

	public boolean aliveInNextGen() {
		int aliveNeighbors = 0;
		boolean isNeighbor;
	       
	    // determine number of alive neighbors
	    for (int i = x-1; i <= x+1; i++) {
	    	for (int j = y-1; j <= y+1; j++) {
	    		
	    		// determine if a cell is a neighbor and not the cell itself and
	    		// that it is within the 20x20 grid
	    		isNeighbor = (i != x || j != y) && i >= 0 && i < 20 
	    					 && j >= 0 && j < 20;
	    		
	    		if (isNeighbor && currentGen[i][j] == 'X') {
	    			aliveNeighbors++;
	            }
	        }
	    }
	       
	    // if currently alive and has exactly 2 or 3 neighbors, alive in nextGen
	    if (currentGen[x][y] == 'X' && (aliveNeighbors == 2 || 
	    	aliveNeighbors == 3)) {
	    	return true;
	    }
	       
	    // if currently dead but has exactly 3 neighbors, alive in nextGen
	    if (currentGen[x][y] == 'O' && aliveNeighbors == 3) {
	    	return true;
	    }
	       
	    return false;
	}
	   
	public void run() {
		// determine if cell will be alive in the next generation
	    boolean isAlive = aliveInNextGen();
	       
	    if (isAlive)
	    	nextGen[x][y] = 'X';
	    else
	        nextGen[x][y] = 'O';
		}
	}
