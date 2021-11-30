package assignment5_electionStats_GutmannNierman;

public class RaisedRepublicanDetermineElectoral implements IDetermineElectoral {
	
	private int counter = 0;
	
	public int determineElectoral (State stats, int dem, int rep) {
		
		counter++;
		
		if(counter == 1) {
			
			return 1;
		}
		
		else if(dem > rep) {
			return -1;
		}
		
		else if (rep > dem ){
			return 1;
		}
		
		//split the electoral votes in half if there is a tie
		else {
			return 0;
		}

	}

}
