import java.io.File;
import java.util.Scanner;

public class ReadFile {
	public char currentGen[][] = new char[20][20];
	public char nextGen[][] = new char[20][20];
	int generation;
	
	int getGeneration() {
		return generation;
	}
	
	public ReadFile() {
		int index = 0;

		try {
			// open file
			File file = new File("Start.txt");
			Scanner sc = new Scanner(file);
			
			// read file
			while(sc.hasNext()) {
				String str = sc.next();
				if(str.length() == 20) {
					for(int j=0; j<20; j++) {
						currentGen[index][j] = str.charAt(j);
					}
					index++;
				}
				else {
					generation = Integer.parseInt(str);
					break;
				}
			}
			sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
